import React from "react";
import ImageMapper from 'react-image-mapper';
import tokenservice from '../services/tokenservice';
import APIService from '../services/APIService';
import logo from '../blank.png';


class Thing extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            map: {
                name: 'logo', areas: [
                    { _id: 'five', shape: 'poly', coords: [100, 100, 105, 105, 105, 505, 100, 500], preFillColor: 'black' },
                    { _id: 'seven', shape: 'poly', coords: [100, 100, 105, 105, 505, 105, 500, 100], preFillColor: 'black' },
                    { _id: 'one', shape: 'circle', coords: [100, 100, 100], preFillColor: 'blue', title: 'Sports' },
                    { _id: 'teo', shape: 'circle', coords: [100, 500, 100], preFillColor: 'green', title: 'Excercise & Wellness' },
                    { _id: 'three', shape: 'circle', coords: [500, 100, 100], preFillColor: 'pink', title: 'Outdoor & Recreation' }
                ]
            },
            tagArray: [],
            start: 2
        }
    }

    checkCollision(mapx, int) {
        for (var i = 0; i < mapx.length; i++) {
            if (i !== int) {
                var a = mapx[i].coords[0];
                var b = mapx[i].coords[1];
                var c = mapx[i].coords[2];
                var x = mapx[int].coords[0] - a;
                var y = mapx[int].coords[1] - b;
                var r = mapx[int].coords[2] + c;
                if (Math.sqrt(x * x + y * y) < r) {
                    return true;
                }
            }
        }
        return false;
    }

    generateCoords = () => {
        this.props.forceRender();
        var mapx = [];
        let tags = tokenservice.getTags();
        const screenx = window.innerWidth - 800;
        const screeny = window.innerHeight - 500;
        for (let i = 0; i < tags.length; i++) {
            const randx = 150 + Math.random() * screenx;
            const randy = 150 + Math.random() * screeny;
            const rands = 80 + Math.random() * 40;
            mapx.unshift({ _id: i.toString(), shape: 'circle', coords: [randx, randy, rands], preFillColor: 'rgb(65, 136, 250)', title: tags[i].tagName });
            while (this.checkCollision(mapx, 0)) {
                const randx = 150 + Math.random() * screenx;
                const randy = 150 + Math.random() * screeny;
                const rands = 80 + Math.random() * 40;
                mapx[0].coords = [randx, randy, rands];
            }
        }

        let x = mapx.length - 1;
        for (let i = x; i < 2*x; i++){
            mapx.unshift({ _id: (i+1).toString(), shape: 'poly', coords: [mapx[x].coords[0], mapx[x].coords[1], mapx[x].coords[0] + 5, mapx[x].coords[1] + 5,
            mapx[x-1].coords[0] + 5, mapx[x-1].coords[1] + 5, mapx[x-1].coords[0], mapx[x-1].coords[1]], preFillColor: 'black' })
        }
        this.setState({ map: { name: 'logo', areas: mapx }, start: 0 }, () => {this.props.forceRender()});
    }

    onclick = (area) => {
        var clicked = area.title;
        var tagArray = tokenservice.getTags();
        console.log(tagArray)
        let match;
        tagArray.forEach(tag => {
            let str = tag.tagName;
            if (str === clicked)
                match = tag;
        })
        console.log(match)
        APIService.postTagsForItems(match)
        .then(() => {
            APIService.postTagsForTags(match)
            .then(() => this.generateCoords());
        });
        //update state?
        
        this.generateCoords();
    }

    nameRender() {
        let areaDraw = [];
        let mapx = this.state.map.areas;
        for (let x = this.state.start; x < mapx.length; x++) {
            areaDraw.push(mapx[x])
        }
        let x = 0;
        return areaDraw.map(label => {
            let style = {
                top: label.coords[1] - 20 - (x * 50),
                left: label.coords[0] - 50
            }
            x++;
            return <div className="name" style={style}>{label.title}</div>
        })
    }

    test(){
        return <ImageMapper className="map" src={logo} map={this.state.map} onClick={area => this.onclick(area)} width={window.innerWidth - 520} height={window.innerHeight - 150} alt="alt" />
    }

    render() {
        return <div>
            {this.test()}
            <div className="text">
                {this.nameRender()}
            </div>
        </div>
    }

    componentDidMount(){
        this.generateCoords();
    }

}

export default Thing;

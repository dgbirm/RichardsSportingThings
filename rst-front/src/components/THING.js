import React from "react";
import ImageMapper from 'react-image-mapper';

import logo from '../blank.png';

class Thing extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            map: {
                name: 'logo', areas: [
                    { _id: 'five', shape: 'poly', coords: [100, 100, 105, 105, 105, 505, 100, 500], preFillColor: 'black' },
                    { _id: 'six', shape: 'poly', coords: [100, 100, 105, 105, 505, 505, 500, 500], preFillColor: 'black' },
                    { _id: 'seven', shape: 'poly', coords: [100, 100, 105, 105, 505, 105, 500, 100], preFillColor: 'black' },
                    { _id: 'one', shape: 'circle', coords: [100, 100, 100], preFillColor: 'blue', title: 'volleyball' },
                    { _id: 'teo', shape: 'circle', coords: [100, 500, 100], preFillColor: 'green', title: 'clothes' },
                    { _id: 'three', shape: 'circle', coords: [500, 100, 100], preFillColor: 'pink', title: 'balls' },
                    { _id: 'four', shape: 'circle', coords: [500, 500, 100], preFillColor: 'orange', title: 'nets' },
                ]
            }
        }
    }
    //use use image height and width

    checkCollision(mapx, int) {
        for (var i = 3; i < 7; i++) {
            if (i !== int) {
                var a = mapx.areas[i].coords[0];
                var b = mapx.areas[i].coords[1];
                var c = mapx.areas[i].coords[2];
                var x = mapx.areas[int].coords[0] - a;
                var y = mapx.areas[int].coords[1] - b;
                var r = mapx.areas[int].coords[2] + c;
                if (Math.sqrt(x * x + y * y) < r) {
                    return true;
                }
            }
        }
        return false;
    }

    generateCoords = () => {
        var mapx = this.state.map;
        const screenx = window.innerWidth - 800;
        const screeny = window.innerHeight - 500;
        for (var i = 3; i < 7; i++) {
            do {
                const randx = 150 + Math.random() * screenx;
                const randy = 150 + Math.random() * screeny;
                const rands = 80 + Math.random() * 40;
                mapx.areas[i].coords = [randx, randy, rands];
            } while (this.checkCollision(mapx, i));
        }
        mapx.areas[0].coords = [mapx.areas[3].coords[0], mapx.areas[3].coords[1], mapx.areas[3].coords[0] + 5, mapx.areas[3].coords[1] + 5,
        mapx.areas[4].coords[0] + 5, mapx.areas[4].coords[1] + 5, mapx.areas[4].coords[0], mapx.areas[4].coords[1]];
        mapx.areas[1].coords = [mapx.areas[3].coords[0], mapx.areas[3].coords[1], mapx.areas[3].coords[0] + 5, mapx.areas[3].coords[1] + 5,
        mapx.areas[5].coords[0] + 5, mapx.areas[5].coords[1] + 5, mapx.areas[5].coords[0], mapx.areas[5].coords[1]];
        mapx.areas[2].coords = [mapx.areas[3].coords[0], mapx.areas[3].coords[1], mapx.areas[3].coords[0] + 5, mapx.areas[3].coords[1] + 5,
        mapx.areas[6].coords[0] + 5, mapx.areas[6].coords[1] + 5, mapx.areas[6].coords[0], mapx.areas[6].coords[1]];
 
        this.setState({ map: mapx })
    }

    onclick = () => {

        this.generateCoords();
    }

    render() {
        const style1 = {
            top: this.state.map.areas[3].coords[1] -20,
            left: this.state.map.areas[3].coords[0] - 50
        }
        const style2 = {
            top: this.state.map.areas[4].coords[1] -70,
            left: this.state.map.areas[4].coords[0] - 50
        }
        const style3 = {
            top: this.state.map.areas[5].coords[1] -120,
            left: this.state.map.areas[5].coords[0] - 50
        }
        const style4 = {
            top: this.state.map.areas[6].coords[1] -170,
            left: this.state.map.areas[6].coords[0] - 50
        }
        return <div>
            <ImageMapper className="map" src={logo} map={this.state.map} onClick={() => { this.onclick() }} width={window.innerWidth - 400} height={window.innerHeight - 155} alt = "alt"/>
            <div className="text">
               <div className="name" style = {style1}>{this.state.map.areas[3].title}</div>
               <div className="name" style = {style2}>{this.state.map.areas[4].title}</div>
               <div className="name" style = {style3}>{this.state.map.areas[5].title}</div>
               <div className="name" style = {style4}>{this.state.map.areas[6].title}</div>
            </div>
        </div>
    }

}

export default Thing;
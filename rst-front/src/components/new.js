import React from "react";
import ImageMapper from 'react-image-mapper';
import tokenservice from '../services/tokenservice';
import APIService from '../services/APIService';
import logo from '../blank.png';
import styled, { css, keyframes } from 'styled-components'

class New extends React.Component {
    constructor(props) {
        super(props);

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
                if (Math.sqrt(x * x + y * y) < r + 30) {
                    return true;
                }
            }
        }
        return false;
    }

    onClick = (name) => {
        name.preventDefault();
        let tag = name.target.value;
        var tagArray = tokenservice.getTags();
        let match;
        tagArray.forEach(tg => {
            let str = tg.tagName;
            if (str === tag)
                match = tg;
        });
        APIService.postTagsForTags(match)
            .then(() => {
                this.props.forceRender();
                APIService.postTagsForItems(match)
                    .then(() => this.props.forceRender())
            });
    }

    draw() {
        var mapx = [];
        let tags = tokenservice.getTags();
        const screenx = window.innerWidth / 2;
        const screeny = window.innerHeight - 500;
        let z = tags.length;
        for (let i = 0; i < z; i++) {
            const randx = 550 + Math.random() * screenx;
            const randy = 150 + Math.random() * screeny;
            const rands = 100 + Math.random() * 20;
            mapx.push({ coords: [randx, randy, rands], title: tags[i].tagName });
            while (this.checkCollision(mapx, i)) {
                const randx = 550 + Math.random() * screenx;
                const randy = 150 + Math.random() * screeny;
                const rands = 80 + Math.random() * 40;
                mapx[i].coords = [randx, randy, rands];
            }
        }
        let mapy = { name: 'lines', areas: [] };
        console.log(mapx)
        let left = mapx[0].coords[0];
        let top = mapx[0].coords[1];
        let x = mapx.map(i => {
            var spin = keyframes`from { top: ${top}px; left: ${left}px; }
            to   { top: ${i.coords[1]}px; left: ${i.coords[0]}px; }`;
            let Anim = styled.button`animation: ${spin} 1s linear`;
            let style = {
                width: 2 * i.coords[2],
                height: 2 * i.coords[2],
                top: i.coords[1],
                left: i.coords[0]
            }
            mapy.areas.push({
                _id: mapy.areas.length.toString(),
                shape: 'poly',
                coords: [i.coords[0] - 450, i.coords[1], i.coords[0] - 450, i.coords[1], mapx[0].coords[0] - 450, mapx[0].coords[1], mapx[0].coords[0] - 450, mapx[0].coords[1]],
                preFillColor: 'black'
            })
            return <Anim style={style} onClick={this.onClick} className="newName " value={i.title}>{i.title}</Anim>
        })
        let ret = <div>
            <ImageMapper className="map" src={logo} map={mapy} width={window.innerWidth - 520} height={window.innerHeight - 150} alt="alt" />
            {x}
        </div>
        return ret;
    }

    render() {

        return <div >
            {this.draw()}
        </div>
    }


}

export default New;
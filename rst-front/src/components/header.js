import React from "react";
import tokenservice from '../services/tokenservice';
import APIService from '../services/APIService';
import logo from '../images/logo.png'

class Header extends React.Component {


    search = (e) => {
        e.preventDefault();
        let form = document.getElementById("search").value;
        let x = { tagName: form };
        APIService.postTagsForTags(x)
        .then(() => {
            APIService.postTagsForItems(x)
                .then(() => this.props.forceRender());
        });

    }

    render() {
        return <header>
            <img className="logo" src={logo} width='100px'/>
            <h1>Richards Sporting Things</h1>
            <form onSubmit={this.search}>
                <input type="text" placeholder="Search" onSubmit={this.search} id="search" />
                <input type="submit" className="submit"></input>
            </form>
        </header>
    }

}

export default Header;
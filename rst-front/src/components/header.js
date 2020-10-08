import React from "react";
import tokenservice from '../services/tokenservice';
import APIService from '../services/APIService';

class Header extends React.Component {


    search = (e) => {
        e.preventDefault();
        let form = document.getElementById("search").value;
        console.log(form);
        let tags = [tokenservice.getTags()];
        tags.push(form);
        tokenservice.saveTags(tags);

    }

    render() {
        return <header>
            <h1>Richards Sporting Things</h1>
            <form onSubmit={this.search}>
                <input type="text" placeholder="Search" onSubmit={this.search} id="search"/>
                <input type="submit"></input>
            </form>
        </header>
    }

}

export default Header;
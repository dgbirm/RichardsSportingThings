import React from 'react';
import tokenservice from "../services/tokenservice";

class Items extends React.Component{
    exp = {
        updateItems(){
    
        }
    }


    render() {
        return <div className= "items">
            {tokenservice.getItems()}
        </div>
    }

}



export default Items;
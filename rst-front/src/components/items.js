import React from 'react';
import tokenservice from "../services/tokenservice";
import Item from './item';

class Items extends React.Component{
    exp = {
        updateItems(){
    
        }
    }


    constructor (props) {
        super(props);
        this.state = {array: [{
            name: 'P-TEX Ankle Brace With Stabilizers',
            imageURL:'https://dks.scene7.com/is/image/dkscdn/17PTEUPTXNKLBRCWSSPM_is/?$DSG_ProductCard$',
            price: '$1000'
        }, {
            name: 'Spalding King of the Beach USA Replica Outdoor Volleyball',
            imageURL: 'https://dks.scene7.com/is/image/dkscdn/16SPLUSPLDNGKNGFTVLL_Black_White_is/?$DSG_ProductCard$',
            price: '$24.99'
        }, {
            name: 'Wilson Graffiti Outdoor Volleyball',
            imageURL: 'https://dks.scene7.com/is/image/dkscdn/16WILUGRFFTBLLXXXVLL_Multi_is/?$DSG_ProductCard$',
            price: '$19.99'
        }, {
            name: 'Tandem Round Volleyball Blocking Pads',
            imageURL: 'https://dks.scene7.com/is/image/dkscdn/17TANURNDVBBLCKNGVLL_is/?$DSG_ProductCard$',
            price: '$49.99'
        }]}
    }

    render() {
        let loopy = this.state.array.map(item => 
            <Item name={item.name}
                price={item.price}
                imageURL={item.imageURL}
            />
        )
        return <div className= "items">
            <h1>Our top Items!</h1> {
                loopy
            }
        </div>
    }

}



export default Items;
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
            itemName: 'P-TEX Ankle Brace With Stabilizers',
            imageUrl:'https://dks.scene7.com/is/image/dkscdn/17PTEUPTXNKLBRCWSSPM_is/?$DSG_ProductCard$',
            price: '$1000'
        }, {
            itemName: 'Spalding King of the Beach USA Replica Outdoor Volleyball',
            imageUrl: 'https://dks.scene7.com/is/image/dkscdn/16SPLUSPLDNGKNGFTVLL_Black_White_is/?$DSG_ProductCard$',
            price: '$24.99'
        }, {
            itemName: 'Wilson Graffiti Outdoor Volleyball',
            imageUrl: 'https://dks.scene7.com/is/image/dkscdn/16WILUGRFFTBLLXXXVLL_Multi_is/?$DSG_ProductCard$',
            price: '$19.99'
        }, {
            itemName: 'Tandem Round Volleyball Blocking Pads',
            imageUrl: 'https://dks.scene7.com/is/image/dkscdn/17TANURNDVBBLCKNGVLL_is/?$DSG_ProductCard$',
            price: '$49.99'
        }, {
            itemName: 'Spalding King of the Beach USA Replica Outdoor Volleyball',
            imageUrl: 'https://dks.scene7.com/is/image/dkscdn/16SPLUSPLDNGKNGFTVLL_Black_White_is/?$DSG_ProductCard$',
            price: '$24.99'
        }, {
            itemName: 'Wilson Graffiti Outdoor Volleyball',
            imageUrl: 'https://dks.scene7.com/is/image/dkscdn/16WILUGRFFTBLLXXXVLL_Multi_is/?$DSG_ProductCard$',
            price: '$19.99'
        }, {
            itemName: 'Tandem Round Volleyball Blocking Pads',
            imageUrl: 'https://dks.scene7.com/is/image/dkscdn/17TANURNDVBBLCKNGVLL_is/?$DSG_ProductCard$',
            price: '$49.99'
        }]}
    }

    render() {
        let x = tokenservice.getItems();
        let loopy = tokenservice.getItems().map(item => 
            <Item name={item.itemName}
                price={item.price}
                imageURL={item.imageUrl}
            />
        )
        return <div className= "items">
            <h1>Our top Items</h1> {
                loopy
            }
        </div>
    }

}



export default Items;
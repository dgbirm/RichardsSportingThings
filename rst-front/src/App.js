import React from 'react';
import Header from './components/header';
import Thing from './components/THING';
import Items from './components/items';
import tokenservcice from './services/tokenservice';
import './App.css';
import tokenservice from './services/tokenservice';




class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = { dummy: 'dummy' }
    tokenservcice.saveItems([{ name: 'name' }]);
    tokenservice.clearTags();
    tokenservice.saveTags([
      {
        "tagId": 1,
        "tagName": "Sports",
        "isFinal": 0,
        "level": 1,
        "precedingnode": null
      }, {
        "tagId": 26,
        "tagName": "Outdoor & Rectreation",
        "isFinal": 0,
        "level": 1,
        "precedingnode": null
      }, {
        "tagId": 25,
        "tagName": "Exercise & Wellness",
        "isFinal": 0,
        "level": 1,
        "precedingnode": 1
      }
    ])
    tokenservice.saveItems([{
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
  }])
  }

  forceRender = () => {
    this.setState({ dummy: 'dummy' });
  }



  render() {
    return (
      <div className="App">
        <Header />
        <div className="body">
          <Items />
          <div>
            <Thing forceRender={this.forceRender} />
            <section className="temp">Temporary thing</section>
          </div>
        </div>
      </div>
    );
  }
}

export default App;

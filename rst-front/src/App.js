import React from 'react';
import Header from './components/header';
import Thing from './components/THING';
import Items from './components/items';
import tokenservcice from './services/tokenservice';
import './App.css';
import tokenservice from './services/tokenservice';




class App extends React.Component{
  constructor(props){
    super(props);
    this.state = {dummy: 'dummy'}
    tokenservcice.saveItems([{name:'name'}])

  }

  forceRender =() =>{
    let i = [tokenservice.getItems()];
    i.push({name: 'new'});
    tokenservcice.saveItems(i);
    this.setState({dummy: 'dummy'});
  }

 

  render(){
    return (
      <div className="App">
        <Header />
        <div className="body">
          <Items />
          <div>
            <Thing forceRender={this.forceRender}/>
            <section className="temp">Temporary thing</section>
          </div>
        </div>
      </div>
    );
  }
}

export default App;

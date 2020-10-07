import React from 'react';
import Header from './components/header';
import Thing from './components/THING';
import Items from './components/items';
import './App.css';

function App() {
  return (
    <div className="App">
      <Header />
      <div className="body">
        <Items />
        <div>
          <Thing />
          <section className="temp">Temporary thing</section>
        </div>
      </div>
    </div>
  );
}

export default App;

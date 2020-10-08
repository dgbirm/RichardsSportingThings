import React from 'react';

class Item extends React.Component {

    name;
    price;
    imageURL;

    render() {
        return <button className='item'>
            <div>
                <h4>{this.props.name}</h4>
                {this.props.price}
            </div>
            <img src={this.props.imageURL} height='150px' />
        </button>
    }
}

export default Item;

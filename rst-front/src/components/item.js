import React from 'react';

class Item extends React.Component {

    name;
    price;
    imageURL;

    render () { 
        return <div className='item'> 
            <h4>{this.props.name}</h4>
            <p><img src={this.props.imageURL} height='100px' />
            {this.props.price}
            </p>
            <hr />
        </div>
    }
}

export default Item;

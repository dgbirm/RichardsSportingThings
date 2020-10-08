

const tokenservice = {

    saveTags(tags){
        window.localStorage.setItem('tags', JSON.stringify(tags));
    },
    getTags(){
        return JSON.parse(window.localStorage.getItem('tags'));
    },
    clearTags(){
        window.localStorage.removeItem('tags');
    },
    saveItems(items){
        window.localStorage.setItem('items', JSON.stringify(items));
    },
    getItems(){
        return JSON.parse(window.localStorage.getItem('items'));
    },
    clearItems(){
        window.localStorage.removeItem('items');
    }
}

export default tokenservice;
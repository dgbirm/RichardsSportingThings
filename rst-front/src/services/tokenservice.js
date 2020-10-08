

const tokenservice = {

    saveTags(tags){
        window.localStorage.setItem('tags', tags);
    },
    getTags(){
        return window.localStorage.getItem('tags');
    },
    clearTags(){
        window.localStorage.removeItem('tags');
    },
    saveItems(items){
        window.localStorage.setItem('items', items);
    },
    getItems(){
        return window.localStorage.getItem('items');
    },
    clearItems(){
        window.localStorage.removeItem('items');
    }
}

export default tokenservice;
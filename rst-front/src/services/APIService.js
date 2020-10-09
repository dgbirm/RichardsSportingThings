import tokenservice from "./tokenservice";

URL = "http://localhost:8080";

const APIService = {

    postTagsForTags(input) {
        const postOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify([input])
        }
        /* Body Example
            {
                tags: ['sports', 'volleyball', 'balls]
            }
        */
        return fetch(URL + '/tags', postOptions)
            .then(res => res.json())
            .then(res => {
                if (res.length !== 0) {
                    res.unshift(input);
                    tokenservice.saveTags(res);

                    return res;
                }

            });
    },

    postTagsForItems(input) {
        const postOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify([input])
        }
        /* Body Example
            {
                tags: ['sports', 'volleyball', 'balls]
            }
        */
        return fetch(URL + '/tagitems', postOptions)
            .then(res => res.json())
            .then(res => {
                if (res.length !== 0) {
                    tokenservice.saveItems(res);  
                    return res;                  
                }
            });
    }

}

export default APIService;
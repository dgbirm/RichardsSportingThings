
URL = "http://localhost:8080";

const APIService  ={

    postTagsForTags(input){
        const postOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({tags: input})
        }
        /* Body Example
            {
                tags: ['sports', 'volleyball', 'balls]
            }
        */ 
       return fetch(URL, postOptions)
            .then(res => res.json())
            .then (res => {

            });
    },

    postTagsForItems(input){
        const postOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({tags: input})
        }
        /* Body Example
            {
                tags: ['sports', 'volleyball', 'balls]
            }
        */ 
       return fetch(URL, postOptions)
            .then(res => res.json())
            .then (res => {

            });
    }

}

export default APIService;
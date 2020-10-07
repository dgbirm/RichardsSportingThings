
URL = "http://localhost:8080";

class APIService  {

    postTags(input){
        const postOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({tags: input})
        }
        /* Body Example
            {
                tags: ['sports', 'volleyball', 'balls]
            }
            Expected return
            {
                tags: [],
                items: [
                    {some item and info},
                    {etc}
                ]
            }
        */ 
       return fetch(URL, postOptions)
            .then(res => {

            });
    }

}

export default APIService;
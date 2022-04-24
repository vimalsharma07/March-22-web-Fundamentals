


const mypromise=fetch("https://reqres.in/api/users?page=2");



mypromise.then( (data) => {return data.json()} )

.then((result) => {
    
    const uservimal = result.data
    for(let i=0; i<uservimal.length;i++){
       const card=  document.querySelector(".container")
       card.innerHTML+=` <h4 class=" firstname">${uservimal[i].first_name}</h4>
       <h4 class="lastname">${uservimal[i].last_name}</h4>
       <p class="email">${uservimal[i].email}</p>
       <img src='${uservimal[i].avatar}'alt="" id="image">`
    }

})
.catch( error => console.log("got some error - ", error))


const input = document.querySelector("#search-input")
const container = document.querySelector(".container")
const form = document.querySelector("form")
const icon = document.querySelector("#icon");


form.addEventListener('submit' ,fetchdata);
icon.addEventListener('click',fetchdata);

function fetchdata(){
    const baseurl=`https://api.edamam.com/search?q=&app_id=a6d62631&app_key=db65596bbd8f8d675d159c99933c8890&from=0&to=20`

fetch(baseurl)
.then((data)=>{
    return data.json()
} ).then((result)=>{
    console.log (data.json())
})



}



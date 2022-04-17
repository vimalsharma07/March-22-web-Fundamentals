const userList = [
  {
    id: 1,
    email: "george.bluth@reqres.in",
    first_name: "George",
    last_name: "Bluth",
    avatar: "https://reqres.in/img/faces/1-image.jpg",
  },
  {
    id: 2,
    email: "janet.weaver@reqres.in",
    first_name: "Janet",
    last_name: "Weaver",
    avatar: "https://reqres.in/img/faces/2-image.jpg",
  },
  {
    id: 3,
    email: "emma.wong@reqres.in",
    first_name: "Emma",
    last_name: "Wong",
    avatar: "https://reqres.in/img/faces/3-image.jpg",
  },
  {
    id: 4,
    email: "eve.holt@reqres.in",
    first_name: "Eve",
    last_name: "Holt",
    avatar: "https://reqres.in/img/faces/4-image.jpg",
  },
  {
    id: 5,
    email: "charles.morris@reqres.in",
    first_name: "Charles",
    last_name: "Morris",
    avatar: "https://reqres.in/img/faces/5-image.jpg",
  },
  {
    id: 6,
    email: "tracey.ramos@reqres.in",
    first_name: "Tracey",
    last_name: "Ramos",
    avatar: "https://reqres.in/img/faces/6-image.jpg",
  },
];


function fun1() {
  
    for (let i = 0; i < userList.length; i++) {
        const creatdiv = document.createElement('div');
        creatdiv.innerHTML = `
            <img src = '${userList[i].avatar}' />
            <h3>First Name: ${userList[i].first_name}</h3> 
            <h3>Last Name: ${userList[i].last_name}</h3>
            <p>${userList[i].email}</p>
        `;
        
        creatdiv.style.border = '2px solid red';
        creatdiv.style.width = '200px';
        creatdiv.style.margin = '0px 15px';
        creatdiv.style.boxShadow = '1px 1px 8px black';
        creatdiv.style.borderRadius = '10px';

        let getcontainer = document.getElementById('container');
        getcontainer.appendChild(creatdiv);

        
    }
}

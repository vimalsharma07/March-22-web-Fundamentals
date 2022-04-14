const nameElement = document.getElementById("name");
const email = document.getElementById("email");
const password = document.getElementById("password");
const confirmPassword = document.getElementById("confirm-password");
const required = document.querySelector("small");

const mandet = document.querySelector("#small1");

const smallpass = document.querySelector("#small2");

const qualification = document.getElementById("highestqualification");

const entire = document.querySelector("form");

entire.addEventListener("submit", submitForm);





// nameElement.value - gives me the value inside the input element

function submitForm(virat){
  virat.preventDefault()

  if(nameElement.value === ""){
      console.log("Name is Empty");
      nameElement.classList = "error";


     required.classList = "display";
  }else{
      nameElement.classList = "success";
  }

  if(email.value === ""){
      console.log ("email is Empty");
      email.classList = "error";
      mandet.classList = "display";

  } // add else conditions

  if(password.value === "" ){
      console.log("password is Empty");
      password.classList = "error";
      smallpass.classList = "display";

  }
  if(confirmPassword.value ===""){
    console.log("confirm password is Empty");
    confirmPassword.classList = "error";

}
  
if(password.value === confirmPassword.value && nameElement.value!="" && email.value!=""&&password.value!="" )

{
    document.querySelector('.container').innerHTML = `
    <h1>Thanks for submitting Vimal's Page</h1>
    <img src="https://wallpaperaccess.com/full/3635104.jpg" width="300px height="400px>
    `
}


const characters = ['@', '$', '#', "!", 'A', 'B']
let bhavs=0
for( i=0;i<characters.length;i++){
    if(password.value.includes(characters[i])===false)
    bhavs++
    console.log(characters[i], " - ", bhavs)



}
}


'use strict';  
 const todos=[]
 
 
 const input = document.querySelector('input');
 const button=document.querySelector('button');
 const todoList=document.querySelector('.todo-items');
 button.addEventListener('click',getvalue);
 const form = document.querySelector('form');
 form.addEventListener('ckick',getvalue)
  function getvalue(event){
    event.preventDefault()
 const todositems={
    id: Date.now(),
    task:input.value
 }
 todos.push(todositems);
 
 displayscreen()
input.value=``
 }
 function displayscreen(){
     for(let i=0;i < todos.length; i++){
         const element=todos[i];
         todoList.push(element)
     element.addEventListener('click', ()=>{
         element.parentElement.style.opacity=0;
         setTimeout(()=>{
             element.addEventListener.style.display=none;
         }, 500);
     })

     }
    input.value=''
         
 }


 
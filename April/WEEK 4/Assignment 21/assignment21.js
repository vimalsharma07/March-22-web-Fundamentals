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
     
     const itemHTMl = 
        `
            <div class="todo-item">
                ${element.task} 
                <button onclick="deleteItem(${element.id})">Delete</button>
            </div>
        `
        todoList.innerHTML = todoList.innerHTML + itemHTMl
 }
 }
 function deleteItem(id){
    let itemIndex = -1
    for (let i = 0; i < todos.length; i++) {
        const element = todos[i];
        if(element.id === id){
            itemIndex = i
        }
    }

    todos.splice(itemIndex, 1)

    displayscreen()
} 
 
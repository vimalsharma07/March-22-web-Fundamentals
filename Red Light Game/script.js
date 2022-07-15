


const character = document.querySelector("#character")

const block = document.querySelector("#block");
var counter=0;

function jump(){
    if(character.classList!="animate"){
    
    character.classList.add("animate");
}
    setTimeout(function(){
    character.classList.remove("animate")
    },500);
}

var checkDead = setInterval(function() {
    let characterTop = parseInt(window.getComputedStyle(character).getPropertyValue("top"));
    let blockLeft = parseInt(window.getComputedStyle(block).getPropertyValue("left"));
    if(blockLeft<50 && blockLeft>-20 && characterTop>=430){
        block.style.animation = "none";
        alert("Game Over. score: "+Math.floor(counter/100));
        counter=0;
        block.style.animation = "block 1s infinite linear";
    }else{
        counter++;
        document.getElementById("scoreSpan").innerHTML = Math.floor(counter/100);
    }
}, 10);
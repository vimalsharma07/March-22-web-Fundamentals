 const allbutton= document.querySelectorAll('.buttons');

const output=document.getElementById('outputscreen');


function display(num){
    output.value= output.value+num;
}

function calculate(){
    try{
        output.value=eval(output.value);
    }
    catch(err){
alert('please inter valid input')
    }

    }

    function deletea(){
        output.value=output.value.slice(0,-1);
    }
    function clearall(){
        output.value=""
    }
    function percentage(per){
        output.value=  output.value/100;
    }


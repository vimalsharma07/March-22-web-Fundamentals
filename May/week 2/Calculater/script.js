 const allbutton= document.querySelectorAll('.buttons');

const output=document.getElementById('outputscreen');


function display(num){
    output.value+=num;
}

function calculate(){
    try{
        output.value=eval(output.value);
    }
    catch(err){
alert('invalid output')
    }

    }

    function deletea(){
        output.value=output.value.slice(0,-1);
    }
    function clearall(){
        output.value=""
    }


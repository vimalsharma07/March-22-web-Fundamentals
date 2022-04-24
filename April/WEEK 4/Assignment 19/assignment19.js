const x=[11,21,30,41,51]
const y=[10,13,16,19,22]
const z=[9,19,7,18,34]

//make a function which will divide each element of array by 2 and save the values

function divideby2(vimal){
    let result=[]
    for(let i=0; i<vimal.length;i++){
        const vibha=vimal[i]/2;
        result.push(vibha);
    }
return result
    }
const a=divideby2(x);
const b=divideby2(y);
const c=divideby2(z);
console.log(a,b,c);

 const d=document.createElement('p');
 const e=document.querySelector('h1');
 const f=document.createElement('h3')
 e.innerText=a;
 d.innerText=b;
f.innerText=c;
 e.appendChild(d)
 e.appendChild(f)
 const students=[
                    {name:"vimal",marks:47},
                    {name:"sonu",marks:52},

                    {name:"bhavana",marks:48},

                    {name:"lavi",marks:43},
                    {name:"davesh",marks:44},



 ]



function passedstudents(result){
    const obj=[]
    for(let i=0;i<result.length;i++){
        if(result[i].marks<50){
            const final={
                name:result[i].name,
                marks:result[i].marks+5,
            }
            obj.push(final)
         } else{
             obj.push(result[i]);
            }

            }
            for(let i=0;i<obj.length;i++){
                if(obj[i].marks>50)
                console.log(obj[i].name,"has been passed")
                else{
                    console.log(obj[i].name,"has been failed")
                }
            }
        }
        passedstudents(students)
    

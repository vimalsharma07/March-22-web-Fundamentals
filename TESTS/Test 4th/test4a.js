
        const getbutton = document.getElementById('button');
        getbutton.addEventListener('click', fun1);

        function fun1() {
            const getInsertValue = document.getElementById('insert-anything');
            const getData = getInsertValue.value;
            alert(getData);
        }
    
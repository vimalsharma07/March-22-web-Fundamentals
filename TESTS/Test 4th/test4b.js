
        let firstNum = prompt("Enter Your First Number");
        const getFirstPara = document.getElementById('first-p');
        getFirstPara.innerText = firstNum;

        let secondNum = prompt("Enter Your Second Number");
        const getSecondPara = document.getElementById('second-p');
        getSecondPara.innerText = secondNum;

        let thirdNum;

        thirdNum = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;

        const getThirdPara = document.getElementById('third-p');
        getThirdPara.innerText = firstNum;
        const getFourPara = document.getElementById('four-p');
        getFourPara.innerText = secondNum;
    
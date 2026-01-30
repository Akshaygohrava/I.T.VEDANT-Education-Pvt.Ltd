

// I M Creating Input Type Calculator 
function add() {
    var input1 = document.getElementById("input1").value;
    var input2 = document.getElementById("input2").value;
    var output = document.getElementById("output");

    var num1 = parseFloat(input1) || 0;
    var num2 = parseFloat(input2) || 0;
    output.textContent = `Addition is : ${num1 + num2}`;;
}

const sub = () => {
    var input1 = document.getElementById("input1").value;
    var input2 = document.getElementById("input2").value;
    var output = document.getElementById("output");

    var num1 = parseFloat(input1) || 0;
    var num2 = parseFloat(input2) || 0;
     output.textContent = `Subtraction is : ${num1 - num2}`;
}

function multi() {
    var input1 = document.getElementById("input1").value;
    var input2 = document.getElementById("input2").value;
    var output = document.getElementById("output");

    var num1 = parseFloat(input1) || 0;
    var num2 = parseFloat(input2) || 0;
   output.textContent = `Multiplication is : ${num1 * num2}`;
}

const div = () => {
    var input1 = document.getElementById("input1").value;
    var input2 = document.getElementById("input2").value;
    var output = document.getElementById("output");

    var num1 = parseFloat(input1) || 0;
    var num2 = parseFloat(input2) || 0;
   output.innerText = `Divsion is : ${num1 / num2}`;
}






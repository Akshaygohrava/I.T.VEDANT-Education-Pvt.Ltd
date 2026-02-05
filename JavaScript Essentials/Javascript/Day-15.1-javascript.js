// const a = (a,b) => a + b;
// a(3,5);


function isprime() {
    let input = document.getElementById("input").value;
    let input1 = parseFloat(input);
    let output = document.getElementById("output");

    if (isprime(input1)) {
        output.innerText = "The Number is Prime";
    } else {
        output.innerText = "The Number is not prime";
    }

    
}









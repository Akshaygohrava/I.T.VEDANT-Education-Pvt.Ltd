const isPrime=(n)=> {
  let count = 0;
  for (let i = 1; i <= n; i++) {
    if (n % i == 0) {
      count++;
    }
  }

  return count == 2;
}



function checkPrime(){

const in1=document.getElementById("inputbox1")
let value =parseInt(in1.value)
const p =document.getElementById("primePara")
if(isPrime(value)){
    p.textContent="number is prime "

}
else{
    p.textContent="Number is not prime"
}
}



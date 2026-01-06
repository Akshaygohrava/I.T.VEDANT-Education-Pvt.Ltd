
// // Nested If Else 

const Age = prompt("Enter Your Age :");

if (Age => 18) {
    alert("You Are Eligible to vote !");
} else {
    if (Age < 18) {
        alert("You Are Not Eligible to Vote ! ")
    } else {
        alert("Age is Not Valid");
    }
}

// If Else Ladder 

const Num = prompt("Enter Any Number");
if (Num < 0) {
    alert("Number Is Nagative");
} 
else if (Num = 0) {
    alert("Number is zero !");
}
else if (Num => 18) {
    alert("Number is Above valid Age !");
}
else if (Num => 100) {
    alert("Number is Above 100 , Not Valid !");
}
else {
   alert("Its Not A Number");
}

// Condition If else 
const marks = prompt("Enter Your Marks :");

if (marks >= 76 && marks <= 100) {
    alert("Your Grade Is A+")
}
else if (marks >= 60 && marks <= 75) {
    alert("Your Grade Is A");
}
else if (marks => 35 && marks <= 50) {
    alert("Your Grade is B");
}
else if (marks <= 34) {
    alert("Sorry , You Are Fail !");
}
else {
   alert("Not A Valid Marks ");
}




// Programm to find Greatest of Three Number !

// let a = 100, b = 300, c = 600;
// or
let a = prompt("Enter A Number of A Variable !");
let b = prompt("Enter A Number of B Variable !");
let c = prompt("Enter A Number of C Variable !");


if (a > b && a > c) {
    alert("A is Greater !");
}
 else if (b > c) {
    alert("B is Greater !");
 }
else {
    alert("C is Greater !");
}




// Swicth Case Statement :
const age1 = prompt("Enter You Switch Case age :");
switch (age1) {
    case age1 >= 18:
        alert("Your Age is Valid !");
        break;
    case age1 < 18: 
        alert("You are at less than 18, not Eligible !");
        break;
    default:
        alert("Not in Number !");
        break;
}
// not working , fix it



// check value is vowel or not !

let check = prompt("Enter Your Character :")

switch (check) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        alert("It is vowels !");
       break;
    default:
        alert("It is Not Vowels !");
        break;
}




// Progrem to find the Add, sub, Div and Multipy
// based on , +, - , /, *     enter input this four

let y = 3;
let z = 5;

let choice = prompt("Enter Any Operator :");

switch (choice) {
    case "+":
        alert("Addition is :", y + z);
        break;
     case "-":
        alert("Subtraction is :", y - z);
        break;
     case "/":
        alert("Division is :", y / z);
        break;
     case "*":
        alert("Multiply is :", y * z);
        break;

    default:
        alert("Not AN OPERATOR !")
        break;
}














// program stop, after 2nd , fix it




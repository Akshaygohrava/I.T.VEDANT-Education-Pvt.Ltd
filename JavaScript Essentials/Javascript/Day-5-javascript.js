

// program to find to first four number or number in range !

let n = 5;
let sum = 0;
// range from 0 to 5
for (let i = 0; i <= n; i++) {
    sum = sum + i;
}
document.writeln("Program to find the Sum of 1 to 5 : <br>");
document.writeln("Sum is :", sum);

document.writeln("<br><br>");


// Program to Find the Factorial ! e.g 5

let a = 5;
let fact = 1;

for (let i = 1; i <= a; i++) {
    fact = fact * i;
}
document.writeln("Program to find the Factorial of 5 : <br>");
document.writeln("Factorial for 5  is :", fact);

document.writeln("<br><br>");

// program to find the wheather number is in which tables !

// 4%1===0;
// 4%2===0;
// 4%3===0;
// 4%4===0;
// let z = n % i === 0;

// b / 30 comes in which all tables ?
let b = 30;
document.writeln("Program to find The Number 30 is comes in Which tables ? : <br>");
for (let i = 0; i <= b; i++) {
    if (b % i === 0) {
        document.writeln(i);
    }

}
// Formula Generating is Important for problem solving 
document.writeln("<br><br>");

// program to find the number 30 is comes in how many tables ?

let c = 30;
let count =0;
document.writeln("Program to find the number 30 is comes in how many tables ? : <br>");
for (let i = 0; i <= c; i++) {
    if (c % i === 0) {
        document.writeln(i);
        count++;
    }

}
document.writeln("<br><br>");

// Program to Find the Number is Prime Number or Not ? using if else amd for loop , 1 - 100 
document.writeln("Program to Find the Number is Prime Number or Not ? using if else and for loop ? : <br>");


document.writeln("<br><br>");


// Program To Print the Number 1 - 10
document.writeln("Program To Print the Number 1 - 10 : <br>");
for (let i = 1; i <= 10; i++) {
    document.writeln(i);
}


document.writeln("<br><br>");


// Program To Find the Table of N (any number : e.g 7)
document.writeln("Program To Find the Table of N (any number : e.g 7): <br>");
let table = 7;
for (let i = 1; i <= 10; i++) {
    document.writeln(table * i);
}

document.writeln("<br><br>");

// Program To print the Table of 1 to 10 in Nested Loops
document.writeln("Program To print the Table of 1 to 10 in Nested Loops <br>");
for (let n = 1; n <= 10; n++) {
   for (let i = 1; i <= 10; i++) {
     document.writeln(n * i);
   }    
   document.writeln("<br>")
}

document.writeln("<br><br>");


// Do While Loops In Javascripts

// Program To Print Hello 1 times , when using Enter 1 in input text !
document.writeln("Program To Print Hello 1 times , when using Enter 1 in input text ! <br>");

do {
    document.writeln("Hello")
    var d = prompt("Enter 1 to continue");
} while (d == 1);

document.writeln("<br><br>");



// 
// let num = 0;
// let f = 0;

// do {
//     num = num + f;
//     f = parseInt(prompt("Enter Number :"));
// } while (n > 0);

// document.writeln("SUm is :" ,num);
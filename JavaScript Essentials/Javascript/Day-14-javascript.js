
document.writeln("Hello, Promises <br><br><br>");

// Fetch Returns Promise, Promise to solve or rejects
// Promise All , Promise Any, Promise race ....

// if one reject , second one resolve !
// const p1 = Promise.resolve("Data From Resolve, Promise 1");
const p1 = Promise.reject("Data From Resolve, Promise 1");

const p2 = Promise.resolve("Data From promises 2 !");

Promise.any([p1, p2])
.then((data) => document.writeln(data));



// Set timeout , Promises , with Race

const p3 = new Promise((resolve) => setTimeout(() => 
       {resolve("Data from p3 !")}, 10000
));
const p4 = new Promise((resolve) => setTimeout(() => 
       {resolve("Data from p4 !")}, 1000
));

// Promise.race([p3, p4])
// .then((data) => document.writeln(data));
// uncomment to run program, coz remove first program..


// Promise.allSettled([p3, p4]).then((data) => document.writeln(data));












































// Types of Functions to Learns ......
// function > anonimousy functs > arrow functions > Callbacks > fetch > async wait > promises 



// Learn Promises ..
// Practise, Practise, Practise ..........

// Self Study, Only 12-14 lecture of Javascript and React , SO Study 2-3 w3 and practise more ......
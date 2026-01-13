//  Callbacks Functions 

// function hello() {
//     document.writeln("This Will print,Hello After 5 Seconds !");
// }

// function bye() {
//     document.writeln("This Will print, Bye After 2 Seconds !");
// }
// setTimeout(hello, 5000);
// setTimeout(bye, 2000);



// Call Backs Function Example !
// Function pass to the function is called Callback Functions
document.writeln("<h3>This Is Callback function</h3>");

function callback(callbackfunc) {
       document.writeln("This is first functions ! first one");
       callbackfunc(); // this is callback func, instant call after first function
}
callback(() => document.writeln("<br>This is Callbackfunc functions, second function!"));
document.writeln("<p>Callback Function Stored in Parameter and call via in arguments</p>");
document.writeln("<br><br>");

// Parameterized Callback Functions !
document.writeln("<h3>Paramerized Callback function</h3>");
function fetchdata(callbackfunct) {
    let data = "Data from phonepay upi !, Call via paramter !";
    callbackfunct(data);
};

fetchdata((n) => document.writeln(n));

document.writeln("<br><br>");



// Topics to Learn

// callback function
// fetch api
// Promises
// Async Wait

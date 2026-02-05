// async wait is asyncrouis programming !
// dummyjson
// fakestore api, use it to learn fetch ....


// async function getProduct() {
//     const response  = await fetch('https://fakestoreapi.com/products/1');
//     document.writeln("<h1>Async await Func & Fetch APi</h1>")
//     document.writeln(response)
//     document.writeln(response.json());
//     const data = await response.json();
//     document.writeln(data);
    
// }
// document.writeln(getProduct());
// getProduct();



// try , catch , if error occur then , forward code will be run,
//  otherwise if try catch code not added , will not run forward code ,same as exceptional handling in java

// try {
    
// } catch (error) {
    
// }   
// we use for print meaning full message and to handle the error




// async await function , learn it !
// async function getUser() {
//     const res = await fetch('https://fakestoreapi.com/users');
//     const data = await res.json();
//     document.writeln(data);
//     // document.writeln(data[0]);   try accessing data, and more .....

//     console.log(data);
// }
// getUser();



// Fetch data from an API : Example !
async function fetchUserData() {
  document.writeln("Starting to fetch...<br><br>");
  console.log("Starting to fetch...<br><br>");
  
  const response = await fetch('https://fakestoreapi.com/products'); // Wait for API
  const user = await response.json(); // Wait for JSON conversion
  
  console.log("User data:", user);
  console.log("Done!");
}

fetchUserData();
console.log("I can run immediately - don't have to wait!");
// Output :-
// Starting to fetch...
// I can run immediately - don't have to wait!
// User data: {name: "John", age: 30}
// Done!






// async function task1() {
//     return "Task 1"
// }

// async function task2() {
//     return "Task 2"
// }



// async wait is asyncrouis programming !
// dummyjson
// fakestore api, use it to learn fetch ....


async function getProduct() {
    const response  = await fetch('https://fakestoreapi.com/products/1');
    document.writeln("<h1>Async await Func & Fetch APi</h1>")
    document.writeln(response)
    document.writeln(response.json());
    const data = await response.json();
    document.writeln(data);
    
}
document.writeln(getProduct());
// getProduct();



// try , catch , if error occur then , forward code will be run,
//  otherwise if try catch code not added , will not run forward code ,same as exceptional handling in java

// try {
    
// } catch (error) {
    
// }   
// we use for print meaning full message and to handle the error




// async await function , learn it !
async function getUser() {
    const res = await fetch('https://fakestoreapi.com/users');
    const data = await res.json();
    document.writeln(data);
    // document.writeln(data[0]);   try accessing data, and more .....

    console.log(data);

}

getUser();


// Promises ???

async function task1() {
    return "Task 1"
}

async function task2() {
    return "Task 2"
}



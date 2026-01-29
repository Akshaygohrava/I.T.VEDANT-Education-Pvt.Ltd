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


// cut and paste into another file, Destructring
// Objects & Array Destructuring !

// if i want to store any array or object property 
// in variable is called destructuing , 
// So I Dont have to use again and again {Student.name ....}


// Object Destructring 

const Student = {
   id: 1,
   name: "Akshay Gohrava",
   hobbies: ["Gaming", "technical analisis", "Coding"]
}
document.writeln(Student.id);

const {id, name} = {Student};
document.writeln(id, name); // Now i can write driect , No need of Student.id, Student.name ects...



// Array Destructuring

const arr = [
    {
        id: 1,
        name: "vinay",
        course: "bsc cs"
    },
    {
        id: 2,
        name: "rahul",
        course: "gp rating"
    }
]

const [s1, s2] = arr;
document.writeln(s1, s2);
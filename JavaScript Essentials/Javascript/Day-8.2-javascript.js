
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
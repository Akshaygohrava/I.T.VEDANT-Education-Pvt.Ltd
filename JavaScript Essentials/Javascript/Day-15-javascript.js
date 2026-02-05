// More of Objetcts & Arrays , Advance Array & Objects

const student={
    id:1001,
    name:Dishank,
    Age:21
};

console.log(student);

console.log(Object.keys(student));
console.log(Object.values(student));
console.log(Object.entries(student)[0][1]);

Object.freeze(student);
student.age=25;
console.log(student)
 




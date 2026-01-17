// Constructor Creating 

function Student(id, name) {
    this.id = id;
    this.name = name;

}
// object of function
const s1 = new Student(101, "Nisha <br><br>");
document.writeln(s1.id, s1.name);

const s2 = new Student(102, "Akshay");
document.writeln(s2.id, s2.name);

// Spread Operator in Objects

const a = {
    name: "Akshay",
    sname: "gohrava",
    age: 22
}
const b = {
    name: "Raj",
    sname: "gupta",
    age: 22
}
document.writeln("<br><br>",a.name,a.sname,a.age, ...b.name,b.sname,b.age );

// Object Destructing 

const s = {
    m: 2,
    n: 6,
    o:1
};
const {m, n, o} = 15;
document.writeln("<br><br>", m, n, o);
// Learn again object destructuring

document.writeln("<br><br>");

// Object Destructuring 

function details({id, name}) {
    document.writeln(id, name);
}
let Destruct = {id: 102, name:"Aksahy"};
details(Destruct);

document.writeln("<br><br>");


// To Merge two Objects , We can use spread Operator, 
// without spread Operator, its will Object Inside Object !
const y = {
    q: 4,
    r: 6,
    s:8
};
const z = {
    a: 22,
    b: 12,
    c: 44
};
document.writeln("Without Spread Operator :",y,z);
document.writeln("With Spread Operator :",...y, ...z)

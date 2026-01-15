
// Objects & Methods 
document.writeln("<br><br> Object <h3>Object & Methods</h3>");

let products = {
     id: 101,
     name: "Laptop",
     price: 45000
};
document.writeln("Accessing Objects <br><br>");

document.writeln("Object id : ",products.id, "<br>");
document.writeln("Object Name : ",products.name, "<br>");
document.writeln("Object Price : ",products.price, "<br>");
document.writeln("Object id : ", products["id"]);

document.writeln("<br><br>");

// Iterating , Objects using for in Method 
document.writeln("Iterating Object Using For IN for Objects :<br>");
for (const i in products) {
    document.writeln(products[i]);
}
document.writeln("<br><br>");

// Changing Objects values 
let books = {
    id: 102,
    name: "Atomic Habbits",
    author: "Martin Arule"
};

document.writeln("Accesing Object Values: ",books.id, books.name, books.author);

// changing objects values
books["author"] = "Akshay Gohrava";
document.writeln("<br><br>Changing Object Values: ",books.id, books.name, books.author);

document.writeln("<br><br>");

const school = {
    id: 103,
    name: "SIWS SCHOOL",
    location: "Wadala West",
    detail: function () {
      document.writeln(this.id, this.name, this.location);
    }
}
document.writeln(school.detail());

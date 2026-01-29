document.writeln("Hello DOM Manuplation !");

// DOM Manuplation , Create Element Using Create element , give context, and append 
let h1 = document.createElement("h1");

h1.textContent = "Hello, Create Element !";

document.body.appendChild(h1);

// Creating Paragraph !

let p = document.createElement("p");

p.textContent = "This Is Paragraph , Created By CreateElement,and appendchid by Body !";

document.body.appendChild(p);


// Creating UnOrderLists , Add Element from Input Box
function addTask() {
    const value = document.getElementById("inputbox").value;
    const ul = document.getElementById("list");    
    const li = document.createElement("li");
    li.textContent = value;

    ul.appendChild(li);
    document.getElementById("inputbox").value = "";


}

// AddEvent Listner !

const changetext = document.getElementById("heading");
changetext.addEventListener("click", () => {
    changetext.innerText = "Text Changed By EventListener";
});
// e.target in parameter, give objects which you clicked !
// giving funtion to the function is called callback function !

// create More element by eventlistner, write programe



// form , not to refressh the Page
{
   let a = document.getElementById("myform");
     a.addEventListener("submit", (e) => {
     e.preventdefault();
     e.target.name;
});
}


// Div Container , Eventlistner,    Eventpropogation Topic, Event bubbleing and Event Capturing !

document.querySelector(".container")
.addEventListener("click", () => {
   alert("Parent Elemnt");
});

document.querySelector(".box")
.addEventListener("click", () => {
    alert("Clild Elemnt");
});

document.querySelector(".grandchild")
.addEventListener("click", (e) => {
    alert("Gran Child Element");
    e.stopPropagation;
});




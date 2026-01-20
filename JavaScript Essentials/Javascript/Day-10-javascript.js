// DOM MANUPLATION

// Changing attribute values

function changeattri() {
    const input = document.getElementById("change");
    input.type = "number";
}


document.writeln("<br><br>");

// Input value to text of paragraph

function changevalue() {
    let input = document.getElementById("input");
    let para = document.getElementById("ans");
    para.textContent = "My Name Is : " + input.value;
    input.value = '';
}

document.writeln("<br><br>");

// get By ClassName 
 let x = document.getElementsByClassName("classname")[3].style.color = "red";
function classname() {
    let classname = document.getElementsByClassName("classname")[0];
    classname.style.color = "red";
    
}

document.writeln("<br><br>");

// QuerySelect and QueryselectorAll
    
function queryselector() {
    let y = document.querySelectorAll("p"[0]).style.color = "red";
}

document.writeln("<br><br>");


// Chnage List Color
function chnagecolor() {
    const ul = document.querySelector(".list");
    const listitems = il.children;

    for (const element of object) {
        
    }

}


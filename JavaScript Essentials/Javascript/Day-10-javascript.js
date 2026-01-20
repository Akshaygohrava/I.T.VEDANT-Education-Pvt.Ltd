// DOM MANUPLATION

// Changing attribute values

function changeattri() {
    const input = document.getElementById("change");
    input.type = "number";
    input.value = 123;
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
function classname() {
    let classname = document.getElementsByClassName("classname");
    for (let i = 0; i < classname.length; i++) {
        classname[i].style.color = "red";
        classname[i].style.backgroundColor = "green";
        classname[i].style.padding = "5px";
        
    }
}

document.writeln("<br><br>");

// QuerySelect and QueryselectorAll
    
function queryselector() {
    document.querySelectorAll("p").forEach(p => {
        p.style.color = "blue";
        p.style.fontSize = "1.3rem";
    })
}
// OR Using Loop Also works same
// function queryselector() {
//     let querys = document.querySelectorAll("p");
//     for (let i = 0; i < querys.length; i++) {
//         querys[i].style.color = "yellow";
//         querys[i].style.fontSize = "1.4rem";
//     }
// }


document.writeln("<br><br>");


// Chnage List Color
function changecolor() {
    const ul = document.querySelector(".list");
    const listitems = ul.children;

    for (let i = 0; i < listitems.length; i++) {
            listitems[i].style.color = "gold";
        listitems[i].style.textAlign = "center";
        listitems[i].style.backgroundColor = "darkblue";
        listitems[i].style.padding = "10px";
        listitems[i].style.margin = "5px 0";
        listitems[i].style.fontWeight = "bold";
        listitems[i].style.borderRadius = "5px";
        
    }

}


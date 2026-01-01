const password = prompt("Enter Password to access portfolio:");
const correctPassword = "admin@1230"; 

if (password === null) {
    
    alert("Access denied.");
    window.location.href = "https://www.google.com";
} else if (password === correctPassword) {
    alert("Welcome to my portfolio!");
    // window.location.href = "index.html";
} else {
    alert("Incorrect password. Redirecting...");
    window.location.href = "https://www.google.com";
}
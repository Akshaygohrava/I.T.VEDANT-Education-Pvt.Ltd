// const password = prompt("Enter Password to access portfolio:");
// const correctPassword = "admin@1230"; 

// if (password === null) {
    
//     alert("Access denied.");
//     window.location.href = "https://youtu.be/EQ94zflNqn4?si=a6BbBwFLBlLrrETQ";
// } else if (password === correctPassword) {
//     alert("Welcome to my portfolio!");
//     // window.location.href = "index.html";
// } else {
//     alert("Incorrect password. Redirecting...");
//     window.location.href = "https://youtu.be/EQ94zflNqn4?si=a6BbBwFLBlLrrETQ";
// }


const video = document.getElementById('bg-video');
const btn = document.getElementById('unmute-btn');

btn.addEventListener('click', () => {
  if (video.muted) {
    video.muted = false; 
    btn.innerText = "🔇 Mute";
  } else {
    video.muted = true;
    btn.innerText = "🔊 Unmute";
  }
});

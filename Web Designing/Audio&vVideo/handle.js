const password = prompt("Enter Password to access portfolio:");
const correctPassword = "admin@1230"; 

if (password === null) {
    
    alert("Access denied.");
    window.location.href = "https://youtu.be/EQ94zflNqn4?si=a6BbBwFLBlLrrETQ";
} else if (password === correctPassword) {
    alert("Welcome to my portfolio!");
    // window.location.href = "index.html";
} else {
    alert("Incorrect password. Redirecting...");
    window.location.href = "https://youtu.be/EQ94zflNqn4?si=a6BbBwFLBlLrrETQ";
}


document.addEventListener('DOMContentLoaded', () => {
  const video = document.getElementById('bg-video');
  const btn = document.getElementById('unmute-btn');

  if (!video || !btn) {
    console.error("Video or Button element not found. Check your IDs.");
    return;
  }

  btn.addEventListener('click', () => {
    if (video.readyState >= 2) { 
      if (video.muted) {
        video.muted = false;
        video.volume = 1.0; 
        btn.innerText = "🔇";
      } else {
        video.muted = true;
        btn.innerText = "🔊";
      }
    } else {
      console.warn("Video is still loading or could not be found.");
    }
  });
}); 

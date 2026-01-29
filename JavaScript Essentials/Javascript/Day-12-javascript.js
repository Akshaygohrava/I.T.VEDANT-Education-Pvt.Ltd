// Learning Fetch API

fetch('https://jsonplaceholder.typicode.com/todos/1')
  .then(response => response.json())
  .then(json => console.log(json))
//   .then(json => document.writeln(json))


//   Basic Example
// Step 1: Make the request
fetch('https://jsonplaceholder.typicode.com/posts/1')
  // Step 2: Get the response and convert to JSON
  .then(response => {
    return response.json(); // This returns another promise
  })
  // Step 3: Use the actual data
  .then(data => {
    console.log('Title:', data.title);
    console.log('Body:', data.body);
  })
  // Step 4: Handle errors
  .catch(error => {
    console.log('Error:', error);
  });



//   Displaying Real Data

function getUser() {
        // 1. Make the request
        fetch('https://jsonplaceholder.typicode.com/users/1')
        
        // 2. Convert response to JSON
        .then(response => response.json())
        
        // 3. Display the data
        .then(user => {
            const userInfo = document.getElementById('userInfo');
            userInfo.innerHTML = `
                <p><strong>Name:</strong> ${user.name}</p>
                <p><strong>Email:</strong> ${user.email}</p>
                <p><strong>Phone:</strong> ${user.phone}</p>
            `;
                })
        
        // 4. Handle any errors
        .catch(error => {
            console.log('Failed to fetch:', error);
            document.getElementById('userInfo').innerHTML = 
                '<p style="color: red;">Failed to load user data</p>';
        });
    }




// HTTP METHODS, API METHODS ....
// GET Request - Read data
fetch('https://api.example.com/data')
  .then(r => r.json())
  .then(data => console.log(data));

// POST Request - Create data
fetch('https://api.example.com/data', {
  method: 'POST',
  headers: {'Content-Type': 'application/json'},
  body: JSON.stringify({name: 'John', age: 30})
});

// PUT Request - Update data
fetch('https://api.example.com/data/1', {
  method: 'PUT',
  headers: {'Content-Type': 'application/json'},
  body: JSON.stringify({name: 'John Updated', age: 31})
});

// DELETE Request - Remove data
fetch('https://api.example.com/data/1', {
  method: 'DELETE'
});
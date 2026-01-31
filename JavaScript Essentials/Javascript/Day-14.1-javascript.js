

// Fetch Returns Promise, Promise to solve or rejects


async function getData() {
    try {
        const response = await fetch("https://dummyjson.com/quotes");
        const data = await response.json();
        // document.writeln(data.quotes);
        // document.writeln(data[0]);
        // console.log(data);
        // console.log(data.quotes);
        const table = document.getElementById("quotes");
        data.quotes.forEach((q) => {
            const tr = document.createElement("tr");
            for (let i in q ) {
                const td = document.createElement("td");
                td.textContent = q[i];
                tr.appendChild(td);
            }
            table.appendChild(tr);
        });
        

       
        


    } catch (error) {
        
    }
}
getData();


// For loop is used , when number of iteration is fixed 
// while, when we dont know number of iterations
// Do while, run atleast one time , even if condition is falsed !
// Map method , Transform data & return new array.
//  For In , return Indexs
// For Of , Return Elements
// For Each , Returns Index, elemnts







// how to fetch from api, and print & put in a table ...? learn it
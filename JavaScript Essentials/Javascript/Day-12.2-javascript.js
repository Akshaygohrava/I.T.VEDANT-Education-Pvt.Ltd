const form = document.getElementById("currencyform");
const answer = document.getElementById("answer");
form.addEventListener("submit", (e) => {
         e.preventDefault();
         const from = e.target.value;
         const to = e.target.to.value;
         const amount = e.target.amount.value;
         

         fetch(`https://api.exchangerate-api.com/v4/latest/${from}`)
         .then((Response)=> Response.json())
         .then((data) => {
            answer.textContent=` ${amount} ${from} = ${data["rates"][to]*amount} ${to}`
         })
});


import React from 'react'
import Routes from './Routes'
import { useEffect, useState } from 'react'

export default function Effect2() {
  const [quotes, setQuotes] = useState([]);

  useEffect(() => {
    fetch("https://dummyjson.com/quotes")
    .then(response => response.json())
    .then((data) => {
       console.log(data);
       setQuotes(data.quotes || []);
    }) 
    .catch((error) => console.log(error))
  }, [])
  return (
    <>
        <Routes />
         <h2>This is Effect2 Component !</h2>
         <p>Use Effect Hooks in API Fetching</p>
         <h3>Use Effect is Used For API Handling, First Parameter, Callback fun, Dependency array !</h3>
         <div>{quotes.map((q, index) => <p key={index}>{q.quote}</p>)}</div>
    </>
  )
}

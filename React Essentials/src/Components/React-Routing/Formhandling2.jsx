import React from 'react'
import Routes from './Routes'
import { useState, useEffect } from 'react'

export default function Formhandling2() {
  const [formdata, setFormdata] = useState({
    "username": "Akshay",
    "password": "1234@",
    "age": 28
  });

  const handlechange = (e) => {
          console.log("hello, input chnaged !");
          console.log(e.target);
          console.log(e.target.name)
          const name = e.target.name;
          const value = e.target.value;

          setFormdata({...formdata, [name]:[value]})

  }

  return (
    <>
        <Routes />
       <h1>Form Handling 2</h1><br /><br />
       <form>
         <label htmlFor="Username">Enter UserName :</label>
         <input type="text" name="username" id="username" onChange={handlechange} value={formdata.username} />
         <br /><br />
         <label htmlFor="Password">Enter Password :</label>
         <input type="text" name="password" id="password" onChange={handlechange} value={formdata.password}  />
         <br /><br />
         <label htmlFor="Age">Age :</label>
         <input type="number" name="number" id="number" onChange={handlechange} value={formdata.age}/>
         <br /><br />
         <button type="submit">Submit</button>
       </form>
    </>
  )
}

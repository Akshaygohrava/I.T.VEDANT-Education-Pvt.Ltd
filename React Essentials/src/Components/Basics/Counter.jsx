import { useState } from "react";
import React from 'react'

export default function Counter() {
    const[count, setCount] = useState(0);
    const[word, setWord] = useState("Hello-World ");
  return (
    <>
       <h3 className="text-center">Counter Application !</h3>
       <p>Intto to UseState Hooks</p>
       <h2>Value of Count : {count}</h2>
       <button className="btn btn-primary" onClick={() => setCount(count + 1)}>Counter Increment</button>
       <button className="btn btn-danger" onClick={() => setCount(count - 1)}>Counter Decrement</button>
      <br /><br />

      <h3>String Handle in useState : {word}</h3>
      <button className="btn btn-secondary" onClick={() => setWord(word + "React/Nextjs")}>Hello-World</button>



       
       


    </>
  )
}

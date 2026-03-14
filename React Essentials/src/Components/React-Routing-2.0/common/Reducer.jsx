import React from 'react'
import { useReducer } from 'react'


export default function Reducer() {
const reducer = (state, value) => {
       console.log(state, value);
    //    return state + 1;
    return state + value;
       
}
const [count, setCount] = useReducer(reducer, 0)

  return (
    <>
        <h2>This is Reducer Component !</h2>
        <p>Learn useReaducer Hook !</p>
        <h3>Count is {count}</h3>
        <button className='btn btn-danger' onClick={() => setCount(10)}>Click</button>
    </>
  )
}

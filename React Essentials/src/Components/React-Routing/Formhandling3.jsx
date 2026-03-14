import React from 'react'
import Routes from './Routes'
import { useForm } from 'react-hook-form'

export default function Formhandling3() {
    const {register, handleSubmit} = useForm();

    const submithandler = (data) => {
          console.log(data);
    }
  return (
    <>
      <Routes /><br />
       <h1>React Hooks Form</h1>
         
         <form onSubmit={() => submithandler(handleSubmit) }>
            <label htmlFor="name">Enter Name:</label>
            <input type="text" {...register("name" , { required: "Name is Needed " })} />
            <br /><br />
            <label htmlFor="age">Enter Age:</label>
            <input type="number" {...register("age" , { required: "Age is Require !" })} />
            <br /><br />
            <button type="submit">Submit</button>
         </form>
    </>
  )
}

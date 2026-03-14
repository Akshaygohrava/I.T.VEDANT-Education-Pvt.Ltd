import React from 'react'
import { Link } from 'react-router-dom'
export default function Routes() {
  return (
    <>
       <Link className='btn btn-primary' to={"/use-effect-1"}>Use Effect 1</Link>
       <Link className='btn btn-primary' to={"/use-effect-2"}>Use Effect 2</Link>
       <Link className='btn btn-primary' to={"/"}>Home</Link>
       <Link className='btn btn-primary' to={"/Products"}>Products</Link>
       <Link className='btn btn-primary' to={"/Recipes"}>Recipes</Link>
       <Link className='btn btn-primary' to={"/Formhandling1"}>Formhandling1</Link>
       <Link className='btn btn-primary' to={"/Formhandling2"}>Formhandling2</Link>
       <Link className='btn btn-primary' to={"/Formhandling3"}>Formhandling3</Link>
       <Link className='btn btn-primary' to={"/Formhandling4"}>Formhandling4</Link>
       <Link className='btn btn-primary' to={"../Data/Context"}>Context </Link>
    </>
  )
}

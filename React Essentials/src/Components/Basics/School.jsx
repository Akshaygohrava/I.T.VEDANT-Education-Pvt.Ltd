import React from 'react'

export default function School({id, name, address}) {
  return (
    <>
        <h3>This is School Components, Events In Components !</h3>
        <p>School id is : {id}</p>
        <p>School Name : {name}</p>
        <p>School Address : {address}</p>
    </>
  )
}

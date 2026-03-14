import React from 'react'
import { useEffect } from 'react';

function ErrorMessage() {
    return (
        <>
             <h3>Something Went Wrong</h3>
        </>
    )
}
export default function Errorboundary() {
    const age = 18;
  return (
    <>
       <h1>React Error-boundary</h1>
        <ErrorMessage />

    </>
    
  )
}

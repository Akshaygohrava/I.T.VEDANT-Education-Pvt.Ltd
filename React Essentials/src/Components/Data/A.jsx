import React from 'react'
import { useState } from 'react'

export default function A() {
    const [msg, setMsg] = useState("Data from A Componenet");
  return (
    <div>
     <p>This is A Component !</p>
     <p>Context</p>
    </div>
  )
}

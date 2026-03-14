import { useState } from "react";

export default function Student() {
    const [student, setStudent] = useState(["Akshay", "Rahul","deepesh", "Vinay"]);
    const [theme, setTheme] = useState(["warning", "danger", "primary", "secondary", "success"]);
  return (
    <>
    <h2>UseState : Students !</h2>
    <p>Array manuplation Using Usestate</p>
    <br />
    <p>{student}</p>
    {student.map((elem, index) => <li key={index}>{elem} {index}</li> )};
    <br />
    <p>This is Theme :</p>
    {theme.map((element, index) => <p className={`bg-${element}`} key={index}>{element}</p>)}
    </>
  )
}

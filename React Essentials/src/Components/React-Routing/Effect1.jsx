import Routes from "./Routes"
import { useEffect } from "react"
import { useState } from "react";


const Effect1 = () => {
    const [click, setClick] = useState(0);

    useEffect(() => {
        // console.log("Hello , Useeffct Hook !");
        let x = document.getElementById("useeffect");
        x.innerText = "Hello, Use Effect Hooks !";
    }, [click]);

    setTimeout(() => {
        console.log(click);
    }, 10000);

    // cleanup function 

// return () => {
//     clearTimeout(timeout);
// }

    return (
        <>
          <Routes />
        <h2>Intro To Use Effect Hooks !</h2>
           <h2>This is Effect1 Component !</h2>
           <p>Use effect is used when , the variable or component data changes, then the useeffect hooks will call the function !</p>
           <p>First parameter is callback function , second is dependencies !</p>
           <button onClick={() => setClick(click + 1)}>Use Effect Hooks</button>
           <h2>Here is Counter : {click}</h2>
           <p id="useeffect">Changes render here , when Button click , Using UseEffect !</p>
           

        </>
    )
}
export default Effect1
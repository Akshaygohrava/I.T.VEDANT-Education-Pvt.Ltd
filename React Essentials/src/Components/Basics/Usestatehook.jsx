import { useState } from "react";

const UseStatehook = () => {
    const [word, setWord] = useState("hello");
    const [login, setLogin] = useState(false);
    const switchlogin = () => {
           setLogin(!login);
    };
    return (
        <>
           <h1>Hello, Usestate Hooks !</h1>
           <p>Short circuit in React </p>
            {/* If true then output */}
           {word && <h3>word has value.</h3>} 
           
           {/* if false then output */}
           {/* {login || <h2>You are Logged Out !</h2>} */}

           {/* Using Ternary Operator */}
           {login ? <h2>You are Logged Out ! </h2> : <h2>You are Logged In !</h2>}
           <button className="btn btn-primary" onClick={switchlogin}>Login</button><br />

           {/* change button using above true ,false value ! */}
           {login ? <><button>Logout</button></> : <><br /><button>Register</button> <button>Login</button></>}

        </>
    )

}
export default UseStatehook
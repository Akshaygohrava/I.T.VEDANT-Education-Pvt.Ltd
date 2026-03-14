
import React from "react";
import { useForm, Watch } from "react-hook-form";
import Routes from "./Routes";

function Formhandling4() {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();
//   const password = Watch("password");
  const submitHandler = (data) => {
    console.log(data);
  };
  return (
    <div>
               <Routes />
       <h2>React Form Handling - React Hooks Forms !</h2>
      <form onSubmit={handleSubmit(submitHandler)}>
        <label htmlFor="">Enter name</label>
        <input
          type="text"
          {...register("username", {
            required: "Name is required",
            minLength: {
              value: 2,
              message: "Minmum 2 characters are required",
            },
          })}
          id=""
        />
        {errors.username && (
          <p className="text-danger">{errors.username.message}</p>
        )}
       <br /><br />
        <label htmlFor="">Enter age</label>
        <input
          type="number"
          {...register("age", {
            required: "age  is required",
            min: { value: 5, message: "minimum age is 5 required" },
            max: { value: 100, message: "maximum age is 100 required" },
          })}
          name="age"
          id=""
        />
        {errors.age && <p className="text-danger">{errors.age.message}</p>} <br /><br />
        <label htmlFor="">Enter password</label>
        <input
          type="password"
          {...register("password", {
            required: "password is required",
            pattern: {
              value: /^((?=\S*?[A-Z])(?=\S*?[a-z])(?=\S*?[0-9]).{6,})\S$/,
              message:" Checks that a password has a minimum of 6 characters, at least 1 uppercase letter, 1 lowercase letter, and 1 number with no spaces",
            },
          })}
        />
        {errors.password && (
          <p className="text-danger">{errors.password.message}</p>
        )} <br /><br />

        <label htmlFor="">Enter Confirm Password</label>
        <input type="password" name="" id="" />  <br /><br />
        <input type="submit" value="sumbit" />
      </form>
    </div>
  );
}

export default Formhandling4;

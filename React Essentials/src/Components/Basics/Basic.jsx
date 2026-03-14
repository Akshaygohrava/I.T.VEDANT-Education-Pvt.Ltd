import { useState } from "react";
import Counter from "./Counter";
import Products from "./Products";
import UseStatehook from "./Usestatehook";
import Student from "./Student";
import School from "./School";

export const Basic = () => {
    return (
        <>
        <Counter></Counter>
        <hr />
        <UseStatehook></UseStatehook>
        <hr />
        <Student></Student>
        <hr />
        <Products></Products>
        <hr />
        <School id={"SCH!"} name={"S.I.W.S"} address={"Wadala"} />
        <School id={"SCH!-2"} name={"Keerti Clg"} address={"Dadar"} />
        <hr />
        </>
    )
}
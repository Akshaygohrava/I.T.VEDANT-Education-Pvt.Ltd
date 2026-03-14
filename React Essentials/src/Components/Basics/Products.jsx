import { useState } from "react";
import Category from "./Category"

const Products = () => {
    const Products = [
        {id:101,name: "laptop", price: 45000 },
        {id:102,name: "mobile", price: 9500 },
        {id:103,name: "earphone", price: 3500 }
    ]
    const [products, setProducts] = useState(Products);
        return (
            <>
            <h1 className="text-center">This is Product Components !</h1>
            
              <div className="container">
                 {products.map((e) => (
                     <div className="col bg-warning">
                         <p>Id: {e.id}</p>
                        <p>Name: {e.name}</p>
                        <p>Price: {e.price}</p>
                     </div>
                 ))}
              </div>
            <Category Id={101} Name={"Akshay"} />

            </>
        )
}
export default Products
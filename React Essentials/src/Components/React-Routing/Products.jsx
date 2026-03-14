import React from 'react'
import Routes from './Routes'
import { useEffect, useState } from 'react'

export default function Produccts() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
        fetchProducts();
  },[]);

  const fetchProducts = async () => {
    try {
      const response = await fetch("https://dummyjson.com/products");
      const data = await response.json();
      setProducts(data.products);
    } catch (error) {
      console.log(error);
    }
  }


  return (
    <div>
        <Routes />
        <h2>This is Products Components</h2>
       <br />
        <h2>Fetch API Using Use Effect </h2>
       
       {products && products.map(data => (
             <div className='bg-primary w-50 text-center mx-auto p-3 m-2 text-white' key={data.id}>
                 <p>{data.id}</p>
                 <p>{data.title}</p>
                 <p>{data.description}</p>
             </div>
       ))}
       


    </div>
  )
}

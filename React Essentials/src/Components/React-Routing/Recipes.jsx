import React from 'react'
import { useState, useEffect } from 'react'
import Routes from './Routes'

export default function Recipes() {
  const [recipes, setRecipes] = useState([]);

  useEffect(() => {
    const fetchRecipes = async () => {
      try {
        const response = await fetch("https://dummyjson.com/recipes");
        const data = await response.json();
        setRecipes(data.recipes || []);
      } catch (error) {
        console.error("Error fetching recipes:", error);
      }
    };
    
    fetchRecipes();
  }, []);

  return (
    <div>
      <Routes /> <br /><br />
            <h2>This is Recipes Component</h2>
      <input type="text" name="search" id="" />&nbsp;&nbsp;
      <button className='btn btn-primary'>Search</button>
      <h1>Fetch API Using UseEffect & async/await!</h1>

      <div className="row row-cols-1 row-cols-md-2 g-4">
        {recipes.map(recipe => (
          <div className="col" key={recipe.id}>
            <div className="card">
              <img src={recipe.image} className="card-img-top" alt={recipe.name} />
              <div className="card-body">
                <h5 className="card-title">{recipe.id}. {recipe.name}</h5>
                
                <p>Ingredients:</p>
                <p>
                  {recipe.ingredients && recipe.ingredients.join(", ")}
                </p>
                
                <p>Instructions:</p>
                <p>
                  {recipe.instructions && recipe.instructions.join(" ")}
                </p>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  )
}
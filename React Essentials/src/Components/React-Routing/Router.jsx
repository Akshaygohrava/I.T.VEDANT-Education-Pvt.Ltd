import { createBrowserRouter, RouterProvider, Outlet } from 'react-router-dom'
import Home from './Home'
import Effect1 from './Effect1'
import Effect2 from './Effect2'
import Products from './Products'
import Recipes from './Recipes'
import Formhandling1 from './Formhandling1'
import Formhandling2 from './Formhandling2'
import Formhandling3 from './Formhandling3'
import Formhandling4 from './Formhandling4'
import Context from '../Data/Context'

const router = createBrowserRouter([
  {
    path: "/",
    element: (
      <>
        <h1>React Router</h1>
        <Outlet />
      </>
    ),
    children: [
      { index: true, element: <Home /> },
      { path: "use-effect-1", element: <Effect1 /> },
      { path: "use-effect-2", element: <Effect2 /> },
      { path: "Products", element: <Products /> },
      { path: "Recipes", element: <Recipes /> },
      { path: "Formhandling1", element: <Formhandling1 /> },
      { path: "Formhandling2", element: <Formhandling2 /> },
      { path: "Formhandling3", element: <Formhandling3 /> },
      { path: "Formhandling4", element: <Formhandling4 /> },
      { path: "Context", element: <Context /> }
    ]
  }
])

const Router = () => {
    return <RouterProvider router={router} />;
}

export default Router
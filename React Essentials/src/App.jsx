// App.jsx
import { BrowserRouter, Routes, Route, NavLink } from 'react-router-dom';
import { ErrorBoundary } from 'react-error-boundary';
import './App.css';

// Import your components
import { Basic } from './Components/Basics/Basic';
import Router from './Components/React-Routing/Router';
import Routers from './Components/React-Routing-2.0/Router2.0';
import Errorboundary from './Components/React-Error/Error-boundary';

// Error Fallback Component
function ErrorFallback({ error, resetErrorBoundary }) {
  return (
    <div className="error-fallback">
      <div className="error-card">
        <div className="error-icon">⚠️</div>
        <h2>Something Went Wrong</h2>
        <pre className="error-message">{error.message}</pre>
        <button onClick={resetErrorBoundary} className="error-button">
          Try Again
        </button>
      </div>
    </div>
  );
}

// Home Component
function Home() {
  return (
    <div className="home-container">
      <h2 className="home-title">Welcome to React Essentials</h2>
      <p className="home-description">
        Master React concepts with interactive examples and comprehensive tutorials
      </p>
      
      <div className="features-grid">
        <div className="feature-card">
          <div className="feature-icon">⚛️</div>
          <h3>React Basics</h3>
          <p>Components, Props, State, and Lifecycle</p>
        </div>
        <div className="feature-card">
          <div className="feature-icon">🔄</div>
          <h3>React Routing v1</h3>
          <p>Traditional routing patterns and implementations</p>
        </div>
        <div className="feature-card">
          <div className="feature-icon">🚀</div>
          <h3>React Routing v2</h3>
          <p>Advanced routing with nested routes and loaders</p>
        </div>
        <div className="feature-card">
          <div className="feature-icon">🛡️</div>
          <h3>Error Boundaries</h3>
          <p>Graceful error handling in React applications</p>
        </div>
      </div>
    </div>
  );
}

function App() {
  return (
    <>
      <div className="app">
        {/* Header */}
        <header className="app-header">
          <h1 className="app-title">
            <span className="title-gradient">Official React Essentials Topics</span>
          </h1>
          <p className="app-subtitle">Learn React through hands-on examples</p>
        </header>
        
        {/* Navigation */}
        <nav className="app-nav">
          <NavLink to="/" className={({ isActive }) => 
            `nav-link ${isActive ? 'active' : ''}`
          } end>
            <span className="nav-icon">🏠</span>
            Home
          </NavLink>
          
          <NavLink to="/basics" className={({ isActive }) => 
            `nav-link ${isActive ? 'active' : ''}`
          }>
            <span className="nav-icon">⚛️</span>
            Basics
          </NavLink>
          
          <NavLink to="/routing" className={({ isActive }) => 
            `nav-link ${isActive ? 'active' : ''}`
          }>
            <span className="nav-icon">🔄</span>
            Routing v1
          </NavLink>
          
          <NavLink to="/routing-v2" className={({ isActive }) => 
            `nav-link ${isActive ? 'active' : ''}`
          }>
            <span className="nav-icon">🚀</span>
            Routing v2
          </NavLink>
          
          <NavLink to="/error-handling" className={({ isActive }) => 
            `nav-link ${isActive ? 'active' : ''}`
          }>
            <span className="nav-icon">🛡️</span>
            Error Handling
          </NavLink>
        </nav>
        
        {/* Main Content */}
        <main className="app-main">
          <ErrorBoundary FallbackComponent={ErrorFallback}>
            <Basic />
            <Router />
            <Routers />
            <Errorboundary />
          </ErrorBoundary>
        </main>
        
        {/* Footer */}
        <footer className="app-footer">
          <p>© 2024 React Essentials - Learn React with confidence</p>
        </footer>
      </div>
    </>
  );
}

export default App;
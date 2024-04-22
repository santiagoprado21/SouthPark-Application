import './App.css';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';
import Profile from './components/Profile';

function App() {

  return (
    <div className="App">
      <h1>Application</h1>
      <LoginButton/>
      <LogoutButton/>
      <Profile/>
    </div>
  );
}

export default App;

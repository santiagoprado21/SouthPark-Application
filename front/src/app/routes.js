import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import LoginPage from './pages/LoginPage';
import AdminPage from './pages/AdminPage';
import UserPage from './pages/UserPage';
import ClientPage from './pages/ClientPage';

const Routes = () => (
  <Router>
    <Switch>
      <Route path="/login" component={LoginPage} />
      <Route path="/admin" component={AdminPage} />
      <Route path="/user" component={UserPage} />
      <Route path="/client" component={ClientPage} />
      {/* Otras rutas */}
    </Switch>
  </Router>
);

export default Routes;
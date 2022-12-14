import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

import App from "./App.js";
import "./styles.css";

const appRouting = (
  <Router>
    <Routes>
      <Route path="/" element={<App />}/>
    </Routes>
  </Router>
);

const root = ReactDOM.createRoot(document.getElementById("root"))
root.render(appRouting);
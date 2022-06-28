import React from 'react'
import{Route,Routes} from 'react-router-dom'
import LandingPages from '../pages/LandingPages'
import LogIn from '../pages/LogIn'
import View from '../pages/View'

const Rutas = () => {
  return (
    <Routes>
        <Route path="/" element={<LandingPages/>}/>
        <Route path="/loginIn" element={<LogIn/>}/>
        <Route path="/View.jsx" element={<View/>}/>
        <Route/>
    </Routes>
  )
}

export default Rutas
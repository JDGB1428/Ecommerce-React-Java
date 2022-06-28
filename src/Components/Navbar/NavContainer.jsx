import React from 'react'
import "../Navbar/NavContaine.css";
import{Link} from 'react-router-dom'
import{links} from './data'
import {FaUser, 
        FaAtlassian,
        FaBars} from "react-icons/fa";

const NavContainer = () => {
  return (
    <>
      <header className='header'>
        <div className='Logo-container'>
          <FaAtlassian size ={"2rem"} className='logo-item'/>
          <p>AtlantisStore</p>
        </div>
        <nav className='nav-menu'>
          {links.map((link) =>{
            return (
              <a href={link.url} key={link.id}>
                {link.text}
              </a>
            )
          })}
        </nav>
        <div className='icon-container'>
          <FaBars size={"2rem"} className="icon-item"/>
          <Link to="/loginIn" ><FaUser size={"2rem"} className="icon-item"/></Link>
        </div>
      </header>
    </>
  )
}

export default NavContainer
import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Home from './mainNav/Home'
import Personal from './mainNav/Personal'
import Business from './mainNav/Business'
import Corporate from './mainNav/Corporate'
import PrivateBanking from './mainNav/PrivateBanking'
import PrivyLeague from './mainNav/PrivyLeague'
import Nriservice from './mainNav/Nriservice'
import Investor from './mainNav/Investor'
import Login from './mainNav/Login'

const App = () => {
  return (
    <div>
        <BrowserRouter>
        <Home></Home>
        <Routes>
            <Route path='/' element={<Personal></Personal>}></Route>
            <Route path='/business' element={<Business/>}></Route>
            <Route path='/corporate' element={<Corporate/>}></Route>
            <Route path='/privateBanking' element={<PrivateBanking/>}></Route>
            <Route path='/PrivyLeague' element={<PrivyLeague/>}></Route>
            <Route path='/nriService' element={<Nriservice/>}></Route>
            <Route path='/investor' element={<Investor/>}></Route>
            <Route path='/login' element={<Login/>}></Route>
            

        </Routes>
        </BrowserRouter>
      
    </div>
  )
}

export default App

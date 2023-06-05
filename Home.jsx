import React from 'react'
import{Link} from 'react-router-dom'
import style from './home.module.css'
import image from './download.png'

const Home = () => {
  return (
    <div>
    <section id={style.mainNav}>
      <div>
       <Link to='/'>personal</Link>
       <Link to='/business'>business</Link>
       <Link to='/corporate'>corporate</Link>
       <Link to='/privateBanking'>privateBanking</Link>
       <Link to='/PrivyLeague'>privy league</Link>
       <Link to='/nriService'>nri service</Link>
       <Link to='/investor'>investor</Link>
       </div>
       <div id={style.icon}>
   
       </div>
      
    </section>
    <section id={style.nav2}>
      <div id={style.logo}>
     <img src={image} alt="" />
      </div>
      <div id={style.div1}>
        <h1>Accounts & Deposits</h1>
        <h1>Accounts & Deposits</h1>
        <h1>Accounts & Deposits</h1>
        <h1>Accounts & Deposits</h1>
        <h1>Accounts & Deposits</h1>
        <h1>Accounts & Deposits</h1>
        <h1>Accounts & Deposits</h1>
      </div>
      <div id={style.div2}>
        <div id={style.chatboat}></div>

        <button id={style.login} ><Link to='/login'>Login</Link></button>
      </div>
   
        

    </section>
    </div>
  )
}

export default Home

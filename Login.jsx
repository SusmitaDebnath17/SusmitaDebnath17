import React from 'react'
import style from './login.module.css'

const Login = () => {
  return (
    <div id={style.div}>
    <section id={style.nav}>
      <table id={style.table}>
        <caption>Login or Register with Kotak Net Banking</caption>
        <h1>one dropdown here</h1>
        <tr>
            
            <td><input type="text" placeholder='Enter your CRN, Username or Card Number to begin
' /></td>
 </tr>
 <tr>
<td><input type="checkbox" /> remember me</td>
<td>use virtual keybord</td>
</tr> 
<tr>
    <td><input type="text" placeholder='enter captcha'/></td>
</tr>

      </table>
    </section>
    </div>
  )
}

export default Login

<%-- 
    Document   : Login
    Created on : 15/09/2016, 10:55:12 PM
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:Inicio:.</title>
 <link rel="stylesheet" href="login/css/reset.css">

    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="login/css/style.css">
    
  </head>
  <body>    
<!-- Form Mixin-->
<!-- Input Mixin-->
<!-- Button Mixin-->
<!-- Pen Title-->
<div class="pen-title">
  <h1>Rent-It</h1>
</div>
<!-- Form Module-->
<div class="module form-module">
  <div class="toggle"><i class="fa fa-times fa-pencil"></i>
    <div class="tooltip">Sign In | Sign Up</div>
  </div>
  <div class="form">
    <h2>Bienvenido</h2>
    <form>
      <input type="text" placeholder="Usuario"/>
      <input type="password" placeholder="Contraseña"/>
      <button>Iniciar</button>
    </form>
  </div>
  <div class="form">
    <h2>Crear Cuenta</h2>
    <form>
      <input type="text" placeholder="Usuario"/>
      <input type="password" placeholder="Contraseña"/>
      <input type="email" placeholder="Correo"/>
      <input type="tel" placeholder="Celular"/>
      <button>Register</button>
    </form>
  </div>
  <div class="cta"><a href="https://about.me/rmarin">Olvidó su contraseña?</a></div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<!--<script src='http://codepen.io/andytran/pen/vLmRVp.js'></script>-->

        <script src="login/js/index.js"></script>
  </body>
</html>


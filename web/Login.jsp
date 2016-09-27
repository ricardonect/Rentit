<%-- 
    Document   : Login
    Created on : 15/09/2016, 10:55:12 PM
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>.:Inicio:.</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="login/css/reset.css">
        <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
        <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
        <link rel="stylesheet" href="login/css/style.css">

        <script type="text/javascript" language="javascript">
            <!-- //
            function ClearForm() {
                document.signin.reset();
            }
            // -->
        </script>

    </head>
    <body onload="ClearForm()">    
        <%-- Form Mixin--%>
        <%-- Input Mixin--%>
        <%-- Button Mixin--%>
        <%-- Pen Title--%>
        <div class="pen-title">
            <h1>Rent-It - Login</h1>
        </div>
        <%-- Form Module--%>
        <div class="module form-module">
            <div class="toggle"><i class="fa fa-times fa-pencil"></i>
                <div class="tooltip">Sign In | Sign Up</div>
            </div>
            <div name="signin" class="form">
                <h2>Bienvenido</h2>
                <form action="ValidarSesion" method="Post">
                    <input type="text" name="ctrl_inputUsuario" placeholder="Usuario"/>
                    <input type="password" name="ctrl_inputPass" placeholder="Contraseña"/>
                    <button>Iniciar</button>
                </form>
            </div>
            <div name="signup" class="form">
                <h2>Crear Cuenta</h2>
                <form action="EnviarMailConfirmacion" method="Post">
                    <input type="text" name="ctrl_inputUser" placeholder="Usuario"/>
                    <input type="password" name="ctrl_inputPassword" placeholder="Contraseña"/>
                    <input type="email" name="ctrl_inputMail" placeholder="Correo"/>
                    <input type="tel" name="ctrl_inputTel" placeholder="Celular"/>
                    <button>Register</button>
                </form>
            </div>
            <div class="cta"><a href="https://about.me/rmarin">Olvidó su contraseña?</a></div>
        </div>

        <%-- Inicio Footer--%>
        <nav class="navbar navbar-default  navbar-fixed-bottom" role="navigation">
            <div class="container text-center">
                <p class="navbar-text col-md-12 col-sm-12 col-xs-12">&copy; xyz</p>
            </div>
        </nav>
        <%-- Fin Footer--%>

        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <%--<script src='http://codepen.io/andytran/pen/vLmRVp.js'></script>--%>

        <script src="login/js/index.js"></script>

    </body>
</html>


<%-- 
    Document   : Error
    Created on : 21/09/2016, 10:01:00 PM
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rentit - Error</title>
        <meta name="description" content="Rentalo Aquí">
        <meta name="author" content="Ricardo Marín">
        <!—[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]—>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body { padding-top: 60px; }
        </style>
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
    </head>
    <body>
        <%--Inicio Barra superior menus generales --%>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="brand" href="#">Genbeta Dev</a>
                    <ul class="nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#about">Bio</a></li>
                        <li><a href="#contact">Contacto</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <%--Fin Barra superior menus generales --%>

        <%-- Inicio Contenido del cuerpo --%>
        <div class="container"> <%-- /container --%>
            <h1>Ejemplo de Bootstrap para Genbeta Dev</h1>
            <p>Plantilla ejemplo para el desarrollo de un proyecto web.</p>
        </div> 
        <%-- Fin Contenido del cuerpo --%>

        <%-- Inicio Region principal--%>
        <div class="hero-unit">
            <h1>Ups! parece que algo ah ocurrido</h1>
            <p>
                Tu usuario y contraseña estan incorrectos
            </p>
            <p><a class="btn btn-primary btn-large">Más información</a></p>
        </div>
        <%-- Fin Region principal--%>

        <%-- Inicio Footer--%>
        <footer>
            <p>&copy; Company 2012</p>
        </footer>
        <%-- Fin Footer--%>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>

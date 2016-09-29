<%-- 
    Document   : Home
    Created on : 20-sep-2016, 14:57:04
    Author     : RicardoMarin
--%>

<%-- Inicio Sesion activa --%>
<%@page import="Rentit.modelo.Usuario"%>
<%
    Usuario usu = (Usuario) session.getAttribute("usuarioActivo");

    if (usu == null) {
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
%>
<%-- Fin Sesion activa --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Rentit - Home</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="Rentalo Aquí">
        <meta name="author" content="Ricardo Marín">

        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

        <!—[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]—>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body { padding-top: 60px; }
        </style>
    </head>
    <body>
        <%--Inicio Barra superior menus generales --%>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="#">Rent-It</a>
                    <div class="nav-collapse">
                        <ul class="nav">
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="#about">Productos</a></li>
                            <li><a href="#contact">Contacto</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <%--Fin Barra superior menus generales --%>

        <%-- Inicio Contenido del cuerpo --%>
        <div class="container"><%-- /container --%>
            <h1>Ejemplo de Bootstrap para Genbeta Dev</h1>
            <p>Plantilla ejemplo para el desarrollo de un proyecto web.</p>
        </div> 
        <%-- Fin Contenido del cuerpo --%>

        <%-- Inicio Region principal--%>
        <div class="hero-unit">
            <h1>Bienvenido a nuestra plataforma Rent-It</h1>
        </div>
        <%-- Fin Region principal--%>

        <%-- Inicio Footer--%>
        <nav class="navbar navbar-default  navbar-fixed-bottom" role="navigation">
            <div class="container text-center">
                <p class="navbar-text col-md-12 col-sm-12 col-xs-12">&copy; xyz</p>
            </div>
        </nav>
        <%-- Fin Footer--%>


        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>

<%-- 
    Document   : Productos
    Created on : 25-sep-2016, 18:14:32
    Author     : RicardoMarin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Rentit - Productos</title>
        <title>Nuevo proyecto con Bootstrap 2.0</title>
        <meta name="description" content="Rentalo Aquí">
        <meta name="author" content="Ricardo Marín">
        <!--Inicio Responsive design-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Fin Responsive design -->

        <!—[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]—>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body { padding-top: 60px; }
        </style>
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

        <%--Inicio Cargar datos dinamicos control ajax--%>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script>
            /*$(document).ready(function() {                     
             $('#submit').click(function(event) {  
             var username=$('#user').val();
             $.get('CargarProductos',{user:username},function(responseText) { 
             $('#tabla').text(responseText);         
             });
             });
             });-*/
            $(document).ready(function () {
                get_data() //After page load this function called
            });

            function get_data() {
                $.ajax({
                    url: 'CargarProductos',
                    type: 'get',
                    data: "",
                    success: function (msg) {
                        $("#tabla").html(msg);
                    }
                });
            }
        </script>
        <%--Fin Cargar datos dinamicos control ajax--%>
    </head>
    <body>

        <!--Inicio Barra superior menus generales -->
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
        <!--Fin Barra superior menus generales -->

        <!-- Inicio Contenido del cuerpo -->
        <div class="container-fluid"> <!-- /container -->
            <h1>Ejemplo de Bootstrap para Genbeta Dev</h1>
            <p>Plantilla ejemplo para el desarrollo de un proyecto web.</p>
        </div> 
        <!-- Fin Contenido del cuerpo -->

        <!-- Inicio Region principal-->
        <div class="hero-unit">
            <h1>Bienvenidos a nuestra página!</h1>
            <p>
                Texto principal de bienvenida a nuestra página. Prueba a redimiensinar el 
                navegador y comprobará como se adapta el diseño al nuevo tamaño.
            </p>
            <p><a id="submit" class="btn btn-primary btn-large">Más información</a></p>
        </div>
        <!-- Fin Region principal-->

        <!-- Inicio Filas-->
        <div id="tabla" class="row-fluid">
            <div class="span4">
                <h2>Producto</h2>
                <p>
                    Descripción del producto presentado. Descripción del producto presentado. 
                    Descripción del producto presentado.
                </p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div>
            <div class="span4">
                <h2>Producto 2</h2>
                <p>
                    Descripción del producto presentado. Descripción del producto presentado. 
                    Descripción del producto presentado.
                </p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div>
        </div>
        <!-- Fin Filas-->

        <!-- Inicio Footer-->
        <nav class="navbar navbar-default  navbar-fixed-bottom" role="navigation">
            <div class="container text-center">
                <p class="navbar-text col-md-12 col-sm-12 col-xs-12">&copy; xyz</p>
            </div>
        </nav>
        <!-- Fin Footer-->

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>

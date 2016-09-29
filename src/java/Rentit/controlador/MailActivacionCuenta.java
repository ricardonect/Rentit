/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rentit.controlador;

import Rentit.modelo.Conexion;
import Rentit.modelo.Usuario;
import Rentit.modelo.Terceros;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RicardoMarin
 */
public class MailActivacionCuenta extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MailActivacionCuenta() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        try {

            Conexion con = new Conexion();
            con.Conexion();
            con.Close();

            Usuario usuario = new Usuario();
            Terceros terceros = new Terceros();

            usuario.setUsuario(request.getParameter("usuario"));
            usuario.setPassword(request.getParameter("aleatorio"));

            System.out.println("Request:" + usuario.getUsuario());
            System.out.println("Request:" + usuario.getPassword());

            String rs;
            rs = con.Buscar(usuario.GetUser(usuario.getUsuario(), usuario.getPassword()), "id_usuario");

            if (!rs.isEmpty()) {
                request.getRequestDispatcher("Error.jsp").forward(request, response);
            }

//            String usuario = (String) request.getSession().getAttribute("usuario");
//            String aleatorio = (String) request.getSession().getAttribute("aleatoria");
            System.out.println("Session:" + usuario.getUsuario());
            System.out.println("Session:" + usuario.getPassword());

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            try {
                String cliente = request.getRemoteAddr();
                out.println("");
                out.println("");
                out.println("");
                out.println("");
                
            
                if (usuario != null) {
                    if (usuario != null) {

                        out.println("<h3>Bienvenido Usuario:" + usuario.getUsuario() + "</h3>");
                        out.println("<b>Gracias por verificar su Usuario</b>");
                        out.println("");
                        out.println("");
                        System.out
                                .println("El Usuario a confirmado su Alta Nueva!");
                    } else {
                        out.println("<h3>ERROR!</h3>");
                        out.println("<b>Lo sentimos no es el numero de registro</b>");
                        out.println("");
                        out.println("");
                        System.out
                                .println("Lo sentimos no es el numero de registro");
                    }
                } else {
                    out.println("<h3>ERROR!</h3>");
                    out.println("<b>No existe usuario</b>");
                    out.println("");
                    out.println("");
                    System.out.println("No existe usuario!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                out.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

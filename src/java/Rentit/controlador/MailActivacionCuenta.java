/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rentit.controlador;

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
            String usu = request.getParameter("usuario");
            String ale = request.getParameter("aleatorio");
            System.out.println("Request:" + usu);
            System.out.println("Request:" + ale);
            // System.out.println("Verificacion de los datos\n" +
            // "SELECT * FROM TB_USUARIO WHERE USU='usuario' AND ALE='aleatorio'");
            //Verificas con la bd!
            String usuario = (String) request.getSession().getAttribute("usuario");
            String aleatorio = (String) request.getSession().getAttribute("aleatoria");
            System.out.println("Session:" + usuario);
            System.out.println("Session:" + aleatorio);

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            try {
                String cliente = request.getRemoteAddr();
                out.println("");
                out.println("");
                out.println("");
                out.println("");
                if (usu.equals(usuario)) {
                    if (ale.equals(aleatorio)) {

                        out.println("<h3>Bienvenido Usuario:" + usu + "</h3>");
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

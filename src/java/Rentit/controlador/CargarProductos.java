/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rentit.controlador;

import Rentit.modelo.Conexion;
import Rentit.modelo.ImagenesCategorias;
import Rentit.modelo.SubCategorias;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo
 */
public class CargarProductos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        ServletOutputStream out = response.getOutputStream();

        Conexion con = new Conexion();
        con.cargaDriver();

        try {
            con.Conexion();
            SubCategorias sub = new SubCategorias();
            List<SubCategorias> listsublistsub = new ArrayList<>();
            listsublistsub = (List<SubCategorias>) sub.ListarSubCategorias();
            ImagenesCategorias img = new ImagenesCategorias();
            List<ImagenesCategorias> ListImage = new ArrayList<ImagenesCategorias>();

            for (int i = 0; i < listsublistsub.size(); i++) {
                out.println("<div class='span4'>");
                img.setImage(img.BuscarImagenesPorCategoria(listsublistsub.get(i).getId_categoria()));
                if(img.getImage() != null){
                out.println("<img src='"+img.getImage()+"' width='128' height='128'>");
                }
                out.println("<h2>" + listsublistsub.get(i).getNombre() + "</h2>");
                out.print("<p>");
                out.println("Descripción del producto presentado. Descripción del producto presentado.");
                out.println("Descripción del producto presentado.");
                out.println("</div >");
            }
            response.setContentType("image/png");
            processRequest(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(CargarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CargarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

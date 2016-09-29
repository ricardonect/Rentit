/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rentit.modelo;

/**
 *
 * @author Ricardo
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private String servidor = "localhost";
    private String bd = "rentit";
    private String login = "root";
    private String password = "/123rmarin";
    private String url = "jdbc:mysql://" + servidor + "/" + bd;
    private String driver = "com.mysql.jdbc.Driver";
    Connection conn = null;
    Statement st = null;
    ResultSet r = null;

    public void Conexion() throws SQLException {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Close() throws SQLException {
        try {
            Class.forName(driver);
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrar(String tabla, String datos) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " ... Ok");
                st = conn.createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
                st.executeUpdate("INSERT  INTO " + tabla + " VALUES" + "(" + datos + ")");
                conn.close();
                st.close();
                JOptionPane.showMessageDialog(null, "Los datos han sido guardados");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
            JOptionPane.showMessageDialog(null, "Los datos no han sido guardados");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public String Generarcodigo(String tabla) {
        int resultado = 0;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " ... Ok");
                st = conn.createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
                r = st.executeQuery("SELECT COUNT(*) FROM " + tabla);
                r.next();
                resultado = r.getInt(1) + 1;
                st.close();
                conn.close();
                r.close();
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        if (resultado <= 9) {
            return "0" + resultado;
        } else {
            return "" + resultado;
        }
    }

    public void Actualizar(String datos) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " ... Ok");
                st = conn.createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
                st.executeUpdate(datos);
                conn.close();
                st.close();
                JOptionPane.showMessageDialog(null, "Los datos han sido Actualizados");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
            JOptionPane.showMessageDialog(null, "Los datos no han sido Actualizados");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public void Eliminar(String datos) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " ... Ok");
                st = conn.createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
                st.executeUpdate(datos);
                conn.close();
                st.close();
                JOptionPane.showMessageDialog(null, "Los datos han sido Eliminados");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
            JOptionPane.showMessageDialog(null, "Los datos no han sido Eliminados");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public String Buscar(String datos, String id) {
        String dato = "";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {

                st = conn.createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
                r = st.executeQuery(datos);
                r.next();
                dato = r.getString(id);
                st.close();
                conn.close();
                r.close();
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return dato;
    }

    public Integer BuscarEntero(String datos, String id) {
        int dato = 0;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                st = conn.createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
                r = st.executeQuery(datos);
                r.next();
                dato = r.getInt(id);
                st.close();
                conn.close();
                r.close();
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return dato;
    }

}

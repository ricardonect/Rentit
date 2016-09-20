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
import javax.swing.JOptionPane;

public class Conexion {

    public String servidor = "localhost";
    public String bd = "rentit";
    public String login = "root";
    public String password = "/123rmarin";
    public String url = "jdbc:mysql://" + servidor + "/" + bd;
    public String driver = "com.mysql.jdbc.Driver";
    Connection conn = null;
    Statement st = null;
    ResultSet r = null;

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

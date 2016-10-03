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

    private final String servidor = "localhost";
    private final String bd = "rentit";
    private final String login = "root";
    private final String password = "/123rmarin";
    private final String url = "jdbc:mysql://" + servidor + "/" + bd;
    private final String driver = "com.mysql.jdbc.Driver";
    public Connection con;
    public Statement st = null;
    public ResultSet rs = null;

    public boolean Conexion() throws SQLException {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Cargar Driver de Sunpara ODBC
     */
    public void cargaDriver() {
        try { //Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el Controlador");
        }
    }

    /**
     * metodo ejecutar ddl
     *
     * @param sql
     * @return True si pudo ejecutar la sentencia
     */
    public boolean ejecutar(String sql) {
        Statement st = null;
        rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * True si pudo ejecutar la sentencia
     *
     * @param sql
     * @return True si el ResultSet es diferente de vacio
     */
    public boolean ejecutarConsulta(String sql) {
        Statement st = null;
        rs = null;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (!rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * metodo ejecutardml
     *
     * @param sql
     * @return True si puede realizar la sentencia dml
     */
    public boolean ejecutarDml(String sql) {
        Statement st = null;
        rs = null;
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * ejecuta sentencias dml
     *
     * @param sql
     * @return returna un valor mayor 0 si ejecuto la sentencia dml
     */
    public int ejecutarDmlInt(String sql) {
        Statement st = null;
        rs = null;
        try {
            st = con.createStatement();
            return (st.executeUpdate(sql));
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     *
     * cierra la conexion a la Base de datos
     */
    public void cerrarConexion() {
        try {
            con.close();
        } catch (Exception e) {
            e.toString();
        }
    }

}

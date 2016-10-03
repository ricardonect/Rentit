/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rentit.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class SubCategorias {

    private long id_subcategoria;
    private long id_categoria;
    private String nombre;

    public SubCategorias() {
    }

    public SubCategorias(long id_subcategoria, long id_categoria, String nombre) {
        this.id_subcategoria = id_subcategoria;
        this.id_categoria = id_categoria;
        this.nombre = nombre;
    }

    public long getId_categoria() {
        return id_categoria;
    }

    public long getId_subcategoria() {
        return id_subcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_categoria(long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setId_subcategoria(long id_subcategoria) {
        this.id_subcategoria = id_subcategoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<SubCategorias> ListarSubCategorias() throws SQLException {

        String sql = "SELECT * FROM rentit.subcategorias";
        List<SubCategorias> subcategorias = new ArrayList<SubCategorias>();

        try {
            Conexion con = new Conexion();
            con.cargaDriver();
            con.Conexion();
            if (con.ejecutar(sql)) {

                while (con.rs.next()) {
                    SubCategorias sub = new SubCategorias();
                    sub.setId_subcategoria(con.rs.getLong("id_subcategoria"));
                    sub.setId_categoria(con.rs.getLong("id_categoria"));
                    sub.setNombre(con.rs.getString("nombre"));
                    subcategorias.add(sub);
                }
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return subcategorias;
    }

}

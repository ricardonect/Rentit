/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rentit.modelo;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RicardoMarin
 */
public class ImagenesCategorias {

    private long id_imagen;
    private long id_categoria;
    private long id_sub_categoria;
    private Blob image;

    public ImagenesCategorias() {
    }

    public ImagenesCategorias(long id_imagen, long id_categoria, long id_sub_categoria, Blob image) {
        this.id_imagen = id_imagen;
        this.id_categoria = id_categoria;
        this.id_sub_categoria = id_sub_categoria;
        this.image = image;
    }

    public long getId_categoria() {
        return id_categoria;
    }

    public long getId_imagen() {
        return id_imagen;
    }

    public long getId_sub_categoria() {
        return id_sub_categoria;
    }

    public Blob getImage() {
        return image;
    }

    public void setId_categoria(long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setId_imagen(long id_imagen) {
        this.id_imagen = id_imagen;
    }

    public void setId_sub_categoria(long id_sub_categoria) {
        this.id_sub_categoria = id_sub_categoria;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public List<ImagenesCategorias> ListarImagenes() {
        String sql = "SELECT * FROM rentit.imagenes_categorias";
        List<ImagenesCategorias> imagenes = new ArrayList<ImagenesCategorias>();

        try {
            Conexion con = new Conexion();
            con.cargaDriver();
            con.Conexion();
            if (con.ejecutar(sql)) {

                while (con.rs.next()) {
                    ImagenesCategorias img = new ImagenesCategorias();
                    img.setId_imagen(con.rs.getLong("id_imagen"));
                    img.setId_categoria(con.rs.getLong("id_categoria"));
                    img.setId_sub_categoria(con.rs.getLong("id_sub_categoria"));
                    img.setImage(con.rs.getBlob("imagen"));
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return imagenes;
    }

    public List<ImagenesCategorias> BuscarImagenesPorCategoria(long idCategoria) {
        String sql = "SELECT * FROM rentit.imagenes_categorias where id_categoria = " + idCategoria;
        List<ImagenesCategorias> imagenes = new ArrayList<ImagenesCategorias>();

        try {
            Conexion con = new Conexion();
            con.cargaDriver();
            con.Conexion();
            if (con.ejecutar(sql)) {

                while (con.rs.next()) {
                    ImagenesCategorias img = new ImagenesCategorias();
                    img.setId_imagen(con.rs.getLong("id_imagen"));
                    img.setId_categoria(con.rs.getLong("id_categoria"));
                    img.setId_sub_categoria(con.rs.getLong("id_sub_categoria"));
                    img.setImage(con.rs.getBlob("imagen"));
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return imagenes;
    }

}

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
public class Categorias {
    
    private long id_categoria;
    private String nombre;

    public Categorias() {
    }

    public Categorias(long id_producto, String nombre) {
        this.id_categoria = id_producto;
        this.nombre = nombre;
    }

    public long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    
    
}

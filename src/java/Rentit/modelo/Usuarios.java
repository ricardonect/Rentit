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
public class Usuarios {
    
    private long id_usuario;
    private String usuario;
    private String password;
    
    public Usuarios() {
    }

    public long getId_usuario() {
        return id_usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String GetUser(String usr, String psw){
        String query = "SELECT * FROM usuarios WHERE usuario = " + usr + "AND " + psw;
        return query;
    }
    
    
}

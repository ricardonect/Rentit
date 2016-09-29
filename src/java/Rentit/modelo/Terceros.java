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
public class Terceros {

    private long id_tercero;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private int tipo_documento;
    private long documento_identificacion;
    private String lugar_expedicion;
    private String fecha_expedicion;
    private String email;
    private String celular;
    private String fecha_nacimiento;
    private int pais;
    private int ciudad;
    private int departamento;

    public Terceros() {
    }

    public Terceros(String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, int tipo_documento, long documento_identificacion, String lugar_expedicion, String fecha_expedicion, String email, String celular, String fecha_nacimiento, int pais, int ciudad, int departamento) {
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.tipo_documento = tipo_documento;
        this.documento_identificacion = documento_identificacion;
        this.lugar_expedicion = lugar_expedicion;
        this.fecha_expedicion = fecha_expedicion;
        this.email = email;
        this.celular = celular;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais = pais;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public Terceros(long id_tercero, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, int tipo_documento, long documento_identificacion, String lugar_expedicion, String fecha_expedicion, String email, String celular, String fecha_nacimiento, int pais, int ciudad, int departamento) {
        this.id_tercero = id_tercero;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.tipo_documento = tipo_documento;
        this.documento_identificacion = documento_identificacion;
        this.lugar_expedicion = lugar_expedicion;
        this.fecha_expedicion = fecha_expedicion;
        this.email = email;
        this.celular = celular;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais = pais;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public String getCelular() {
        return celular;
    }

    public int getCiudad() {
        return ciudad;
    }

    public int getDepartamento() {
        return departamento;
    }

    public long getDocumento_identificacion() {
        return documento_identificacion;
    }

    public String getEmail() {
        return email;
    }

    public String getFecha_expedicion() {
        return fecha_expedicion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public long getId_tercero() {
        return id_tercero;
    }

    public String getLugar_expedicion() {
        return lugar_expedicion;
    }

    public int getPais() {
        return pais;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public int getTipo_documento() {
        return tipo_documento;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public void setDocumento_identificacion(long documento_identificacion) {
        this.documento_identificacion = documento_identificacion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFecha_expedicion(String fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setId_tercero(long id_tercero) {
        this.id_tercero = id_tercero;
    }

    public void setLugar_expedicion(String lugar_expedicion) {
        this.lugar_expedicion = lugar_expedicion;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public void setTipo_documento(int tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

}

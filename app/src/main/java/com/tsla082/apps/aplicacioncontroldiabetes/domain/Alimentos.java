package com.tsla082.apps.aplicacioncontroldiabetes.domain;

import java.util.Date;

/**
 * Created by Luis on 26/04/2016.
 */
public class Alimentos {

    private Date fecha_comida;
    private String numero_comida;
    private String tipo_comida;
    private String nombre_comida;

    public Alimentos(Date fecha_comida, String numero_comida, String tipo_comida, String nombre_comida) {
        this.fecha_comida = fecha_comida;
        this.numero_comida = numero_comida;
        this.tipo_comida = tipo_comida;
        this.nombre_comida = nombre_comida;
    }

    public String getNumero_comida() {
        return numero_comida;
    }

    public void setNumero_comida(String numero_comida) {
        this.numero_comida = numero_comida;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public String getNombre_comida() {
        return nombre_comida;
    }

    public void setNombre_comida(String nombre_comida) {
        this.nombre_comida = nombre_comida;
    }

    public Date getFecha_comida() {
        return fecha_comida;
    }

    public void setFecha_comida(Date fecha_comida) {
        this.fecha_comida = fecha_comida;
    }
}

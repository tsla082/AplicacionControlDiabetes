package com.tsla082.apps.aplicacioncontroldiabetes.domain;

import java.util.Date;

/**
 * Created by Luis on 26/04/2016.
 */
public class AlimentosMedicacion {

    private Date fecha_registro;
    private boolean tome_medicacion;

    public AlimentosMedicacion(Date fecha_registro, boolean tome_medicacion) {
        this.fecha_registro = fecha_registro;
        this.tome_medicacion = tome_medicacion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public boolean isTome_medicacion() {
        return tome_medicacion;
    }

    public void setTome_medicacion(boolean tome_medicacion) {
        this.tome_medicacion = tome_medicacion;
    }
}

package com.tsla082.apps.aplicacioncontroldiabetes.data;

import com.tsla082.apps.aplicacioncontroldiabetes.domain.Alimentos;
import com.tsla082.apps.aplicacioncontroldiabetes.domain.AlimentosMedicacion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis on 26/04/2016.
 */
public interface  AlimentosControlDAO {

    void obtenerAlimento(Alimentos Alimentos);
    List<Alimentos> obtenerAlimentos();
    long registrarAlimentosPersona(AlimentosMedicacion AlimentosMedicacion,ArrayList<Alimentos> Alimentos);

}

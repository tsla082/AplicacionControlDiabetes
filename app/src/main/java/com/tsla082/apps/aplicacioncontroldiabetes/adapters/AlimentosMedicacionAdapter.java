package com.tsla082.apps.aplicacioncontroldiabetes.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.tsla082.apps.aplicacioncontroldiabetes.R;
import com.tsla082.apps.aplicacioncontroldiabetes.bean.AlimentosObjetos;

import java.util.List;

/**
 * Created by Luis on 03/04/2016.
 */
public class AlimentosMedicacionAdapter extends BaseAdapter {

    Context context;
    List<AlimentosObjetos> AlimentosMedicacionAdapter;

    public AlimentosMedicacionAdapter(Context context, List<AlimentosObjetos> AlimentosMedicacionAdapter) {
        this.context = context;
        this.AlimentosMedicacionAdapter = AlimentosMedicacionAdapter;
    }

    @Override
    public int getCount() {
        return AlimentosMedicacionAdapter.size();
    }

    @Override
    public Object getItem(int position) {
        return AlimentosMedicacionAdapter.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HolderListaAlimentos holderListaAlimentos;

        if(convertView==null){

            convertView= LayoutInflater.from(context).inflate(R.layout.lista_custom_alimentos_y_medicacion,null);

            holderListaAlimentos=new HolderListaAlimentos();

         //   holderListaAlimentos.numcomida=(TextView) convertView.findViewById(R.id.txtnumerocomida);
         //   holderListaAlimentos.tipocomida=(TextView) convertView.findViewById(R.id.txttipocomida);
            holderListaAlimentos.alimentotipo=(TextView) convertView.findViewById(R.id.txtcomidatipo);
            holderListaAlimentos.selectedfood=(CheckBox) convertView.findViewById(R.id.chkMantener);

            convertView.setTag(holderListaAlimentos);

        }
        else{
            holderListaAlimentos=(HolderListaAlimentos)  convertView.getTag();
        }
        if(AlimentosMedicacionAdapter!=null){
         //   holderListaAlimentos.numcomida.setText(AlimentosMedicacionAdapter.get(position).getTipoComida());
         //   holderListaAlimentos.tipocomida.setText(AlimentosMedicacionAdapter.get(position).getIdentidad());
            holderListaAlimentos.alimentotipo.setText(AlimentosMedicacionAdapter.get(position).getAlimentos());
            holderListaAlimentos.selectedfood.setChecked(AlimentosMedicacionAdapter.get(position).isSelected());


        }

        return convertView;
    }

    static class HolderListaAlimentos{

      //  TextView numcomida;
      //  TextView tipocomida;
         TextView alimentotipo;
         CheckBox selectedfood;

     }

}

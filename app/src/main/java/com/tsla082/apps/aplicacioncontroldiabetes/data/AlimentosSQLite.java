package com.tsla082.apps.aplicacioncontroldiabetes.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.tsla082.apps.aplicacioncontroldiabetes.AdminSQLiteOpenHelper;
import com.tsla082.apps.aplicacioncontroldiabetes.domain.Alimentos;
import com.tsla082.apps.aplicacioncontroldiabetes.domain.AlimentosMedicacion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Luis on 26/04/2016.
 */
public class AlimentosSQLite implements AlimentosControlDAO {

    AdminSQLiteOpenHelper adminSQLiteOpenHelper;

    public AlimentosSQLite(Context Context) {
        Log.d("basededatos", "AlimentosSQLite");
        adminSQLiteOpenHelper = new AdminSQLiteOpenHelper(Context);
    }

    @Override
    public void obtenerAlimento(Alimentos Alimentos) {

        SQLiteDatabase sqLiteDatabase=adminSQLiteOpenHelper.getReadableDatabase();

        Cursor cursor=sqLiteDatabase.query(AlimentosDBContract.AlimentosEntry.TABLE_NAME,
                null,
                AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_DATE + "=?",
                null,//array of date
                null,null,null,null
                );

        if(cursor.moveToFirst()){
            try {
                String fecha=cursor.getString(cursor.getColumnIndex(AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_DATE));
                DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
                Date date=dateFormat.parse(fecha);

                        Alimentos.setFecha_comida(date);
                        Alimentos.setNombre_comida(cursor.getString(cursor.getColumnIndex(AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_NAME)));
                        Alimentos.setNumero_comida(cursor.getString(cursor.getColumnIndex(AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_NUMBER)));
                        Alimentos.setTipo_comida(cursor.getString(cursor.getColumnIndex(AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_KIND)));

            }
            catch(Error e){
                e.getMessage();
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        sqLiteDatabase.close();

    }

    @Override
    public List<Alimentos> obtenerAlimentos() {

        SQLiteDatabase sqLiteDatabase=adminSQLiteOpenHelper.getReadableDatabase();



        return null;
    }

    @Override
    public long registrarAlimentosPersona(AlimentosMedicacion AlimentosMedicacion, ArrayList<Alimentos> Alimentos) {
        return 0;
    }


}

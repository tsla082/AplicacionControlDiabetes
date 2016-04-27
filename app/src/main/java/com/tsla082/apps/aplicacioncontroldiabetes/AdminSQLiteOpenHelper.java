package com.tsla082.apps.aplicacioncontroldiabetes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.tsla082.apps.aplicacioncontroldiabetes.data.AlimentosDBContract;
import com.tsla082.apps.aplicacioncontroldiabetes.data.AlimentosMedicacionDBContract;
import com.tsla082.apps.aplicacioncontroldiabetes.domain.AlimentosMedicacion;

/**
 * Created by Eduardo on 23/04/2016.
 */
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Pac.db";
    public static final String TABLE_NAME = "person";

    //luis control alimentos
    public static final String CREATE_TABLE_ALIMENTOS_CONTROL =
            "CREATE TABLE " + AlimentosDBContract.AlimentosEntry.TABLE_NAME + " ( " +
                              AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_DATE + " DATE , " +
                              AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_NUMBER + " TEXT , " +
                              AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_KIND + " TEXT , " +
                              AlimentosDBContract.AlimentosEntry.COLUMN_FOOD_NAME + " TEXT " + " ) ";
    public static final String CREATE_TABLE_ALIMENTOS_CONTROL_REGISTRO =
            "CREATE TABLE " + AlimentosMedicacionDBContract.AlimentosMedicacionEntries.TABLE_NAME + "( "+
                              AlimentosMedicacionDBContract.AlimentosMedicacionEntries.COLUMN_FOOD_DATE+" DATE ,"+
                              AlimentosMedicacionDBContract.AlimentosMedicacionEntries.COLUMN_MEDICATION_STATE+" INTEGER "+" )";
    //hola
    //fin luis control alimentos

    public AdminSQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    //creamos la tabla
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("basededatos", "onCreate");
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, apellidop TEXT, apellidom TEXT, celular TEXT)");
        db.execSQL(CREATE_TABLE_ALIMENTOS_CONTROL);
        db.execSQL(CREATE_TABLE_ALIMENTOS_CONTROL_REGISTRO);
    }

    //borrar la tabla y crear la nueva tabla
    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnte, int versionNue) {
        Log.d("basededatos", "onUpgrade");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+AlimentosDBContract.AlimentosEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+AlimentosMedicacionDBContract.AlimentosMedicacionEntries.TABLE_NAME);
         onCreate(db);
    }
}

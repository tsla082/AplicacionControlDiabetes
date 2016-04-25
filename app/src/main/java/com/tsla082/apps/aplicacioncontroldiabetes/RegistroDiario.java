package com.tsla082.apps.aplicacioncontroldiabetes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RegistroDiario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_diario);
    }

    public void atras(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}

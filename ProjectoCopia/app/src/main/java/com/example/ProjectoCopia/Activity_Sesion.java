package com.example.ProjectoCopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.propuesta_mapa);
    }

    public void IrAAjustes(View view){
        Intent ajustes = new Intent( this, EjecutarAjustes.class);
        startActivity(ajustes);
    }

    public void Alarma(View view){
        Intent alarma = new Intent( this, ActivityAlarma.class);
        startActivity(alarma);
    }
}
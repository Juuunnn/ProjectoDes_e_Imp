package com.example.ProjectoCopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EjecutarAjustes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajustes);
    }

    public void Volver(View view){
        Intent volver = new Intent( this, MapsActivity.class);
        startActivity(volver);
    }

    public void CerrarSesion(View view){
        Intent cerrar = new Intent( this, MainActivity.class);
        startActivity(cerrar);
    }

}
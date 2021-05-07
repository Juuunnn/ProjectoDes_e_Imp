package com.example.ProjectoCopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //Método botón Siguiente
    public void Siguiente(View view){
        Intent siguiente = new Intent( this, MapsActivity.class);
        startActivity(siguiente);
        finish();
        return;
    }

    public void CrearCuenta(View view){
        Intent crea = new Intent( this, ActivityRegistro.class);
        startActivity(crea);
    }

    public void Recuperar(View view){
        Intent recupera = new Intent( this, ActivityRecuperar.class);
        startActivity(recupera);
    }
}
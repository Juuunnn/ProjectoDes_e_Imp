package com.example.ProjectoCopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityRecuperar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperar_cuenta);
    }

    public void IrAInicio(View view){
        Intent siguiente = new Intent( this, MainActivity.class);
        startActivity(siguiente);
    }
}
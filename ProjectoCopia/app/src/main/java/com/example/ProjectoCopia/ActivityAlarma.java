package com.example.ProjectoCopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityAlarma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_alarma);
    }
    public void Volver(View view){
        Intent siguiente = new Intent( this, MapsActivity.class);
        startActivity(siguiente);
    }
}
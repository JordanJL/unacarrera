package com.example.jorji.unacarrera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Actividad02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);
        // A continuación mi código para OnCreate
        Mensaje("Bienvenido Actividad 01");
        // alambramos el Button
        Button MiButton = (Button) findViewById(R.id.btnCompletado);

        //Programamos el evento onclick

        MiButton.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View arg0) {

                // escriba lo que desea hacer
                Intent intento = new Intent(getApplicationContext(), Actividad03.class);
                startActivity(intento);

            }

        });

    } // Fin del Oncreate de la Actividad 01

    public void Mensaje(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();};


} // [13:18:01] Fin de la Clase Actividad 01
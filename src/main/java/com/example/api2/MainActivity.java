package com.example.api2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.os.Handler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int DELAY_TIME = 5000;

        // Usa Handler para programar la tarea de cambiar de actividad después del retraso
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crea un intent para abrir la segunda actividad
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);

                // Cierra la actividad actual para que el usuario no pueda volver a ella presionando el botón de retroceso
                finish();
            }
        }, DELAY_TIME);
    }
}
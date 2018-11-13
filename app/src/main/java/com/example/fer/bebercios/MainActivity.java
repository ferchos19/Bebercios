package com.example.fer.bebercios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton = (Button) findViewById(R.id.boton);
        texto = (TextView) findViewById(R.id.texto);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String[] myString = getResources().getStringArray(R.array.YoNunca);
                texto.setText(myString[.nextInt(myString.length)]););


            }
        });

    }

}

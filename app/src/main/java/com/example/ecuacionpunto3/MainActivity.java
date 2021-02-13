package com.example.ecuacionpunto3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numA;
    private EditText numB;
    private EditText numC;
    private TextView respX1;
    private TextView respX2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casteo();
    }

    public void  casteo() {
        numA = (EditText) findViewById(R.id.etNumberA);
        numB = (EditText) findViewById(R.id.etNumberB);
        numC = (EditText) findViewById(R.id.etNumberC);
        respX1 = (TextView) findViewById(R.id.tvResultado);
        respX2 = (TextView) findViewById(R.id.tvResultado2);

    }

    public void factorizar(View view) {
        double numeroA = Double.parseDouble(numA.getText().toString());
        double numeroB = Double.parseDouble(numB.getText().toString());
        double numeroC = Double.parseDouble(numC.getText().toString());
        double factor = (-numeroB + (Math.sqrt(Math.pow(numeroB,2)-4*numeroA*numeroC)));
        double factor2 = (-numeroB - (Math.sqrt(Math.pow(numeroB,2)-4*numeroA*numeroC)));
        double resul = factor/(2*numeroA);
        double resul2 = factor2/(2*numeroA);
        respX1.setText(" X1 = "+ resul);
        respX2.setText(" X2 = " + resul2 );

    }
}
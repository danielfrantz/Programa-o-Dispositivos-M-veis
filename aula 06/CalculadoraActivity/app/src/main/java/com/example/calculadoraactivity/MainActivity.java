package com.example.calculadoraactivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ednumero1, ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ednumero1 = (EditText) findViewById(R.id.ednumero1 );
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        btsomar.setOnClickListener(v -> {
            double num1 = Double.parseDouble(ednumero1.getText().toString());
            double num2 = Double.parseDouble(ednumero2.getText().toString());
            double soma = num1 + num2;
            double subtracao = num1 - num2;
            double multiplicacao = num1 * num2;
            double divisao = num1 / num2;

//            Log.d("soma", "onCreate: soma - "+soma);

            AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Resuldao da soma")
                    .setMessage("A soma é: " + soma)
                    .setNeutralButton("OK", null)
                    .show();
        });

        btsubtrair.setOnClickListener(v -> {
            double num1 = Double.parseDouble(ednumero1.getText().toString());
            double num2 = Double.parseDouble(ednumero2.getText().toString());
            double soma = num1 + num2;
            double subtracao = num1 - num2;

            AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Resuldao da soma")
                    .setMessage("A subtração é: " + subtracao)
                    .setNeutralButton("OK", null)
                    .show();
        });

        btmultiplicar.setOnClickListener(v -> {
            double num1 = Double.parseDouble(ednumero1.getText().toString());
            double num2 = Double.parseDouble(ednumero2.getText().toString());
            double multiplicacao = num1 * num2;

            AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Resuldao da soma")
                    .setMessage("A multiplicação é: " + multiplicacao)
                    .setNeutralButton("OK", null)
                    .show();
        });

        btdividir.setOnClickListener(v -> {
            double num1 = Double.parseDouble(ednumero1.getText().toString());
            double num2 = Double.parseDouble(ednumero2.getText().toString());
            double divisao = num1 / num2;

            AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Resuldao da soma")
                    .setMessage("A divisão é: " + divisao)
                    .setNeutralButton("OK", null)
                    .show();
        });
    }

}
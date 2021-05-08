package com.example.sistemadecompras;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class ComprasActivity extends AppCompatActivity {

    CheckBox chkarroz, chkleite, chkcarne, chkfeijao;
    Button bttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

        chkarroz = findViewById(R.id.Chkarroz);
        chkleite = findViewById(R.id.Chkleite);
        chkcarne = findViewById(R.id.Chkcarne);
        chkfeijao = findViewById(R.id.Chkfeijao);
        bttotal = findViewById(R.id.bttotal);

        bttotal.setOnClickListener(v -> {
            double total = 0;
            if (chkarroz.isChecked()){
                total += 2.69;
            }
            if (chkleite.isChecked()){
                total += 5;
            }
            if (chkcarne.isChecked()){
                total += 9.7;
            }
            if (chkfeijao.isChecked()){
                total += 2.30;
            }

            AlertDialog dialog = new AlertDialog.Builder(ComprasActivity.this)
                    .setTitle("Aviso")
                    .setMessage("Valor total da compra é: R$ " + total)
                    .setNeutralButton("OK", null)
                    .show();

        });

    }
}
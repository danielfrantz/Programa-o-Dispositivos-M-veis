package com.app.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListaContatosActivity extends AppCompatActivity {

    ListView lista_contatos;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_contatos = findViewById(R.id.lista_contatos);

        lista_contatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nome = ((TextView) view).getText().toString();
                AlertDialog.Builder dialogo = new AlertDialog.Builder(
                        ListaContatosActivity.this);
                dialogo.setTitle("Contato");
                dialogo.setMessage("Contato selecionado: " + nome);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}
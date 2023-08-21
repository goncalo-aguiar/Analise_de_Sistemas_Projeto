package com.example.ihc_projeto_oficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Submeter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submeter);

        TextView aux = (TextView)findViewById(R.id.recolha) ;
        String aux1 = getIntent().getStringExtra("deonde");
        aux.setText(aux1);

        TextView aux2 = (TextView)findViewById(R.id.Destino) ;
        aux1 = getIntent().getStringExtra("ponde");
        aux2.setText(aux1);

        TextView aux33 = (TextView)findViewById(R.id.peso) ;
        aux1 = getIntent().getStringExtra("peso");
        aux33.setText(aux1);

        TextView aux44 = (TextView)findViewById(R.id.numero_malas) ;
        aux1 = getIntent().getStringExtra("nmalas");
        aux44.setText(aux1);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptras();
            }
        });

        Button submit = (Button) findViewById(R.id.submeter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submeter();
            }
        });
    }

    public void ptras(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("caller","submetido");
        startActivity(intent);
    }

    public void submeter(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("caller","submetido1");
        startActivity(intent);
    }
}
package com.example.ihc_projeto_oficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmCancel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_cancel);

        Button sim = (Button) findViewById(R.id.sim);
        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sim();
            }
        });

        Button nao = (Button) findViewById(R.id.nao);
        nao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nao();
            }
        });
    }

    public void sim(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("caller","sim");
        startActivity(intent);
    }

    public void nao(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("caller","nao");
        startActivity(intent);
    }
}
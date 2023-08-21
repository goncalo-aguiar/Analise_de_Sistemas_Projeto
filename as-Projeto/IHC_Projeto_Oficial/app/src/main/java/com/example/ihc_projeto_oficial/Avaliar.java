package com.example.ihc_projeto_oficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Avaliar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliar);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptras();
            }
        });

        Button aval = (Button) findViewById(R.id.avaliar1);
        aval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aval();
            }
        });


    }

    public void ptras(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void aval(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
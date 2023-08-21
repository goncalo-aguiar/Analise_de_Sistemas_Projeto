package com.example.ihc_projeto_oficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptras();
            }
        });

        String x = getIntent().getStringExtra("email1");
        TextView mail = findViewById(R.id.mail);
        mail.setText(x);


    }
    public void ptras(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
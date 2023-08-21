package com.example.ihc_projeto_oficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Contactar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactar);

        ImageButton back = (ImageButton)  findViewById(R.id.call2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptras();
            }
        });
    }


    public void ptras(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
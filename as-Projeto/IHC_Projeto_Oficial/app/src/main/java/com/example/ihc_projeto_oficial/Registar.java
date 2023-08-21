package com.example.ihc_projeto_oficial;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Registar extends AppCompatActivity {
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar2);

        register = (Button)findViewById(R.id.register2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Register();
            }
        });
    }

    public void open_Register(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}
package com.example.ihc_projeto_oficial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {


    private Button login;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Quest_Inicial();
            }
        });
        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Register();
            }
        });
    }
    public void open_Quest_Inicial(){
        Intent intent = new Intent(this,MainActivity.class);
        EditText email = (EditText)findViewById(R.id.username);
        String x = email.getText().toString();
        intent.putExtra("email", x);
        startActivity(intent);
    }
    public void open_Register(){
        Intent intent = new Intent(this,Registar.class);
        startActivity(intent);
    }

}
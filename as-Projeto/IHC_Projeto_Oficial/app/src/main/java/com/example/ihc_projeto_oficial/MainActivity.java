package com.example.ihc_projeto_oficial;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ihc_projeto_oficial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        String caller;
        caller = getIntent().getStringExtra("caller");
        String aux = "submetido";
        String aux1 = "submetido1";
        //Log.d("myTag", caller);
        try{
            if (caller.equals(aux)){
                getIntent().removeExtra("caller");
                Button x = (Button)findViewById(R.id.next);
                x.performClick();
            }
            /*else if (caller.equals(aux1)){
              *//*  NavGraph navGraph = navController.getGraph();
                navGraph.setStartDestination(R.id.navigation_notifications);
                navController.setGraph(navGraph);*//*
                navController.navigate(R.id.action_firstFragment_to_secondFragment);


            }
            else{
                NavGraph navGraph = navController.getGraph();
                navGraph.setStartDestination(R.id.navigation_home);
                navController.setGraph(navGraph);
            }*/
        }
        catch (Exception e){

        }


    }

}
package com.example.ihc_projeto_oficial.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.ihc_projeto_oficial.Avaliar;
import com.example.ihc_projeto_oficial.Contactos;
import com.example.ihc_projeto_oficial.Dados;
import com.example.ihc_projeto_oficial.Login;
import com.example.ihc_projeto_oficial.R;
import com.example.ihc_projeto_oficial.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button contactos = (Button) root.findViewById(R.id.Contactos);
        contactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Contactos();
            }
        });

        Button avaliar = (Button) root.findViewById(R.id.avaliar);
        avaliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_avaliar();
            }
        });

        Button dados = (Button) root.findViewById(R.id.dados);
        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_dados();
            }
        });

        Button terminar_sessao = (Button) root.findViewById(R.id.terminarsessao);
        terminar_sessao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_terminar();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void open_Contactos(){
        Intent intent = new Intent(getActivity(), Contactos.class);
        startActivity(intent);
    }
    public void open_dados(){
        Intent intent = new Intent(getActivity(), Dados.class);
        intent.putExtra("email1",getActivity().getIntent().getStringExtra("email"));
        startActivity(intent);
    }
    public void open_avaliar(){
        Intent intent = new Intent(getActivity(), Avaliar.class);
        startActivity(intent);
    }
    public void open_terminar(){
        Intent intent = new Intent(getActivity(), Login.class);
        startActivity(intent);
    }
}
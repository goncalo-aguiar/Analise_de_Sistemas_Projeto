package com.example.ihc_projeto_oficial.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.ihc_projeto_oficial.Avaliar;
import com.example.ihc_projeto_oficial.Contactos;
import com.example.ihc_projeto_oficial.Dados;
import com.example.ihc_projeto_oficial.HomeFragment2;
import com.example.ihc_projeto_oficial.Login;
import com.example.ihc_projeto_oficial.PedidoFragment;
import com.example.ihc_projeto_oficial.R;
import com.example.ihc_projeto_oficial.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        String caller = getActivity().getIntent().getStringExtra("caller");
        String aux = "submetido1";
        try {
            if (caller.equals(aux)||caller.equals("nao")){
                ImageView imagem = root.findViewById(R.id.imagem2);
                imagem.setVisibility(View.INVISIBLE);
                mostrarPedido();
            }
        }
        catch(Exception e){

        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void mostrarPedido(){
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl4,new PedidoFragment());
        fragmentTransaction.commit();

    }

}
package com.example.ihc_projeto_oficial;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ihc_projeto_oficial.ui.notifications.NotificationsFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PedidoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PedidoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PedidoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PedidoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PedidoFragment newInstance(String param1, String param2) {
        PedidoFragment fragment = new PedidoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pedido, container, false);


        Button x = (Button) view.findViewById(R.id.cancelar);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelar();
            }
        });

        Button y = (Button) view.findViewById(R.id.contact);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactar();
            }
        });
        return view;
    }

    public void cancelar(){
        Intent intent = new Intent(getActivity(),ConfirmCancel.class);
        startActivity(intent);
    }
    public void contactar(){
        Intent intent = new Intent(getActivity(),Contactar.class);
        startActivity(intent);
    }
}
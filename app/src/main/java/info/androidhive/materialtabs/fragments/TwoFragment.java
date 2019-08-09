package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.Persegi;
import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.persegipanjang;
import info.androidhive.materialtabs.activity.segitiga1;


public class TwoFragment extends Fragment{
    Button persegipanjang;
    Button persegi;
    Button segitiga;
    Button lingkaran;


    public TwoFragment() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container,false);
        persegipanjang = view.findViewById(R.id.btnpersegipanjang);
        persegi =  view.findViewById(R.id.persegi);
        lingkaran = view.findViewById(R.id.lingkaran);
        segitiga = view.findViewById(R.id.segitiga);


        persegipanjang=(Button)view.findViewById(R.id.btnpersegipanjang);
        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(),persegipanjang .class);
                startActivity(in);

        }
        });
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Persegi.class);
                startActivity(in);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), segitiga1.class);
                startActivity(in);
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(),lingkaran.class);
                startActivity(in);
            }
        });
        return view;


    }

}

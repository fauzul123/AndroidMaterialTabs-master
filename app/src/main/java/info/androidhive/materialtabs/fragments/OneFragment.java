package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText Angka1;
    EditText Angka2;
    TextView result;
    Button btntambah;
    Button btnkali;
    Button btnkurang;
    Button btnbagi;


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Angka1 = view.findViewById(R.id.txtAngka1);
        Angka2 = view.findViewById(R.id.txtAngka2);
        btntambah = view.findViewById(R.id.txttambah);
        btnkali = view.findViewById(R.id.txtkali);
        btnkurang = view.findViewById(R.id.txtkurang);
        btnbagi = view.findViewById(R.id.txtbagi);
        result = view.findViewById(R.id.hasil);
        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = Angka1.getText().toString();
                double ubah = Double.parseDouble(angka);
                String angka2 = Angka2.getText().toString();
                double ubah2 = Double.parseDouble(angka2);
                double tambah = ubah + ubah2;
                result.setText(String.valueOf(tambah));

            }


        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = Angka1.getText().toString();
                double ubah = Double.parseDouble(angka);
                String angka2 = Angka2.getText().toString();
                double ubah2 = Double.parseDouble(angka2);
                double tambah = ubah * ubah2;
                result.setText(String.valueOf(tambah));

            }


        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = Angka1.getText().toString();
                double ubah = Double.parseDouble(angka);
                String angka2 = Angka2.getText().toString();
                double ubah2 = Double.parseDouble(angka2);
                double tambah = ubah - ubah2;
                result.setText(String.valueOf(tambah));

            }


        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = Angka1.getText().toString();
                double ubah = Double.parseDouble(angka);
                String angka2 = Angka2.getText().toString();
                double ubah2 = Double.parseDouble(angka2);
                double tambah = ubah / ubah2;
                result.setText(String.valueOf(tambah));

            }


        });
        return view;
    }
}

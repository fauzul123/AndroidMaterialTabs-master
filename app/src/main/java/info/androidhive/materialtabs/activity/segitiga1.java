package info.androidhive.materialtabs.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import info.androidhive.materialtabs.R;

public class segitiga1 extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
     EditText a,t;
     Button hitung;
     Button keliling;
    TextView txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga1);
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a = (EditText) findViewById(R.id.alas);
        t = (EditText) findViewById(R.id.tinggi);
        Button keliling = (Button) findViewById(R.id.keliling);
        hitung = (Button) findViewById(R.id.button);
        txthasil = (TextView) findViewById(R.id.txthasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.length() == 0 && t.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh kososng", Toast.LENGTH_LONG).show();

                } else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "Alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();


                } else {
                    String isipanjang = a.getText().toString();
                    String isilebar = t.getText().toString();
                    double a = Double.parseDouble(isipanjang);
                    double t = Double.parseDouble(isilebar);
                    double hs = LuasSegitiga1(a, t);
                    String output = String.valueOf(hs);
                    txthasil.setText(output.toString());

                }

            }

        });
        txthasil = (TextView) findViewById(R.id.txthasil);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.length() == 0 && t.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan tinggi tidak boleh kososng", Toast.LENGTH_LONG).show();
                } else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "Alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();


                } else {
                    String isipanjang = a.getText().toString();
                    String isilebar = t.getText().toString();
                    double a = Double.parseDouble(isipanjang);
                    double t = Double.parseDouble(isilebar);
                    double hs = KelilingSegitiga1(a, t);
                    String output = String.valueOf(hs);
                    txthasil.setText(output.toString());


                }
            }
        });
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
       public double KelilingSegitiga1(double  a, double t){return a+2*t;}
       public  double LuasSegitiga1(double a,double t){return a*t/2;}

}

package info.androidhive.materialtabs.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class persegipanjang extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText p,l;
    Button hitung;
    Button keliling;
    TextView hasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        p = (EditText) findViewById(R.id.panjang);
        l = (EditText) findViewById(R.id.lebar);
    keliling = (Button) findViewById(R.id.keliling);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.txthasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (p.length() == 0 && l.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();

                } else if (p.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                }

                else if (l.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();


                } else {
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = p*l;

                    hasil.setText(String.valueOf(hs));
                }

            }

        });

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (p.length() == 0 && l.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (p.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (l.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();


                } else {
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = Kelilingpersegipanjang(p, l);
                    hasil.setText(String.valueOf(hs));


                }
            }
        });
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    public double Luaspersegipanjang(double  p, double l){return p*l;}
    public  double Kelilingpersegipanjang(double p,double l){return 2*(p+l);}
    }


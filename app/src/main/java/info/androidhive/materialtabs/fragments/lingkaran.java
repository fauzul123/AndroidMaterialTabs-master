package info.androidhive.materialtabs.fragments;

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

public class lingkaran extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText r;
    Button hitung;
    TextView hasil;
    Button keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        r = (EditText)findViewById(R.id.jarijari);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txthasil);
        keliling = (Button) findViewById(R.id.keliling);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r.length()==0){
                    Toast.makeText(getApplication(),"JARI JARI tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isijarijari = r.getText().toString();
                    double r = Double.parseDouble(isijarijari);
                    double hs = LuasLingkaran(r);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }

            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r.length()==0){
                    Toast.makeText(getApplication(),"JARI JARI tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = r.getText().toString();
                    double r = Double.parseDouble(isisisi);
                    double hs = KelilingLingkaran(r);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }


            }
        });
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    public double LuasLingkaran(double r){return 3.14*r*r;}
    public double KelilingLingkaran(double r){return 2*3.14*r;}
}

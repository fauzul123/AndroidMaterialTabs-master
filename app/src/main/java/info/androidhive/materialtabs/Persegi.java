package info.androidhive.materialtabs;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
   EditText s;
   Button hitung;
   TextView hasil;
   Button keliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        s = (EditText)findViewById(R.id.sisi);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txthasil);
        keliling = (Button) findViewById(R.id.keliling);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = s*s;
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }

                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs =KelilingPersegi(s);
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
    public double LuasPersegi(double s){return s*s;}
    public double KelilingPersegi(double s){return 4*s;}
}

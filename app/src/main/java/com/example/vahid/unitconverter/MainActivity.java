package com.example.vahid.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    android.support.v7.widget.AppCompatSpinner spinner_1;
EditText txtNumber;

    Button btnSand;
    int pos;
    Intent intent;
    float n;

    final float cmtoinch = 0.3937f;
    final float mtoinch = 39.37f;
    final float ktoinch = 39370f;
    final float inchtoinch = 1f;


    final float cmtom = 0.01f;
    final float mtom = 1f;
    final float ktom = 1000f;
    final float inchtom =0.0254f;


    final float cmtok = 0.00001f;
    final float mtok = 0.001f;
    final float ktok = 1f;
    final float inchtok =0.00002f;


    final float cmtocm = 1f;
    final float mtocm = 100f;
    final float ktocm = 100000f;
    final float inchtocm = 2.540f;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
txtNumber = findViewById(R.id.edittxt);
spinner_1 = findViewById(R.id.spinner_1);

        btnSand = findViewById(R.id.btn_send);
        intent = new Intent(this, SecendActivity.class);
    }

    public void Result(View view) {
        pos = spinner_1.getSelectedItemPosition();
        n= Float.parseFloat(txtNumber.getText().toString());

        if(pos == 0){
            intent.putExtra("NUMBER_1", zarb(n, cmtocm));
            intent.putExtra("NUMBER_2", zarb(n, cmtom));
            intent.putExtra("NUMBER_3", zarb(n, cmtok));
            intent.putExtra("NUMBER_4", zarb(n, cmtoinch));

        }
        else if (pos==1){

            intent.putExtra("NUMBER_1", zarb(n, mtocm));
            intent.putExtra("NUMBER_2", zarb(n, mtom));
            intent.putExtra("NUMBER_3", zarb(n, mtok));
            intent.putExtra("NUMBER_4", zarb(n, ktoinch));

        }
        else if (pos==2){

            intent.putExtra("NUMBER_1", zarb(n, ktocm));
            intent.putExtra("NUMBER_2", zarb(n, ktom));
            intent.putExtra("NUMBER_3", zarb(n, ktok));
            intent.putExtra("NUMBER_4", zarb(n, ktoinch));

        }
        else if (pos==3){

            intent.putExtra("NUMBER_1", zarb(n, inchtocm));
            intent.putExtra("NUMBER_2", zarb(n, inchtom));
            intent.putExtra("NUMBER_3", zarb(n, inchtok));
            intent.putExtra("NUMBER_4", zarb(n, inchtoinch));

        }


        startActivity(intent);

    }
    public float zarb(float n1, float n2){
        return n1 * n2;
    }
    public float taghsim  (float n1,float n2){
    return n1 /  n2;
    }
//    function(arg1, arg2)
}

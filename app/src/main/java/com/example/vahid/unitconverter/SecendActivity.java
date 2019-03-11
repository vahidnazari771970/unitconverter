package com.example.vahid.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecendActivity extends AppCompatActivity {

    TextView txtShowNumber;
    TextView txtShowNumber1;
    TextView txtShowNumber2;
    TextView txtShowNumber3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);

        Bundle bundle = getIntent().getExtras();
        txtShowNumber = findViewById(R.id.txt_show_number);

        txtShowNumber.setText(bundle.getFloat("NUMBER_1")+"cm");
        txtShowNumber1=findViewById(R.id.txt_show_number1);
        txtShowNumber1.setText(bundle.getFloat("NUMBER_2")+"m");
        txtShowNumber2=findViewById(R.id.txt_show_number2);
        txtShowNumber2.setText(bundle.getFloat("NUMBER_3")+"k");
        txtShowNumber3=findViewById(R.id.txt_show_number3);
        txtShowNumber3.setText(bundle.getFloat("NUMBER_4")+"inch");

    }
}

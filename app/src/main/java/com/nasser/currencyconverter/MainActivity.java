package com.nasser.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToRiyal (View view){
        TextView dollars = findViewById(R.id.amount) ;
        double dollars1 = Double.parseDouble(dollars.getText().toString()) ;
        double riyal = dollars1*3.75 ;
        Toast.makeText(this , "The Amoun in Riyal is: " + riyal , Toast.LENGTH_LONG).show();
        //To Tow dicmal places like 3.55 we use this "%2f"
        //Toast.makeText(this , "The Amoun in Riyal is: " + String.format("%.2f" , riyal) , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

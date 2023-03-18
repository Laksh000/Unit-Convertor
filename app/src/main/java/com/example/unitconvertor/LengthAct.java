package com.example.unitconvertor;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class LengthAct extends AppCompatActivity {
    Spinner spinnerr1, spinnerr2;
    EditText Editbox;
    TextView Txtbox;
    DecimalFormat df = new DecimalFormat("#.####");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length_act);
        spinnerr1 = findViewById(R.id.spinner1);
        spinnerr2 = findViewById(R.id.spinner2);
        Editbox = findViewById(R.id.Edtbox);
        Txtbox = findViewById(R.id.txtbox);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.Length,R.layout.spinner_styling);
        spinnerr1.setAdapter(adapter1);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.Length,R.layout.spinner_styling);
        spinnerr2.setAdapter(adapter2);
        spinnerr1.getBackground().setColorFilter(getResources().getColor(R.color.sky_blue), PorterDuff.Mode.SRC_ATOP);
        spinnerr2.getBackground().setColorFilter(getResources().getColor(R.color.sky_blue), PorterDuff.Mode.SRC_ATOP);
    }

    public void toCon(View view) {
        int option1 = spinnerr1.getSelectedItemPosition();
        int option2 = spinnerr2.getSelectedItemPosition();
        double value = Double.parseDouble(Editbox.getText().toString());
        double result = evaluate(option1, option2, value);
        df.setRoundingMode(RoundingMode.CEILING);
        Txtbox.setText(df.format(result)+ "");
    }

    public double evaluate(int option1, int option2, double value) {
        double temp = 0.0;
        if (option1 == option2) {
            return value;
        } else {
            switch(option1){
                case 0:
                    switch(option2){
                        case 0:
                            temp = value;
                            break;
                        case 1:
                            temp = value * 30.48;
                            break;
                        case 2:
                            temp = value /3281;
                            break;
                        case 3:
                            temp = value/3.281;
                            break;
                        case 4:
                            temp = value/5280;
                            break;
                        case 5:
                            temp = value * 12;
                            break;
                    }break;
                case 1:
                    switch(option2){
                        case 0:
                            temp = value/30.48;
                            break;
                        case 1:
                            temp = value;
                            break;
                        case 2:
                            temp = value/100000;
                            break;
                        case 3:
                            temp = value / 100;
                            break;
                        case 4:
                            temp = value/160934;
                            break;
                        case 5:
                            temp = value/2.54;
                            break;
                    }break;
                case 2:
                    switch(option2){
                        case 0:
                            temp = value * 3281;
                            break;
                        case 1:
                            temp = value * 100000;
                            break;
                        case 2:
                            temp = value;
                            break;
                        case 3:
                            temp = value * 1000;
                            break;
                        case 4:
                            temp = value/1.609;
                            break;
                        case 5:
                            temp = value * 39370;
                            break;
                    }break;
                case 3:
                    switch(option2){
                        case 0:
                            temp = value * 3.281;
                            break;
                        case 1:
                            temp = value * 100;
                            break;
                        case 2:
                            temp = value / 1000;
                            break;
                        case 3:
                            temp = value;
                            break;
                        case 4:
                            temp = value / 1609;
                            break;
                        case 5:
                            temp = value * 39.37;
                            break;
                    }break;
                case 4:
                    switch(option2){
                        case 0:
                            temp = value * 5280;
                            break;
                        case 1:
                            temp = value * 160934;
                            break;
                        case 2:
                            temp = value * 1.609;
                            break;
                        case 3:
                            temp = value * 1609;
                            break;
                        case 4:
                            temp = value;
                            break;
                        case 5:
                            temp = value * 63360;
                            break;
                    }break;
                case 5:
                    switch(option2){
                        case 0:
                            temp = value / 12;
                            break;
                        case 1:
                            temp = value * 2.54;
                            break;
                        case 2:
                            temp = value/39370;
                            break;
                        case 3:
                            temp = value/39.37;
                            break;
                        case 4:
                            temp = value/63360;
                            break;
                        case 5:
                            temp = value;
                            break;
                    }break;
            }
            return temp;
        }
    }
}

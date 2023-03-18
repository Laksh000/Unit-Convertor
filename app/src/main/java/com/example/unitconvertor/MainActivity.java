package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tobtn(View view) {
        Intent intent ;
        switch (view.getId()){
            case R.id.btn1:
                intent = new Intent(this,AreaAct.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                intent = new Intent(this,LengthAct.class);
                startActivity(intent);
                break;
            case R.id.btn3:
                intent = new Intent(this,DataAct.class);
                startActivity(intent);
                break;
            case R.id.btn4:
                intent = new Intent(this,TemperatureAct.class);
                startActivity(intent);
                break;
        }
    }

}

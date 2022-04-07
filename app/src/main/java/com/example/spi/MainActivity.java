package com.example.spi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.pays);
        ArrayAdapter<CharSequence> adp1 = ArrayAdapter.createFromResource(this,R.array.liste_pays, android.R.layout.simple_list_item_1);
        s.setAdapter(adp1);
    }
}
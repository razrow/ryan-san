package com.razrow.ryan_san.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.razrow.ryan_san.R;

public class InstagramActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerInstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        spinnerInstagram = findViewById(R.id.instagramDmsDropdown);
        spinnerInstagram.setOnItemSelectedListener(this);

        String[] instagramDms = getResources().getStringArray(R.array.instagramdms);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, instagramDms);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerInstagram.setAdapter(adapter);

        
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == R.id.instagramDmsDropdown){
            String valueFromSpinner = parent.getItemAtPosition(position).toString();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
package com.razrow.ryan_san.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.razrow.ryan_san.R;
import com.razrow.ryan_san.instagram.cadence.CadenceActivity;
import com.razrow.ryan_san.instagram.kiko.KikoActivity;
import com.razrow.ryan_san.instagram.yolanda.YolandaActivity;

public class InstagramActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerInstagram;
    String valueFromSpinner;
    Button btnNext;

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

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(valueFromSpinner){
                    case "Yolanda":
                        Intent yolanda = new Intent(InstagramActivity.this, YolandaActivity.class);
                        startActivity(yolanda);
                        break;
                    case "Cadence":
                        Intent cadence = new Intent(InstagramActivity.this, CadenceActivity.class);
                        startActivity(cadence);
                        break;
                    case "Kiko":
                        Intent kiko = new Intent(InstagramActivity.this, KikoActivity.class);
                        startActivity(kiko);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Please Select a Value from the dropdown", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == R.id.instagramDmsDropdown){
            valueFromSpinner = parent.getItemAtPosition(position).toString();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}
package com.example.myappboot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {
    private TextView edLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edLocation=findViewById(R.id.Location);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        edLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AddActivity.this,MapsActivity.class);
                startActivityForResult(intent,555);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();

    }
}

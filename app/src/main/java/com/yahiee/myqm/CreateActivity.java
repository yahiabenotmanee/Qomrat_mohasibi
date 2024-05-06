package com.yahiee.myqm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button_client=findViewById(R.id.btn_clien1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button_comp=findViewById(R.id.btn_compatible1);

        button_comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), create_count_contable.class));
            }
        });

        button_client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), create_count_client.class));
            }
        });

    }
}
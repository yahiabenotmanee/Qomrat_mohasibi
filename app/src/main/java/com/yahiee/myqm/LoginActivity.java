package com.yahiee.myqm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView createacount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button_log= findViewById(R.id.login_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView  textView_creat=findViewById(R.id.text_create_account);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView  textView_forget=findViewById(R.id.text_forget);

        textView_forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),VerivicationActivity.class));
            }
        });

        textView_creat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),CreateActivity.class));
            }
        });

        button_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),ComptableActivity.class));
            }
        });


    }
    public  void  oncreatcount(View view){
        startActivity(new Intent(getBaseContext(),WillayaActivity.class));
    }
}

package com.example.doctorapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class onbording3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onbording3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //declear element
        TextView tv = findViewById(R.id.tv_skip);
        Button btnStart = findViewById(R.id.btn_Getstart);

        //event
        btnStart.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(onbording3.this, login.class);

            @Override
            public void onClick(View v) {
                btnStart.setBackgroundColor(Color.LTGRAY);
                startActivity(intent);
            }
        });
        //event in skip
        tv.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(onbording3.this, login.class);

            @Override
            public void onClick(View v) {
                tv.setTextColor(getColor( R.color.blue));
                startActivity(intent);
            }
        });

    }
}
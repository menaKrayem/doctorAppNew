package com.example.doctorapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.window.SplashScreen;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
           Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
          return insets;
        });

        //declear element
        ImageView iv = findViewById(R.id.iv_logo);
        Button btnStart = findViewById(R.id.btnStart);

        //event عن طريق الزر
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnStart.setBackgroundColor(Color.LTGRAY);
                Intent intent = new Intent(splash.this, onbording1.class);
                startActivity(intent);
            }
        });
        // time only in splash عن طريق الدالة بعد 5 ثواني للفاينل تجهيز
        //new Handler().postDelayed(new Runnable() {
        //    @Override
          //  public void run() {
          //      Intent intent = new Intent(splash.this, onbording1.class);
           //     startActivity(intent);
            //    finish();
         //   }
      //  },5000);

    }
}











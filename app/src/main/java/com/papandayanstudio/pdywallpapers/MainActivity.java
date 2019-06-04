 package com.papandayanstudio.pdywallpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    Button categoryBackground1, categoryBackground2, categoryBackground3, categoryBackground4, categoryBackground5, categoryBackground6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryBackground1 = findViewById(R.id.categoryBackground1);
        categoryBackground2 = findViewById(R.id.categoryBackground2);
        categoryBackground3 = findViewById(R.id.categoryBackground3);
        categoryBackground4 = findViewById(R.id.categoryBackground4);
        categoryBackground5 = findViewById(R.id.categoryBackground5);
        categoryBackground6 = findViewById(R.id.categoryBackground6);

        categoryBackground1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThemeAct.class);
                String pathPict = "categoryBackground1";
                i.putExtra("PATH_PICTURE", pathPict);
                startActivity(i);
            }
        });

        categoryBackground2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThemeAct.class);
                String pathPict = "categoryBackground2";
                i.putExtra("PATH_PICTURE", pathPict);
                startActivity(i);
            }
        });

        categoryBackground3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThemeAct.class);
                String pathPict = "categoryBackground3";
                i.putExtra("PATH_PICTURE", pathPict);
                startActivity(i);
            }
        });

        categoryBackground4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThemeAct.class);
                String pathPict = "categoryBackground4";
                i.putExtra("PATH_PICTURE", pathPict);
                startActivity(i);
            }
        });
        categoryBackground5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThemeAct.class);
                String pathPict = "categoryBackground5";
                i.putExtra("PATH_PICTURE", pathPict);
                startActivity(i);
            }
        });
        categoryBackground6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThemeAct.class);
                String pathPict = "categoryBackground6";
                i.putExtra("PATH_PICTURE", pathPict);
                startActivity(i);
            }
        });


    }
}

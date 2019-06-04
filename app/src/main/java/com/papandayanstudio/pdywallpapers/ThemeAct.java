package com.papandayanstudio.pdywallpapers;

import android.Manifest;
import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ThemeAct extends AppCompatActivity {

    ImageView theme_preview;

    Button btn_back, btn_save, btn_download;

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        ActivityCompat.requestPermissions(ThemeAct.this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);

        theme_preview = findViewById(R.id.theme_preview);
        btn_back = findViewById(R.id.btn_back);
        btn_save = findViewById(R.id.btn_save);
        btn_download = findViewById(R.id.btn_download);

        if (savedInstanceState == null){
            Bundle extra = getIntent().getExtras();
            if (extra == null){
                newString = null;
            }else {
                newString = extra.getString("PATH_PICTURE");

                if (newString.equals("categoryBackground1")){
                    theme_preview.setBackgroundResource(R.drawable.image1);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Success set wallpaper",Toast.LENGTH_SHORT).show();

                            try {
                                wp.setResource(+ R.drawable.image1);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                    btn_download.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bitmap bitmap;
                            OutputStream output;

                            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image1);

                            File filePath = Environment.getExternalStorageDirectory();
                            File dir = new File(filePath+"/PDY Wallpapers Download");
                            dir.mkdirs();

                            File file = new File(dir, "mybackground1.png");
                            try {
                                output = new FileOutputStream(file);
                                bitmap.compress(Bitmap.CompressFormat.PNG,100,output);
                                output.flush();
                                output.close();
                                Toast.makeText(getApplicationContext(), "Download Success",Toast.LENGTH_SHORT).show();

                            }catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    });


                }else if (newString.equals("categoryBackground2")){
                    theme_preview.setBackgroundResource(R.drawable.image2);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Success set wallpaper",Toast.LENGTH_SHORT).show();
                            try {
                                wp.setResource(+ R.drawable.image2);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("categoryBackground3")){
                    theme_preview.setBackgroundResource(R.drawable.image3);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Success set wallpaper",Toast.LENGTH_SHORT).show();

                            try {
                                wp.setResource(+ R.drawable.image3);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("categoryBackground4")){
                    theme_preview.setBackgroundResource(R.drawable.image4);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Success set wallpaper",Toast.LENGTH_SHORT).show();

                            try {
                                wp.setResource(+ R.drawable.image4);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("categoryBackground5")){
                    theme_preview.setBackgroundResource(R.drawable.image5);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Success set wallpaper",Toast.LENGTH_SHORT).show();

                            try {
                                wp.setResource(+ R.drawable.image5);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("categoryBackground6")){
                    theme_preview.setBackgroundResource(R.drawable.image6);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Success set wallpaper",Toast.LENGTH_SHORT).show();

                            try {
                                wp.setResource(+ R.drawable.image6);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else {

                }
            }
        }


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



    }
}

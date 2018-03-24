package com.example.onrus.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Drawer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

    }

    public void gohome(View view){
        Intent intent = new Intent(Drawer.this, Home.class);
        Drawer.this.startActivity(intent);
    }

    public void login(View view){
        Intent intent = new Intent(Drawer.this, Login.class);
        Drawer.this.startActivity(intent);
    }

    public void youtube(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YgBFZUE_LX8"));
        startActivity(intent);
    }
}

package com.example.onrus.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    public void drawer (View view){
        Intent intent = new Intent(Login.this, Drawer.class);
        Login.this.startActivity(intent);
    }


}

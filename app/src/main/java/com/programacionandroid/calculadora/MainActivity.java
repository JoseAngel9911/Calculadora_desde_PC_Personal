package com.programacionandroid.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarActivityPrincipal(View view){
        Intent activityPrincipal  = new Intent(this, activity_principal_class.class);
        startActivity(activityPrincipal);
    }

}
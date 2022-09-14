package com.programacionandroid.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_secondary_class extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

    public void cambiarActivityTerciary(View view){
        Intent activityTerciary = new Intent(this, activity_terciary_class.class);
        startActivity(activityTerciary);
    }

}

package com.programacionandroid.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_principal_class extends AppCompatActivity {

    CheckBox checkBox1;
    CheckBox checkBox2;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
    }

    public void cambiarActivitySecondary(View view){
        Intent activitySecondary = new Intent(this, activity_secondary_class.class);
        startActivity(activitySecondary);
    }

    public void verificarBoton(){
        verificarCheckboxes();
    }

    public void verificarCheckboxes(){
        String mensaje = "Seleccionaste: ";
        if(checkBox1.isChecked()){
            mensaje += "Opcion 1";
        }
        if(checkBox2.isChecked()){
            mensaje += "Opcion 2";
        }
        if(!checkBox1.isChecked() && !checkBox2.isChecked()){
            mensaje += "Ninguna opcion";
        }



    }


}

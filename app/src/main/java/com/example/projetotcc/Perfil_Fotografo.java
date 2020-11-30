package com.example.projetotcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perfil_Fotografo extends AppCompatActivity {
    Button btnSolicitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil__fotografo);
        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.bistre));
        getWindow().setStatusBarColor(getResources().getColor(R.color.bistre));
        btnSolicitar = findViewById(R.id.btnSolicitar);
    }

    public void onPressSolicitar(View v){
        Intent it = new Intent(this, ContFot.class);
        startActivity(it);
    }
}
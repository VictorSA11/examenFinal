package com.example.examfinal;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexioSQLiteHelper conn = new ConexioSQLiteHelper(this, "bd_usuarios", null,1 );

        fab=(FloatingActionButton)findViewById(R.id.fabBoton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Informacion.class);
                startActivity(i);
            }
        });
        recycler= (RecyclerView) findViewById(R.id.recyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listDatos = new ArrayList<String>();

        for (int i =0; i<50; i++){
           listDatos.add("Dato # " + " ");
        }//fin de for

        AdapterDatosRecycler adapter = new AdapterDatosRecycler(listDatos);
        recycler.setAdapter(adapter);
    }

    public void onClick(View view){
        Intent miIntent = null;
        switch (view.getId()){
            case R.id.fabBoton5:
                miIntent = new Intent(MainActivity.this,Informacion.class);
                break;
        }
        if (miIntent!=null){
            startActivity(miIntent);
        }
    }
}

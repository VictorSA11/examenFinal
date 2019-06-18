package com.example.examfinal;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Historial extends AppCompatActivity {

    FloatingActionButton fab4;
    FloatingActionButton fab3;

    private ExpandableListView expLV;
    private ExpanListViewAdapter adapter;
    private ArrayList<String> listCat;
    private Map<String, ArrayList<String>> mapChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        expLV = (ExpandableListView) findViewById(R.id.expLV);
        listCat = new ArrayList<>();
        mapChild = new HashMap<>();

        fab4=(FloatingActionButton)findViewById(R.id.fabBoton4);
         fab4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        }
        });

        fab3=(FloatingActionButton)findViewById(R.id.fabBoton3);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Medidas.class);
                startActivity(i);
            }
        });
    }


    private void cargarDatos(){
        ArrayList<String> listEnero = new ArrayList<>();
        ArrayList<String> listFebrero = new ArrayList<>();
        ArrayList<String> listMarzo = new ArrayList<>();
        ArrayList<String> listAbril = new ArrayList<>();
        ArrayList<String> listMayo = new ArrayList<>();
        ArrayList<String> listJunio = new ArrayList<>();
        ArrayList<String> listJulio = new ArrayList<>();
        ArrayList<String> listAgosto = new ArrayList<>();
        ArrayList<String> listSetiembre= new ArrayList<>();
        ArrayList<String> listOctubre = new ArrayList<>();
        ArrayList<String> listNoviembre = new ArrayList<>();
        ArrayList<String> listDiciembre = new ArrayList<>();

    }
}

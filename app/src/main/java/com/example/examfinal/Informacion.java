package com.example.examfinal;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.examfinal.Utilidades.Utilidades;

public class Informacion extends AppCompatActivity {
    EditText campoNombreUsu, campoEdadUsu, campoCorreoUsu;
    FloatingActionButton fab2;
    FloatingActionButton fab5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        campoNombreUsu = (EditText) findViewById(R.id.txtNombreU);
        campoEdadUsu = (EditText) findViewById(R.id.txtEdadU);
        campoCorreoUsu = (EditText) findViewById(R.id.txtCorreoU);

        fab2=(FloatingActionButton)findViewById(R.id.fabBoton2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        fab5=(FloatingActionButton)findViewById(R.id.fabBoton5);
        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Historial.class);
                startActivity(i);
            }
        });
    }

    public void onClick (View view){
        registrarUsu();
    }

    private void registrarUsu() {
        ConexioSQLiteHelper conn = new ConexioSQLiteHelper(this, "bd_usuarios", null,1 );

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values= new ContentValues();
        values.put(Utilidades.CAMPO_NOMBREUSU, campoNombreUsu.getText().toString());
        values.put(Utilidades.CAMPO_EDADUSU, campoEdadUsu.getText().toString());
        values.put(Utilidades.CAMPO_CORREOUSU, campoCorreoUsu.getText().toString());


        long idResultante=db.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_NOMBREUSU, values);

        Toast.makeText(getApplicationContext(),"Nombre Registro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }

}



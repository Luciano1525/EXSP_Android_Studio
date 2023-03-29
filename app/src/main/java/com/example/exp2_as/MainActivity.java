package com.example.exp2_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRegistrar1;
    private Button btnIngresar;
    private EditText txtUsuario;
    private EditText txtContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        txtUsuario = (EditText)findViewById(R.id.txtUsuario);
        txtContraseña = (EditText)findViewById(R.id.txtContraseña);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Sesion Iniciada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Menu Principal");
                Intent intent = new Intent(MainActivity.this,menu.class);
                startActivity(intent);
            }
        });

        btnRegistrar1 = (Button) findViewById(R.id.btnRegistrar1);

        btnRegistrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Registro",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Menu Principal");
                Intent intent = new Intent(MainActivity.this,Registro.class);
                startActivity(intent);
            }
        });

    }


}
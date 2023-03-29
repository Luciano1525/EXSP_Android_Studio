package com.example.exp2_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private Button btnRegistrar2;
    private EditText txtUsuari;
    private EditText txtContra;
    private EditText txtVeContra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistrar2 = (Button) findViewById(R.id.btnRegistrar2);
        txtUsuari = (EditText)findViewById(R.id.txtUsuari);
        txtContra = (EditText)findViewById(R.id.txtContra);
        txtVeContra = (EditText)findViewById(R.id.txtVeContra);

        String Usuari1 = txtUsuari.getText().toString();
        String Contra1 = txtContra.getText().toString();
        String VeContra1 = txtVeContra.getText().toString();

        if (Contra1.equals(VeContra1)){
            btnRegistrar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Registro Exitoso",Toast.LENGTH_SHORT).show();
                        Log.i("INFO:","Menu Login");
                        Intent intent = new Intent(Registro.this,MainActivity.class);
                        startActivity(intent);

                }
            });

        } else {
            Toast.makeText(getApplicationContext(),"Las Contraseñas no Coinciden",Toast.LENGTH_SHORT).show();
        }

    }
}
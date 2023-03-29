package com.example.exp2_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Compra extends AppCompatActivity {
    private Button btFinalizar;
    private Button btComprarRE;
    private TextView tvNombre;
    private TextView tvEnvio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);
        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvEnvio = (TextView) findViewById(R.id.tvEnvio);
        GettvNombre001();
        GettvEnvio001();


        btComprarRE = (Button) findViewById(R.id.btComprarRE);

        btComprarRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccion: Refrescos",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Menu de Refrescos");
                Intent intent = new Intent(Compra.this,Refrescos.class);
                startActivity(intent);
            }
        });

        btFinalizar = (Button) findViewById(R.id.btFinalizar);

        btFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Compra Finalizada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Login");
                Intent intent = new Intent(Compra.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }

    private void GettvNombre001() {
        Bundle extras=getIntent().getExtras();
        tvNombre.setText(extras.get("informacion001").toString());
    }

    private void GettvEnvio001() {
        Bundle extras=getIntent().getExtras();
        tvEnvio.setText(extras.get("informacion002").toString());
    }
}
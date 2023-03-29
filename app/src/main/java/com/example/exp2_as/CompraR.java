package com.example.exp2_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CompraR extends AppCompatActivity {
    private Button btFinalizar1;
    private Button btComprarPZ1;
    private TextView tvNombre1;
    private TextView tvEnvio2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_r);
        tvNombre1 = (TextView) findViewById(R.id.tvNombre1);
        tvEnvio2 = (TextView) findViewById(R.id.tvEnvio2);
        GettvNombre004();
        GettvEnvio005();


        btComprarPZ1 = (Button) findViewById(R.id.btComprarPZ1);

        btComprarPZ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccion: Pizzas",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Menu de Pizzas");
                Intent intent = new Intent(CompraR.this,Pizzas.class);
                startActivity(intent);
            }
        });

        btFinalizar1 = (Button) findViewById(R.id.btFinalizar1);

        btFinalizar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Compra Finalizada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Login");
                Intent intent = new Intent(CompraR.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void GettvNombre004() {
        Bundle extras=getIntent().getExtras();
        tvNombre1.setText(extras.get("informacion004").toString());
    }

    private void GettvEnvio005() {
        Bundle extras=getIntent().getExtras();
        tvEnvio2.setText(extras.get("informacion005").toString());
    }
}
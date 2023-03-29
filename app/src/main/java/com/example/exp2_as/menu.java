package com.example.exp2_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    private Button btComprarP;
    private Button btComprarR;
    private TextView tvRefrescos;
    private TextView tvPizzas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btComprarP = (Button) findViewById(R.id.btComprarP);
        tvPizzas = (TextView) findViewById(R.id.tvPizzas);

        btComprarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccion: Pizzas",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Menu de Pizzas");
                String cadena1 = tvPizzas.getText().toString();
                Intent intent = new Intent(menu.this,Pizzas.class);
                intent.putExtra("informacion",cadena1);
                startActivity(intent);
            }
        });

        btComprarR = (Button) findViewById(R.id.btComprarR);
        tvRefrescos = (TextView) findViewById(R.id.tvRefrescos);

        btComprarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccion: Refrescos",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Menu de Refrescos");
                String cadena2 = tvPizzas.getText().toString();
                Intent intent = new Intent(menu.this,Refrescos.class);
                intent.putExtra("informacion",cadena2);
                startActivity(intent);
            }
        });


    }
}
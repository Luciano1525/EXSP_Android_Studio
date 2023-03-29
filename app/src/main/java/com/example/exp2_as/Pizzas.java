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

public class Pizzas extends AppCompatActivity {
    private Button btComprarPt;
    private Button btComprarPMx;
    private Button btComprarPq;
    private TextView tvPizzaPt;
    private TextView tvPrecioPizzaPP;
    private TextView tvPizzaMx;
    private TextView tvPrecioPizzaPM;
    private TextView tvPizzaQ;
    private TextView tvPrecioPizzaPQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzas);

        btComprarPMx = (Button) findViewById(R.id.btComprarPMx);
        tvPizzaMx = (TextView) findViewById(R.id.tvPizzaMx);
        tvPrecioPizzaPM = (TextView) findViewById(R.id.tvPrecioPizzaPM);

        btComprarPMx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Pizza Seleccionada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Orden");
                String cadenaPMX = tvPizzaMx.getText().toString();
                String cadenaPPMX = tvPrecioPizzaPM.getText().toString();
                Intent intent = new Intent(Pizzas.this,Pedido.class);
                intent.putExtra("informacion0",cadenaPMX);
                intent.putExtra("informacion3",cadenaPMX);
                intent.putExtra("informacion4",cadenaPPMX);
                startActivity(intent);
            }
        });

        btComprarPt = (Button) findViewById(R.id.btComprarPt);
        tvPizzaPt = (TextView) findViewById(R.id.tvPizzaPt);
        tvPrecioPizzaPP = (TextView) findViewById(R.id.tvPrecioPizzaPP);

        btComprarPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Pizza Seleccionada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Orden");
                String cadenaPPT = tvPizzaPt.getText().toString();
                String cadenaPPRT = tvPrecioPizzaPP.getText().toString();
                Intent intent = new Intent(Pizzas.this,Pedido.class);
                intent.putExtra("informacion0",cadenaPPT);
                intent.putExtra("informacion1",cadenaPPT);
                intent.putExtra("informacion2",cadenaPPRT);
                startActivity(intent);
            }
        });

        btComprarPq = (Button) findViewById(R.id.btComprarPq);
        tvPizzaQ = (TextView) findViewById(R.id.tvPizzaQ);
        tvPrecioPizzaPQ = (TextView) findViewById(R.id.tvPrecioPizzaPQ);

        btComprarPq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Pizza Seleccionada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Orden");
                String cadenaPQ = tvPizzaQ.getText().toString();
                String cadenaPPQ = tvPrecioPizzaPQ.getText().toString();
                Intent intent = new Intent(Pizzas.this,Pedido.class);
                intent.putExtra("informacion0",cadenaPQ);
                intent.putExtra("informacion5",cadenaPQ);
                intent.putExtra("informacion6",cadenaPPQ);
                startActivity(intent);
            }
        });


    }
}
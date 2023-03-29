package com.example.exp2_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Refrescos extends AppCompatActivity {

    private Button btComprarRC;
    private Button btComprarRP;
    private Button btComprarRF;
    private TextView tvRefrescoC;
    private TextView tvPrecioRefrescoC;
    private TextView tvRefrescoP;
    private TextView tvPrecioRefrescoP;
    private TextView tvRefrescoF;
    private TextView tvPrecioRefrescoF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrescos);

        btComprarRC = (Button) findViewById(R.id.btComprarRC);
        tvRefrescoC = (TextView) findViewById(R.id.tvRefrescoC);
        tvPrecioRefrescoC = (TextView) findViewById(R.id.tvPrecioRefrescoC);

        btComprarRC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Pizza Seleccionada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Orden");
                String cadenaCRC = tvRefrescoC.getText().toString();
                String cadenaCRPC = tvPrecioRefrescoC.getText().toString();
                Intent intent = new Intent(Refrescos.this,PedidoR.class);
                intent.putExtra("informacion0001",cadenaCRC);
                intent.putExtra("informacion003",cadenaCRC);
                intent.putExtra("informacion004",cadenaCRPC);
                startActivity(intent);
            }
        });

        btComprarRP = (Button) findViewById(R.id.btComprarRP);
        tvRefrescoP = (TextView) findViewById(R.id.tvRefrescoP);
        tvPrecioRefrescoP = (TextView) findViewById(R.id.tvPrecioRefrescoP);

        btComprarRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Refresco Seleccionado",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Orden");
                String cadenaCRP = tvRefrescoP.getText().toString();
                String cadenaCRPP = tvPrecioRefrescoP.getText().toString();
                Intent intent = new Intent(Refrescos.this,PedidoR.class);
                intent.putExtra("informacion0001",cadenaCRP);
                intent.putExtra("informacion005",cadenaCRP);
                intent.putExtra("informacion006",cadenaCRPP);
                startActivity(intent);
            }
        });

        btComprarRF = (Button) findViewById(R.id.btComprarRF);
        tvRefrescoF = (TextView) findViewById(R.id.tvRefrescoF);
        tvPrecioRefrescoF = (TextView) findViewById(R.id.tvPrecioRefrescoF);

        btComprarRF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Refresco Seleccionado",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Orden");
                String cadenaCRF = tvRefrescoF.getText().toString();
                String cadenaCRPF = tvPrecioRefrescoF.getText().toString();
                Intent intent = new Intent(Refrescos.this,PedidoR.class);
                intent.putExtra("informacion0001",cadenaCRF);
                intent.putExtra("informacion0007",cadenaCRF);
                intent.putExtra("informacion0008",cadenaCRPF);
                startActivity(intent);
            }
        });


    }
}
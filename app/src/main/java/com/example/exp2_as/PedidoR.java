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

public class PedidoR extends AppCompatActivity {

    String RCCC = "Coca Cola";
    String RPCC = "Pepsi Cola";
    String RFCP = "Fanta";
    private TextView tvRefrescoName;
    private TextView tvOrden21;
    private TextView tvPrecio21;
    private Button btnCompraOrden1;
    private EditText txtNombrePedido1;
    private EditText txtDireccion1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_r);
        tvRefrescoName = (TextView) findViewById(R.id.tvRefrescoName);
        GettvOrden15();
        tvOrden21 = (TextView) findViewById(R.id.tvOrden21);
        tvPrecio21 = (TextView) findViewById(R.id.tvPrecio21);

        String Refresco = tvRefrescoName.getText().toString();

        if (Refresco.equals(RCCC)){
            GettvOrden003();
            GettvPrecio003();
        } else if (Refresco.equals(RPCC)){
            GettvOrden004();
            GettvPrecio004();
        } else if (Refresco.equals(RFCP)){
            GettvOrden005();
            GettvPrecio005();
        }

        btnCompraOrden1 = (Button) findViewById(R.id.btnCompraOrden1);
        txtNombrePedido1 = (EditText)findViewById(R.id.txtNombrePedido1);
        txtDireccion1 = (EditText)findViewById(R.id.txtDireccion1);

        btnCompraOrden1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hiciste Click",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Pasaste a la segunda pantalla");
                String cadenaN = txtNombrePedido1.getText().toString();
                String cadenaD = txtDireccion1.getText().toString();
                Intent intent = new Intent(PedidoR.this,CompraR.class);
                intent.putExtra("informacion004",cadenaN);
                intent.putExtra("informacion005",cadenaD);
                startActivity(intent);
            }
        });
    }
    // Refrescos
    private void GettvOrden15() {
        Bundle extras=getIntent().getExtras();
        tvRefrescoName.setText(extras.get("informacion0001").toString());
    }
    private void GettvOrden003() {
        Bundle extras=getIntent().getExtras();
        tvOrden21.setText(extras.get("informacion003").toString());
    }
    private void GettvPrecio003() {
        Bundle extras=getIntent().getExtras();
        tvPrecio21.setText(extras.get("informacion004").toString());
    }
    private void GettvOrden004() {
        Bundle extras=getIntent().getExtras();
        tvOrden21.setText(extras.get("informacion005").toString());
    }
    private void GettvPrecio004() {
        Bundle extras=getIntent().getExtras();
        tvPrecio21.setText(extras.get("informacion006").toString());
    }
    private void GettvOrden005() {
        Bundle extras=getIntent().getExtras();
        tvOrden21.setText(extras.get("informacion0007").toString());
    }
    private void GettvPrecio005() {
        Bundle extras=getIntent().getExtras();
        tvPrecio21.setText(extras.get("informacion0008").toString());
    }
}
package com.example.sorteio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
EditText txtValorInicial,txtValorFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValorInicial = (EditText)findViewById(R.id.txtValorInicial);
        txtValorFinal = (EditText)findViewById(R.id.txtValorFinal);

    }

    public void Sortear(View v){
        if(txtValorInicial.getText().toString().length()>0&&txtValorFinal.getText().toString().length()>0){
            int valorInicial,valorFinal;
            int resultado;
            valorInicial = Integer.parseInt(txtValorInicial.getText().toString());
            valorFinal = Integer.parseInt(txtValorFinal.getText().toString());
            resultado = (int) ((Math.random()*(valorFinal-valorInicial))+valorInicial);

            new AlertDialog.Builder(this).setTitle("Resultado do sorteio").setMessage("Resultado = "+resultado).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        }
        else{
            Toast.makeText(this, "Você deve prencher todos os campos para realizar o sorteio", Toast.LENGTH_SHORT).show();
        }
    }
}

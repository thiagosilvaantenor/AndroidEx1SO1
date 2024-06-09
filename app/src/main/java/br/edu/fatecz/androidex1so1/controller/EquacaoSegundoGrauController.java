package br.edu.fatecz.androidex1so1.controller;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EquacaoSegundoGrauController {
    private EditText etA;
    private EditText etB;
    private EditText etC;
    private TextView tvDelta;
    private TextView tvR1;
    private TextView tvR2;

    private Button btnResult;

    public EquacaoSegundoGrauController(EditText etA, EditText etB, EditText etC, TextView tvDelta, TextView tvR1, TextView tvR2, Button btnResult) {
        this.etA = etA;
        this.etB = etB;
        this.etC = etC;
        this.tvDelta = tvDelta;
        this.tvR1 = tvR1;
        this.tvR2 = tvR2;
        this.btnResult = btnResult;
        btnResult.setOnClickListener(op -> operations());
    }

    public void operations(){
        if(etA.getText().toString().equals("0") ||
                etA.getText().toString().equals("0") ||etA.getText() == null || etB.getText() == null || etC == null) {
            String result = "Equação não é de segundo grau";
            tvDelta.setText(result);
        } else {
            calc();
        }
    }

    private void calc(){

            double varA = Double.parseDouble(etA.getText().toString());
            double varB = Double.parseDouble(etB.getText().toString());
            double varC = Double.parseDouble(etC.getText().toString());
            double delta = (Math.pow(varB,2)) -4*varA*varC;
            calcRaizes(delta,varA,varB);
    }

    private void calcRaizes(double delta,double a, double b) {
        String deltaResult = "Delta = " + delta;
        tvDelta.setText(deltaResult);
        if(delta > 0  || delta == 0){
            double r1 = ((-b)+Math.sqrt(delta))/(2*a);
            double r2 = ((-b)-Math.sqrt(delta))/(2*a);
            String r1Result = "Primeira raiz: " + r1;
            tvR1.setText(r1Result);
            String r2Result = "Segunda raiz: " + r2;
            tvR2.setText(r2Result);
        } else {
            String result = "Delta < 0, portanto sem raizes";
            tvR1.setText(result);
            tvR2.setText("");
        }
    }
}

package com.example.pc.tarea_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Double n1,n2,res;
    private String operador;
    private int sw=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        tv = (TextView) findViewById(R.id.tv_layout);


    }
    public void botonCE(View v){
        tv.setText("");
    }
    public void boton_mas(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        n1= Double.parseDouble(tv.getText().toString());
        operador="+";
        tv.setText("");
    }
    public void boton_menos(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        n1= Double.parseDouble(tv.getText().toString());
        operador="-";
        tv.setText("");
    }
    public void boton_por(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        n1= Double.parseDouble(tv.getText().toString());
        operador="*";
        tv.setText("");
    }
    public void boton_div(View v) {
        tv = (TextView) findViewById(R.id.tv_layout);
        n1 = Double.parseDouble(tv.getText().toString());
        operador = "/";
        tv.setText("");
    }
    public void boton_mod(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        n1= Double.parseDouble(tv.getText().toString());
        operador="%";
        tv.setText("");
    }
    public void boton_salir(View v){
        finish();
    }


    public void boton_igual(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        n2=Double.parseDouble(tv.getText().toString());
        switch (operador){
            case "+": res=n1+n2;
                tv.setText(res.toString());
                break;
            case "-": res=n1-n2;
                tv.setText(res.toString());
                break;
            case "*": res=n1*n2;
                tv.setText(res.toString());
                break;
            case "/":
                if(n2!=0){
                    res=n1/n2;
                    tv.setText(res.toString());
                }else{
                    tv.setText("Infinito");
                }

                break;
            case "%": res=n1%n2;
                tv.setText(res.toString());
                break;

        }


    }
    public void boton1(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"1");
    }
    public void boton2(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"2");
    }
    public void boton3(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"3");
    }
    public void boton4(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"4");
    }
    public void boton5(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"5");
    }
    public void boton6(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"6");
    }
    public void boton7(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"7");
    }
    public void boton8(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"8");
    }
    public void boton9(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"9");
    }
    public void boton0(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        tv.setText(tv.getText()+"0");
    }
    public void boton_punto(View v){
        tv = (TextView) findViewById(R.id.tv_layout);
        if(sw==0){
            tv.setText(tv.getText()+".");
            sw=1;
        }

    }





}

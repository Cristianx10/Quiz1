package com.example.ecosistemas.quiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_titulo;
    private TextView tv_confirmacion;
    private EditText et_name;
    private EditText et_password;
    private Button btn_ingresar;
    private Button btn_cerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}

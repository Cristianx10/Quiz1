package com.example.ecosistemas.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        tv_titulo= findViewById(R.id.tv_titulo);
        tv_confirmacion = findViewById(R.id.tv_confirmar);
        et_name= findViewById(R.id.et_name);
        et_password= findViewById(R.id.et_password);
        btn_ingresar= findViewById(R.id.btn_ingresar);
        btn_cerrar= findViewById(R.id.btn_cerrar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent solicitud = new Intent();

                String user = et_name.getText().toString();
                String password = et_password.getText().toString();

                //Usuario registrados
                String dataUser = "Adminsitrador";
                String dataPassword = "123456";

                if(user.equals(dataUser) && password.equals(dataPassword)){



                }

            }
        });

    }


}

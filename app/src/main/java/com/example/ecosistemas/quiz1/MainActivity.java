package com.example.ecosistemas.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tv_confirmacion;
    private EditText et_name;
    private EditText et_password;
    private Button btn_ingresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_confirmacion = findViewById(R.id.tv_confirmar);
        et_name= findViewById(R.id.et_name);
        et_password= findViewById(R.id.et_password);
        btn_ingresar= findViewById(R.id.btn_ingresar);


        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent solicitud = new Intent(getApplicationContext(), Login.class);



                String user = et_name.getText().toString();
                String password = et_password.getText().toString();

                //Usuario registrados


                if(user.equals(Constants.dataUser) && password.equals(Constants.dataPassword)){

                    startActivity(solicitud);

                }else{
                    tv_confirmacion.setText("Por favor verifique usuario y password");

                }

            }
        });

    }


}

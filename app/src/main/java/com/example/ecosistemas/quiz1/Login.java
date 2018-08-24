package com.example.ecosistemas.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private TextView tv_titulo;
    private Button btn_cerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_titulo= findViewById(R.id.tv_titulo);
        btn_cerrar= findViewById(R.id.btn_cerrar);


        btn_cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent solicitud = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(solicitud);

            }
        });
    }
}

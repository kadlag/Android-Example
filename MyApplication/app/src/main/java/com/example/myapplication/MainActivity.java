package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button add;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.eno1);
        e2=findViewById(R.id.eno2);

        t1=findViewById(R.id.t1);
        add=findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double n1=Double.parseDouble(e1.getText().toString());
                Double n2=Double.parseDouble(e2.getText().toString());

                Double sum=n1+n2;

                t1.setText(Double.toString(sum));


            }
        });
    }
}
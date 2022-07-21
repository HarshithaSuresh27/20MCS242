package com.example.calculaterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText op1Text,op2Text;
    TextView resultText;
    Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1Text=findViewById(R.id.op1Text);
        op2Text=findViewById(R.id.op2Text);
        resultText=findViewById(R.id.resText);

        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int op1=Integer.parseInt(op1Text.getText().toString());
                int op2=Integer.parseInt(op2Text.getText().toString());
                int res=op1+op2;
                resultText.setText(Integer.toString(res));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int op1 = Integer.parseInt(op1Text.getText().toString());
                int op2 = Integer.parseInt(op2Text.getText().toString());
                int res =op1-op2;
                resultText.setText(Integer.toString(res));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int op1 = Integer.parseInt(op1Text.getText().toString());
                int op2 = Integer.parseInt(op2Text.getText().toString());
                int res= op1*op2;
                resultText.setText(Integer.toString(res));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int op1 = Integer.parseInt(op1Text.getText().toString());
                int op2 = Integer.parseInt(op2Text.getText().toString());
                int res = op1/op2;
                resultText.setText(Integer.toString(res));
            }
        });
    }


}
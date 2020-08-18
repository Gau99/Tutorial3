package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView outPut;
    EditText etInput1, etInput2;
    Button btnAdd,btnSub,btnDivide,btnMulti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        outPut = findViewById(R.id.outPut);
        etInput1 = findViewById(R.id.editInput1);
        etInput2 = findViewById(R.id.editInput2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDivide = findViewById(R.id.btnDivide);
        btnMulti = findViewById(R.id.btnMulti);

        Intent intent = getIntent();

        final int outPutDisplay1 = intent.getExtras().getInt("input1");
        etInput1.setText(String.valueOf(outPutDisplay1));

        final int outPutDisplay2 = intent.getExtras().getInt("input2");
        etInput2.setText(String.valueOf(outPutDisplay2));


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = outPutDisplay1 + outPutDisplay2;
                String displayResult = (outPutDisplay1 +" + " + outPutDisplay2+" = "+result);
                outPut.setText(displayResult);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = outPutDisplay1 - outPutDisplay2;
                String displayResult = (outPutDisplay1 +" - " + outPutDisplay2+" = "+result);
                outPut.setText(displayResult);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = outPutDisplay1 / outPutDisplay2;
                String displayResult = (outPutDisplay1 +" / " + outPutDisplay2+" = "+result);
                outPut.setText(displayResult);
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = outPutDisplay1 * outPutDisplay2;
                String displayResult = (outPutDisplay1 +" * " + outPutDisplay2+" = "+result);
                outPut.setText(displayResult);
            }
        });

    }
}

package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btnOk;

    EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        btnOk = findViewById(R.id.btn1);
        number1 = findViewById(R.id.et_num1);
        number2 = findViewById(R.id.et_num2);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(FirstActivity.this, "Sending message", Toast.LENGTH_LONG);
                toast.show();
                sendMessage();
            }
        });
    }

    public void sendMessage() {
        Intent intent = new Intent(this, SecondActivity.class);
        String input1 = number1.getText().toString();
        String input2 = number2.getText().toString();
        int inputNum1 = Integer.parseInt(input1);
        int inpuntNum2 = Integer.parseInt(input2);
        intent.putExtra("input1", inputNum1);
        intent.putExtra("input2",inpuntNum2);
        startActivity(intent);
    }
}

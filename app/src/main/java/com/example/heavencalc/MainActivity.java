package com.example.heavencalc;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonAdd, buttonSub, buttonMultiply, buttonDiv;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1, num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMultiply = findViewById(R.id.btn_mult);
        buttonDiv = findViewById(R.id.btn_div);
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);
        textView  = findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
    }
    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals(" ")){
            Toast.makeText( this,  "Enter Value", Toast.LENGTH_SHORT).show();
            return 0;
        } else
       return  Integer.parseInt(editText.getText().toString());

    }

    @Override
    public void onClick(View v) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);
        switch(textView.getId()){
            case R.id.btn_add:
                 textView.setText("Answer = " + (num1 + num2));

            case R.id.btn_sub:
                textView.setText("Answer = " + (num1-num2));
                break;

            case R.id.btn_mult:
                textView.setText("Answer = " + (num1*num2));
                break;

            case R.id.btn_div:
                textView.setText("Answer = " + ((float)num1/(float)num2));
                break;
        }


    }
}
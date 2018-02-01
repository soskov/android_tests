package com.example.yuriy.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        res = (TextView)findViewById(R.id.result);
    }

    public void onClickButton1(View v){

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int resSum = number1 + number2;
        res.setText(Integer.toString(resSum));
    }

    public void onClickButton2(View v){

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int resMinus = number1 - number2;
        res.setText(Integer.toString(resMinus));
    }

    public void onClickButton3(View v){

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        float resDiv = number1 / number2;
        res.setText(Float.toString(resDiv));
    }

    public void onClickButton4(View v){

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int resMulti = number1 * number2;
        res.setText(Integer.toString(resMulti));
    }
}

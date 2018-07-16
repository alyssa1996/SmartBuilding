package com.example.jisupark.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View v){
        EditText number1 = (EditText) findViewById(R. id.number1); //EditText를 받아서 number1 객체에 저장
        EditText number2 = (EditText) findViewById(R. id.number2);
        TextView result = (TextView) findViewById(R. id.Result);
        int n1= Integer.parseInt(number1.getText().toString()); //paserInt라는 함수를 통해 정수로 저장될 수 있음
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1+n2)); //toString()은 객체가 가지고 있는 값을 문자열로 만들어서 리턴하는 메소드

    }

    public void subtractClick(View v){
        EditText number1 = (EditText) findViewById(R. id.number1); //EditText를 받아서 number1 객체에 저장
        EditText number2 = (EditText) findViewById(R. id.number2);
        TextView result = (TextView) findViewById(R. id.Result);
        int n1= Integer.parseInt(number1.getText().toString()); //paserInt라는 함수를 통해 정수로 저장될 수 있음
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1-n2)); //toString()은 객체가 가지고 있는 값을 문자열로 만들어서 리턴하는 메소드

    }

    public void multiplyClick(View v){
        EditText number1 = (EditText) findViewById(R. id.number1); //EditText를 받아서 number1 객체에 저장
        EditText number2 = (EditText) findViewById(R. id.number2);
        TextView result = (TextView) findViewById(R. id.Result);
        int n1= Integer.parseInt(number1.getText().toString()); //paserInt라는 함수를 통해 정수로 저장될 수 있음
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1*n2)); //toString()은 객체가 가지고 있는 값을 문자열로 만들어서 리턴하는 메소드

    }

    public void divideClick(View v){
        EditText number1 = (EditText) findViewById(R. id.number1); //EditText를 받아서 number1 객체에 저장
        EditText number2 = (EditText) findViewById(R. id.number2);
        TextView result = (TextView) findViewById(R. id.Result);
        int n1= Integer.parseInt(number1.getText().toString()); //paserInt라는 함수를 통해 정수로 저장될 수 있음
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1/n2)); //toString()은 객체가 가지고 있는 값을 문자열로 만들어서 리턴하는 메소드

    }
}

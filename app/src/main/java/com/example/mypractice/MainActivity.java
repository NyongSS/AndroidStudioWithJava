package com.example.mypractice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnDivS;
    TextView textResult;
    String num1, num2;
    Float result;

    //값을 입력하지 않고 버튼을 클릭할 때 오류 메시지를 토스트 메시지로 나타냄
    //실수 값을 계산함
    //0으로 나누면 토스트 메시지를 나타내고 계산하지 않음.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnSub = (Button) findViewById(R.id.buttonSub);
        btnMul = (Button) findViewById(R.id.buttonMul);
        btnDiv = (Button) findViewById(R.id.buttonDiv);
        btnDivS = (Button) findViewById(R.id.buttonDivS);

        textResult = (TextView) findViewById(R.id.textResult);




        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.getBytes().length <= 0 || num2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.",
                            Toast.LENGTH_SHORT).show();}
                else {
                    result = Float.parseFloat(num1) + Integer.parseInt(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.getBytes().length <= 0 || num2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.",
                            Toast.LENGTH_SHORT).show();}
                else {
                result = Float.parseFloat(num1) - Integer.parseInt(num2);
                textResult.setText("계산 결과: "+  result.toString());
            }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.getBytes().length <= 0 || num2.getBytes().length <= 0) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.",
                            Toast.LENGTH_SHORT).show();
                } else {
                    result = Float.parseFloat(num1) * Integer.parseInt(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.getBytes().length <= 0 || num2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.",
                            Toast.LENGTH_SHORT).show();}
                else { if(num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.",
                            Toast.LENGTH_SHORT).show();
                } else {
                    result = Float.parseFloat(num1) / Integer.parseInt(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
                }
            }
        });

        btnDivS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.getBytes().length <= 0 || num2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.",
                            Toast.LENGTH_SHORT).show();}
                else {if (num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.",
                            Toast.LENGTH_SHORT).show();
                } else {
                result = Float.parseFloat(num1) % Integer.parseInt(num2);
                textResult.setText("계산 결과: " + result.toString());
            }
                }
            }
        });
    }

}


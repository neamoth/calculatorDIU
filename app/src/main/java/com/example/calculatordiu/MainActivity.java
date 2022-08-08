package com.example.calculatordiu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numoneid, numtwoid;
    TextView resultID;
    Double num1;
    Double num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numoneid = findViewById(R.id.numoneid);
        numtwoid = findViewById(R.id.numtwoid);
        resultID = findViewById(R.id.resultID);
    }

    public void sumFunction(View view) {

        if(TextUtils.isEmpty(numoneid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter first value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(numtwoid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter second value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else{
            num1 = Double.parseDouble(numoneid.getText().toString());
            num2 = Double.parseDouble(numtwoid.getText().toString());
            result = num1+num2;
            resultID.setText("Result: "+result);
        }
    }

    public void subFunction(View view) {
        if(TextUtils.isEmpty(numoneid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter first value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(numtwoid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter second value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else{
            num1 = Double.parseDouble(numoneid.getText().toString());
            num2 = Double.parseDouble(numtwoid.getText().toString());
            result = num1-num2;
            resultID.setText("Result: "+result);
        }

    }

    public void multFunction(View view) {

        if(TextUtils.isEmpty(numoneid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter first value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(numtwoid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter second value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else{
            num1 = Double.parseDouble(numoneid.getText().toString());
            num2 = Double.parseDouble(numtwoid.getText().toString());
            result = num1*num2;
            resultID.setText("Result: "+result);
        }
    }

    public void divFunction(View view) {

        resultID.setText("Result: "+result);
        if(TextUtils.isEmpty(numoneid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter first value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(numtwoid.getText().toString())){
            Toast.makeText(MainActivity.this, "Enter second value and try again..!", Toast.LENGTH_SHORT).show();
        }
        else{
            num1 = Double.parseDouble(numoneid.getText().toString());
            num2 = Double.parseDouble(numtwoid.getText().toString());
            result = num1/num2;
        }
    }
}
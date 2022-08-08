package com.example.calculatordiu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        num1 = Double.parseDouble(numoneid.getText().toString());
        num2 = Double.parseDouble(numtwoid.getText().toString());
        result = num1+num2;
        resultID.setText("Result: "+result);
    }

    public void subFunction(View view) {
        num1 = Double.parseDouble(numoneid.getText().toString());
        num2 = Double.parseDouble(numtwoid.getText().toString());
        result = num1-num2;
        resultID.setText("Result: "+result);
    }

    public void multFunction(View view) {
        num1 = Double.parseDouble(numoneid.getText().toString());
        num2 = Double.parseDouble(numtwoid.getText().toString());
        result = num1*num2;
        resultID.setText("Result: "+result);
    }

    public void divFunction(View view) {
        num1 = Double.parseDouble(numoneid.getText().toString());
        num2 = Double.parseDouble(numtwoid.getText().toString());
        result = num1/num2;
        resultID.setText("Result: "+result);
    }
}
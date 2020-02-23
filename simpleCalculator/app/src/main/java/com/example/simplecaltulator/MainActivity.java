package com.example.simplecaltulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextOne, editTextTwo;
    private Button additionBtn, subtractionBtn;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextOne = findViewById(R.id.firstNumber);
        editTextTwo = findViewById(R.id.secondNumber);

        additionBtn = findViewById(R.id.addBtnID);
        subtractionBtn = findViewById(R.id.subBtnID);

        resultTV = findViewById(R.id.resultViewID);

        additionBtn.setOnClickListener(this);
        subtractionBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        String number1 = editTextOne.getText().toString();
        String number2 = editTextTwo.getText().toString();

        Double num1 = Double.parseDouble(number1);
        Double num2 = Double.parseDouble(number2);

        if (v.getId()== R.id.addBtnID){
            double sum = num1+num2;
            resultTV.setText("Sum Is "+ sum);
        }if (v.getId()==R.id.subBtnID){
            double sub = num1-num2;
            resultTV.setText("Subtraction is "+sub);
        }

    }
}

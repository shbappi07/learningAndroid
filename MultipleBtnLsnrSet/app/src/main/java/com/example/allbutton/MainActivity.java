package com.example.allbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button, imgaeBtn;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.butonID);
        imgaeBtn = findViewById(R.id.imagebutonID);
        textView = findViewById(R.id.tvID);

        button.setOnClickListener(this);
        imgaeBtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.butonID){
            textView.setText("Button 1 clicked");
        }else if (v.getId()==R.id.imagebutonID){
            textView.setText("Button 2 clicked");
        }

    }
}

package com.example.allbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button, imgaeBtn;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.butonID);
        imgaeBtn = findViewById(R.id.imagebutonID);
        textView = findViewById(R.id.tvID);

        Handler handler = new Handler();
        button.setOnClickListener(handler);
        imgaeBtn.setOnClickListener(handler);

    }

    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.butonID){
                textView.setText("Button 1 clicked With Handler");
            }else if (v.getId()==R.id.imagebutonID){
                textView.setText("Button 2 clicked using Handler");
            }
        }
    };





}

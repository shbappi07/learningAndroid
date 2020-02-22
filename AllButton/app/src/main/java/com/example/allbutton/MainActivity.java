package com.example.allbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button, imgaeBtn;
    private TextView textView;
    private int count, countImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.butonID);
        imgaeBtn = findViewById(R.id.imagebutonID);
        textView = findViewById(R.id.tvID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText("Button Licked "+count+" Times");
            }
        });

        imgaeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countImg++;
                textView.setText("Image button Clicked "+countImg);
            }
        });

    }
}

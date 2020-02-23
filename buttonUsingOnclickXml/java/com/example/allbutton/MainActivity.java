package com.example.allbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    }

    public void showMessage(View view) {
        if (view.getId()==R.id.butonID){
            textView.setText("Button 1 clicked using On Click Listener");
            Toast.makeText(this, "Button 1 clicked using On Click Listener on Toast", Toast.LENGTH_SHORT).show();
        }else if (view.getId()==R.id.imagebutonID){
            textView.setText("Button 2 clicked using onClick Listener");
            Toast.makeText(this, "Button 2 clicked using On Click Listener on Toast", Toast.LENGTH_SHORT).show();
        }
    }
};


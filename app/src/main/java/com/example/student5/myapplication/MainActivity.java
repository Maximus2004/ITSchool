package com.example.student5.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Инициализируем компонент
        //TextView textView = findViewById(R.id.textView);
        // задаём текст
        //EditText edittext = findViewById(R.id.editTextA);
        //textView.setText(edittext.getText() );
        Button h = this.findViewById(R.id.b4);
        h.setOnClickListener(new Listener(this));
    }
}

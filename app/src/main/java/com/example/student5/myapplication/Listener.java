package com.example.student5.myapplication;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Listener implements View.OnClickListener {

    MainActivity main;

    Listener (MainActivity m){
      main = m;
    }

    @Override
    public void onClick(View v) {
        TextView t = main.findViewById(R.id.textView);
        EditText eA = main.findViewById(R.id.editTextA);
        EditText eB = main.findViewById(R.id.editTextB);
        EditText eC = main.findViewById(R.id.editTextC);
        int a = Integer.parseInt(eA.getText().toString());
        int b = Integer.parseInt(eB.getText().toString());
        int c = Integer.parseInt(eC.getText().toString());
        int D = b*b-4*a*c;
        double x = 0;
        boolean f = false;
        double x2 = 0;
        if (D>0){
            f = true;
            x = ((-b)+Math.sqrt(D))/2*a;
            x2 = ((-b)-Math.sqrt(D))/2*a;
        }
        if (D == 0){
            x = -b/(2*a);
        }
        if (D<0){
            x = 0;
        }
        if (f){
            t.setText("");
            t.setText("Ответ: " + Double.toString(x) + "   " + Double.toString(x2));
        }
        else{
            t.setText("");
            t.setText("Ответ: " + Double.toString(x));
        }
    }
}
package com.example.lab2milestone2;


import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Convert  extends AppCompatActivity {

    TextView textView2;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        double euro = Double.parseDouble(str);
        euro = euro*0.77;
        String strop=String.valueOf(euro);
        textView2.setText("€" + strop);

    }




}

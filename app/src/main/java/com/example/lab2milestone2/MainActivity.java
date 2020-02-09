package com.example.lab2milestone2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import java.lang.String;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction (View view){
        Log.i("Info", "Button Pressed");
    }

    public void convert(String s){
        Intent intent = new Intent(this, Convert.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

}

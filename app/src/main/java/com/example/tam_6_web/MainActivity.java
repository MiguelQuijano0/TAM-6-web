package com.example.tam_6_web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_web);
    }
    public void Navegar(View view) {
        Intent n =new Intent(this, MainActivity2.class);
        n.putExtra("SitioWeb", et1.getText().toString());
        startActivity(n);
    }
}
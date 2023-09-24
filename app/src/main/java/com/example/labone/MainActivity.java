package com.example.labone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.btnChangeText = findViewById(R.id.btnChangeText);

        btnChangeText.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Some message", Toast.LENGTH_LONG);
            }
        });

    }

    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("Labas Pasauli");
    }
}
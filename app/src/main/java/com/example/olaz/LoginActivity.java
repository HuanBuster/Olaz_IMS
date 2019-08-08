package com.example.olaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button btn_login = (Button)findViewById(R.id.btn_login);
    private Button btn_signup1 = (Button)findViewById(R.id.btn_signup);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
}

package com.rux.ruchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout mTextInputLayout;
    private TextInputEditText mTextInputEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextInputLayout = findViewById(R.id.textField);
        mTextInputEditText = findViewById(R.id.editText);
        mTextInputLayout.setEndIconOnClickListener(view -> Toast.makeText(MainActivity.this,"click ru",Toast.LENGTH_LONG).show());
    }
}
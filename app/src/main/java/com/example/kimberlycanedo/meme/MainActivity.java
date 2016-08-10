package com.example.kimberlycanedo.meme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    private Button mEtButton;
    private EditText mEtTop;
    private EditText mEtBottom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtTop = (EditText) findViewById(R.id.editText);
        mEtButton = (Button) findViewById(R.id.btnGM);
        mEtBottom= (EditText) findViewById(R.id.editText2);
        mEtButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String top = mEtTop.getText().toString();
        String bottom = mEtBottom.getText().toString();
        Intent intent= new Intent(this,Main2Activity.class);
        intent.putExtra("TOP_TEXT", top);
        intent.putExtra("BOTTOM_TEXT", bottom);
        startActivity(intent);
    }
}

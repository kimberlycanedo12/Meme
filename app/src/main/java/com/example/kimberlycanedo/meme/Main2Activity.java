package com.example.kimberlycanedo.meme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends MainActivity {
    private TextView textView1;
    private TextView textView2;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = (TextView)findViewById(R.id.textView3);
        textView2 = (TextView)findViewById(R.id.textView4);
        img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.zero);

        Intent intent = getIntent();
        if(intent !=null) {
            String upper = intent.getStringExtra("TOP_TEXT");
            String bottom  = intent.getStringExtra("BOTTOM_TEXT");
            textView1.setText(upper);
            textView2.setText(bottom);

        }

        }
    }





package com.example.a507.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected Button btCount;
    protected TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCount = (Button)findViewById(R.id.btCount);
        btCount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });
    }
}

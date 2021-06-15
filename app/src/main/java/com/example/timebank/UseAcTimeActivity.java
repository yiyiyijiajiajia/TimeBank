package com.example.timebank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UseAcTimeActivity extends AppCompatActivity {

    private TextView UT_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_ac_time);

        UT_cancel = (TextView) findViewById(R.id.UT_cancle);
        UT_cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UseAcTimeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
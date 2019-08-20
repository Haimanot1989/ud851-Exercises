package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
// Do steps 6 & 7 in ChildActivity.java
// DONE (6) Create a TextView field to display your message
// DONE (7) Get a reference to your TextView in Java
public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }
}

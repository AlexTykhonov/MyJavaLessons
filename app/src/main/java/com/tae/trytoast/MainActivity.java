package com.tae.trytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view) {Toast toast = Toast.makeText(this, "Hello Android 7",Toast.LENGTH_LONG);
        toast.show();
    }
}


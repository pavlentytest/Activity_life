package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRRRRR","onCreate()");
    }
    protected void onResume() {
        // 1
        super.onResume();
        Log.e("RRRRRRRR","onResume()");
    }
    protected void onStart() {
        // 2
        super.onStart();
        Log.e("RRRRRRRR","onStart()");
    }
    protected void onPause() {
        // 3
        super.onPause();
        Log.e("RRRRRRRR","onPause()");
    }
    protected void onStop() {
        // 4
        super.onStop();
        Log.e("RRRRRRRR","onStop()");
    }
    protected void onRestart() {
        // 5
        super.onRestart();
        Log.e("RRRRRRRR","onRestart()");
    }
    protected void onDestroy() {
        // 6
        super.onDestroy();
        Log.e("RRRRRRRR","onDestroy()");
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                TextView tv = findViewById(R.id.textView);
                tv.setText("Приложение уже запущено");
                break;
            case R.id.button2:
                finish();
                break;
        }
    }


}

package com.demo.toaster;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by DELL on 30-Jan-16.
 */
public class WelcomeActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("info", "WelcomeActivity has been started ...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        textView=(TextView)findViewById(R.id.textView);
        String message=getIntent().getStringExtra("user_name");
        textView.setText(message);

    }
}

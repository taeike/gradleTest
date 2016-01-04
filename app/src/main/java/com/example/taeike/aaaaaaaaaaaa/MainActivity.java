package com.example.taeike.aaaaaaaaaaaa;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @ViewById(R.id.textView)
    TextView textText;

    @ViewById(R.id.textView2)
    TextView textText2;

    @ViewById(R.id.button)
    Button button;

    @Click(R.id.button)
    void myButton(){
        String name =  textText.getText().toString();
    }
}

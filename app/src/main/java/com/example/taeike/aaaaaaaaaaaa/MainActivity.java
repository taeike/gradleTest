package com.example.taeike.aaaaaaaaaaaa;

import android.app.Activity;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main_)
public class MainActivity extends Activity {
    @ViewById(R.id.textView)
    TextView textText;
    @ViewById(R.id.textView2)
    TextView textText2;
/*
    @Click
    public void myButton(View v){
        String name =  textText.getText().toString();
        textText2.setText(name);
    }*/
    @Click(R.id.textView)
    public void myButton() {
        String name =  textText.getText().toString();
        textText2.setText(name);
    }
}

package com.example.healthy_content;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_sitting_posture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sitting_posture(View v){
        Intent intent = new Intent(this,activity_sitting_posture.class);
        startActivity(intent);

    }
    public void home_row_position(View v){
        Intent intent = new Intent(this,home_row_position.class);
        startActivity(intent);
    }
    public void keyboard_scheme(View v){
        Intent intent =  new Intent(this,keyboard_scheme.class);
        startActivity(intent);
    }
    public void finger_motion(View v){
        Intent intent =  new Intent(this,fingers_motion.class);
        startActivity(intent);
    }
    public void typing_speed(View v){
        Intent intent =  new Intent(this,typing_speed.class);
        startActivity(intent);
    }
    public void take_care(View v){
        Intent intent =  new Intent(this,take_care.class);
        startActivity(intent);
    }
    public void contact_developer(View v){
        Intent intent =  new Intent(this,contact_developer.class);
        startActivity(intent);
    }

}
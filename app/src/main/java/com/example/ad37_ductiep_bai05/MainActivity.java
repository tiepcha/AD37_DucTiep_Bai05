package com.example.ad37_ductiep_bai05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button Mainbtn1 , Mainbtn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mainbtn1 = findViewById(R.id.Mainbtn1);
        Mainbtn2 = findViewById(R.id.Mainbtn2);


        Mainbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),ContactActivity.class));

            }
        });
        Mainbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getBaseContext(),FoodOrder.class));
            }
        });



    }

}

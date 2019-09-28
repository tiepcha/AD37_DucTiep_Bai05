package com.example.ad37_ductiep_bai05;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Food_order2 extends AppCompatActivity {

    static List<Food> listOrder = new ArrayList<>();
    RelativeLayout foodorder2;
    TextView tvtotalprice2 ;
    int price;
    FoodAdapter2 foodAdapter2;
    RecyclerView rcvfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order2);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Your Order");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        foodorder2 = findViewById(R.id.foodorder2);
        tvtotalprice2 = findViewById(R.id.tvtotalprice2);
        rcvfood = findViewById(R.id.rcvfood);
        Intent intent = getIntent();

//        listOrder.add((Food) intent.getSerializableExtra("food"));
        listOrder = (List<Food>) intent.getSerializableExtra("list order");
        price =  intent.getIntExtra("price",price);


        foodAdapter2 = new FoodAdapter2(listOrder);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),
                LinearLayoutManager.VERTICAL, false);


        rcvfood.setLayoutManager(layoutManager);
        rcvfood.setAdapter(foodAdapter2);

        tvtotalprice2.setText(String.valueOf(price)+"$");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}

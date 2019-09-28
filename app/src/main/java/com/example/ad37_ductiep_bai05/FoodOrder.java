package com.example.ad37_ductiep_bai05;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FoodOrder extends AppCompatActivity {

    List<Food> listOrder = new ArrayList<>();
    List<Food> foods ;
    FoodAdapter foodAdapter ;
    RecyclerView rcvfood;
    TextView tvnumcart,tvtotalprice2,tvsuccess;
    int numcart = 0 ;
    ImageView imgcart;
    int price = 0 ;
    Button btnord;

    Food f1,f2,f3,f4,f5,f6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_food_order);
        rcvfood = findViewById(R.id.rcvfood);
        tvnumcart = findViewById(R.id.tvnumcart);
        tvtotalprice2 = findViewById(R.id.tvtotalprice2);
        tvsuccess = findViewById(R.id.tvsuccess);
        btnord = findViewById(R.id.btnord);
        imgcart = findViewById(R.id.imgcart);
        foods = new ArrayList<>();

        f1 = new Food("Pizza Panda",0);
        f2 = new Food("KFC Super",0);
        f3 = new Food("Bread Eggs",0);
        f4 = new Food("Coca Cola",0);
        f5 = new Food("Chicken Super",0);
        f6 = new Food("Cup Cake",0);

        foods.add(f1);
        foods.add(f2);
        foods.add(f3);
        foods.add(f4);
        foods.add(f5);
        foods.add(f6);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),
                LinearLayoutManager.VERTICAL, false);

        foodAdapter = new FoodAdapter(foods);

        foodAdapter.setIonClickContact(new IonClickContact() {
            @Override
            public void onClickRelativeLayout(Contact contact) {

            }


            @Override
            public void onClickLinearLayout(Food food) {
                numcart++;
                price = numcart*10;
                tvtotalprice2.setText(String.valueOf(price)+"$");
                tvnumcart.setText(String.valueOf(numcart));
                if (!listOrder.contains(food)){
                listOrder.add(food);}
                else {
                    for ( Food e : listOrder){
                        if (e.getFname()==food.getFname()){
                            e.fnum++;
                        }
                    }

//                startActivity(intent);
                }



            }
        });


        imgcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rcvfood.getContext(),Food_order2.class);
//
                intent.putExtra("list order", (Serializable) listOrder);
                intent.putExtra("price",price);

                startActivity(intent);
            }
        });



        btnord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsuccess.setText("Thank you! Your order is sent to restaurant");
            }
        });





        rcvfood.setLayoutManager(layoutManager);
        rcvfood.setAdapter(foodAdapter);











    }



}

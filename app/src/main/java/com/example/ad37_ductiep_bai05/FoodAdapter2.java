package com.example.ad37_ductiep_bai05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class FoodAdapter2 extends RecyclerView.Adapter<FoodAdapter2.Viewhoder> {
    List<Food> listOrder;


    public FoodAdapter2(List<Food> listOrder) {
        this.listOrder = listOrder;
    }




    @Override
    public Viewhoder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.layout_fooditem,parent,false);

        Viewhoder viewhoder = new Viewhoder(view);

        return viewhoder;
    }

    @Override
    public void onBindViewHolder( Viewhoder holder, int position) {

         Food food = listOrder.get(position) ;
         int foodnum = food.getFnum();
        foodnum++;

        holder.tvfood.setText(food.getFname() +"("+foodnum+")");



    }

    @Override
    public int getItemCount() {
        return listOrder.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvfood;
        LinearLayout fooditem;
        public Viewhoder( View itemView) {
            super(itemView);
            tvfood = itemView.findViewById(R.id.tvfood);
            fooditem = itemView.findViewById(R.id.fooditem);
        }
    }
}
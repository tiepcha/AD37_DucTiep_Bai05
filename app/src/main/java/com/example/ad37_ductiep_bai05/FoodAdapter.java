package com.example.ad37_ductiep_bai05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.Viewhoder> {
    List<Food> foods;
    IonClickContact icontact;

    public FoodAdapter(List<Food> foods) {
        this.foods = foods;
    }

    public void setIonClickContact(IonClickContact icontact) {
        this.icontact = icontact;
    }


    @NonNull
    @Override
    public Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.layout_fooditem,parent,false);

        Viewhoder viewhoder = new Viewhoder(view);

        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhoder holder, int position) {

        final Food food = foods.get(position) ;

        holder.tvfood.setText(food.getFname());

        holder.fooditem.setOnClickListener(new View.OnClickListener()   {

            @Override
            public void onClick(View view) {
                icontact.onClickLinearLayout(food);
            }
        });


    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvfood;
        LinearLayout fooditem;
        public Viewhoder(@NonNull View itemView) {
            super(itemView);
            tvfood = itemView.findViewById(R.id.tvfood);
            fooditem = itemView.findViewById(R.id.fooditem);
        }
    }
}
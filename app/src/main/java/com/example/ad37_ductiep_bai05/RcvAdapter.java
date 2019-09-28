package com.example.ad37_ductiep_bai05;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class RcvAdapter extends RecyclerView.Adapter<RcvAdapter.Viewhoder> {
    List<Contact> listContact = new ArrayList<>();
    IonClickContact icontact;


    public void setIonClickContact(IonClickContact icontact) {
        this.icontact = icontact;
    }

    public RcvAdapter(List<Contact> listContact) {
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_contact ,parent,false);

        Viewhoder viewhoder = new Viewhoder(view);

        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhoder holder, int i) {
        final Contact contact = listContact.get(i);


        holder.tvname.setText(contact.getName());
        holder.tvtype.setText(contact.getType());
        holder.tvtime.setText(contact.getTime().get(0));


        holder.imginfo.setImageResource(R.drawable.info);

        switch (contact.getStt()) {
            case 1:
                holder.imgicon.setImageResource(R.drawable.outgoingcall);
                break;
            case 2:
                holder.imgicon.setImageResource(R.drawable.incomingcall);
                break;
            case 0:
                holder.imgicon.setImageResource(R.drawable.missedcall);
                //  tvname.setTextColor(getResources().getColor(R.color.Red);
                holder.tvname.setTextColor(Color.RED);
                break;
        }

        holder.rcvitem.setOnClickListener(new View.OnClickListener()   {

            @Override
            public void onClick(View view) {
                icontact.onClickRelativeLayout(contact);
            }
        });

    }


    @Override
    public int getItemCount() {
        return listContact.size();
    }
    


    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvname,tvtype,tvtime;
        ImageView imgicon , imginfo;
        RelativeLayout rcvitem ;

        public Viewhoder(@NonNull View itemView) {
            super(itemView);

            rcvitem = itemView.findViewById(R.id.rvcitem);

            tvname = itemView.findViewById(R.id.tvname);
            tvtime = itemView.findViewById(R.id.tvtime);
            tvtype = itemView.findViewById(R.id.tvtype);


            imgicon = itemView.findViewById(R.id.imgicon);
            imginfo = itemView.findViewById(R.id.imginfo);

        }
    }
}
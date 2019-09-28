package com.example.ad37_ductiep_bai05;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity implements Serializable {

    Contact contact;
    RelativeLayout rlbg;
    ImageView imgava;
    TextView tvname, tvnum, tvtype;
    List<String> listTimeCall;
    AdapterTimeCall adapterTimeCall;
    ListView lvtimecall;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.item_activity);


        rlbg = findViewById(R.id.rlbg);
        tvname = findViewById(R.id.tvname);
        imgava = findViewById(R.id.imgava);
        tvnum = findViewById(R.id.tvnum);
        tvtype = findViewById(R.id.tvtype);
        lvtimecall = findViewById(R.id.lvtimecall);

        Intent intent = getIntent();

        contact = (Contact) intent.getSerializableExtra("contact");


        listTimeCall = (List<String>) intent.getSerializableExtra("listcontact");
        listTimeCall.add(contact.num);

        adapterTimeCall = new AdapterTimeCall(listTimeCall);
        lvtimecall.setAdapter(adapterTimeCall);


        switch (contact.getName().toLowerCase()) {

            case "tony stark":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.tony);
                rlbg.setBackground(getDrawable(R.drawable.tony));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "bruce banner":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.hulk);
                rlbg.setBackground(getDrawable(R.drawable.hulk));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "thor":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.thor);
                rlbg.setBackground(getDrawable(R.drawable.thor));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "peter parker":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.peter);
                rlbg.setBackground(getDrawable(R.drawable.peter));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "thanos":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.thanos);
                rlbg.setBackground(getDrawable(R.drawable.thanos));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "grooooooot":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.groot);
                rlbg.setBackground(getDrawable(R.drawable.groot));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "steve rogers":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.cap);
                rlbg.setBackground(getDrawable(R.drawable.cap));
                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "natasha romanoff":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.black);
                rlbg.setBackground(getDrawable(R.drawable.black));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "stephen strange":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.stran);
                rlbg.setBackground(getDrawable(R.drawable.stran));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "stan lee":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.stan);
                rlbg.setBackground(getDrawable(R.drawable.stan));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "donald trump":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.trump);
                rlbg.setBackground(getDrawable(R.drawable.trump));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "vladimir putin":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.putin);
                rlbg.setBackground(getDrawable(R.drawable.putin));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "tap can binh":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.binh);
                rlbg.setBackground(getDrawable(R.drawable.binh));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "ria sakuxxx":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.ria);
                rlbg.setBackground(getDrawable(R.drawable.ria));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;
            case "sir alex":
                tvname.setText(contact.getName());
                imgava.setImageResource(R.drawable.sir);
                rlbg.setBackground(getDrawable(R.drawable.sir));

                tvnum.setText(contact.getNum());
                tvtype.setText(contact.getType());
                break;


        }


    }

}

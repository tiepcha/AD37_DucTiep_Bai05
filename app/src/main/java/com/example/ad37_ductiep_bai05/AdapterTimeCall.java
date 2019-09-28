package com.example.ad37_ductiep_bai05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterTimeCall extends BaseAdapter {
    List<String> listTimeCall;
    String num;



    public AdapterTimeCall(List<String> listTimeCall) {
        this.listTimeCall = listTimeCall;
    }

    @Override
    public int getCount() {
        return listTimeCall.size();
    }

    @Override
    public Object getItem(int i) {
        return listTimeCall.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        num= listTimeCall.get(listTimeCall.size()-1);

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        View v = inflater.inflate(R.layout.layout_timecall, viewGroup, false);





            TextView tvtimecall = v.findViewById(R.id.tvtimecall);
            TextView tvnum = v.findViewById(R.id.tvnum);
            TextView tvinfo = v.findViewById(R.id.tvinfo);


            tvtimecall.setText(listTimeCall.get(i));
            tvnum.setText(num);
            tvinfo.setText("đổ chuông 3 lần");



        return v;
    }

}

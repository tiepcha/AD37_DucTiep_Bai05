package com.example.ad37_ductiep_bai05;




import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

    public class Contact implements Serializable {

        String name , num  , type , icon  ;
        List<String> time;
        int stt;

        public Contact(String name, String num, ArrayList<String> time, String type, String icon, int stt) {
            this.name = name;
            this.num = num;
            this.time = time;
            this.type = type;
            this.icon = icon;
            this.stt = stt ;
        }

        public List<String> getTime() {
            return time;
        }

        public void setTime(List<String> time) {
            this.time = time;
        }

        public int getStt() {
            return stt;
        }

        public void setStt(int stt) {
            this.stt = stt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

    }



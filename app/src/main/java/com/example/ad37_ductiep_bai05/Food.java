package com.example.ad37_ductiep_bai05;

import java.io.Serializable;

public class Food implements Serializable {
    String fname;
    int fnum;

    public Food(String fname, int fnum) {
        this.fname = fname;
        this.fnum = fnum;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getFnum() {
        return fnum;
    }

    public void setFnum(int fnum) {
        this.fnum = fnum;
    }
}

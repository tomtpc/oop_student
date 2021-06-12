package com.student;

import java.io.Serializable;

public class Student implements Serializable{
    private String HoTen, Lop;
    private double diemTB;

    public void setLop(String lop) {
        Lop = lop;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getLop() {
        return Lop;
    }

    @Override
    public String toString() {
        return this.HoTen + "\t" + this.getLop()+ "\t" + this.getLop()+"\t";
    }
}

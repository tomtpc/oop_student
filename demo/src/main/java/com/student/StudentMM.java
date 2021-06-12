package com.student;

public class StudentMM extends Student{
    private String Khoa;

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa() {
        Khoa = "Mat Ma";
    }

    @Override
    public String toString() {
        return super.toString()+this.getKhoa()+"\n";
    }
}

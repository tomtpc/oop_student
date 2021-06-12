package com.student;

public class StudentAT extends Student{
    private String Khoa;

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa() {
        Khoa = "An Toan";
    }

    @Override
    public String toString() {
        return super.toString()+this.getKhoa()+"\n";
    }
}

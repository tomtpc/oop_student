package com.student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static ArrayList<StudentAT> at = new ArrayList<>();
    static ArrayList<StudentMM> mm = new ArrayList<>();
    static ArrayList<StudentCT> ct = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void inputAT() {
        StudentAT temp = new StudentAT();
        System.out.println("Input name: "); temp.setHoTen(sc.nextLine());
        System.out.println("Input class: "); temp.setLop(sc.nextLine());
        System.out.println("Input point: "); temp.setDiemTB(Double.parseDouble(sc.nextLine()));
        temp.setKhoa();
        at.add(temp);
    }

    public static void inputCT() {
        StudentCT temp = new StudentCT();
        System.out.println("Input name: "); temp.setHoTen(sc.nextLine());
        System.out.println("Input class: "); temp.setLop(sc.nextLine());
        System.out.println("Input point: "); temp.setDiemTB(Double.parseDouble(sc.nextLine()));
        temp.setKhoa();
        ct.add(temp);
    }

    public static void inputMM() {
        StudentMM temp = new StudentMM();
        System.out.println("Input name: "); temp.setHoTen(sc.nextLine());
        System.out.println("Input class: "); temp.setLop(sc.nextLine());
        System.out.println("Input point: "); temp.setDiemTB(Double.parseDouble(sc.nextLine()));
        temp.setKhoa();
        mm.add(temp);
    }

    public static void show(){
        System.out.println("Which one do you want to show (1.MM 2.AT 3.CT)");
        System.out.println("Input: "); int input = Integer.parseInt(sc.nextLine());
        switch(input){
            case 1:
                show_print();
                for(StudentMM a: mm) {
                    System.out.println(a.toString());
                }
                break;
            case 2:
                show_print();
                for(StudentAT a: at) {
                    System.out.println(a.toString());
                }
                break;
            case 3:
                show_print();
                for(StudentCT a: ct){
                    System.out.println(a.toString());
                }
                break;
        }
        System.out.println("\nEnd of data.");
    }



    public static void show_highest(){
        System.out.println("Now showing the highest student in each Faculty...");
        System.err.println("MM Faculty: ");
        double temp = 0;
        String ans="";
        for(StudentMM a: mm){
            if(a.getDiemTB() > temp){
                temp = a.getDiemTB();
                ans = a.toString();
            } 
        }
        System.out.println(ans);
        System.err.println("AT Faculty: ");
        double temp1 = 0;
        String ans1="";
        for(StudentAT b: at){
            if(b.getDiemTB() > temp1){
                temp1 = b.getDiemTB();
                ans1 = b.toString();
            } 
        }
        System.out.println(ans1);
        System.err.println("CT Faculty: ");
        double temp2 = 0;
        String ans2="";
        for(StudentCT c: ct){
            if(c.getDiemTB() > temp2){
                temp2 = c.getDiemTB();
                ans2 = c.toString();
            } 
        }
        System.out.println(ans2);
    }

    public static void show_print(){
        System.out.printf("%-10s%-10s%-10s%-10s\n","Ho Ten","Lop","Diem","Khoa");
    }

    public static void inputData(){
        System.out.println("Which one do you want to input data (1.MM 2.AT 3.CT)");
        System.out.println("Input: "); int input = Integer.parseInt(sc.nextLine());
        switch(input){
            case 1:
                inputMM();
                break;
            case 2:
                inputAT();
                break;
            case 3:
                inputCT();
                break;
        }
        System.out.println("\nEnd of data.");
    }

    public static void menu() {
        System.out.println("1.input data");
        System.out.println("2.show all");
        System.out.println("3.show highest.");
        System.out.println("0.exit");
    }

    public static void main( String[] args )
    {
        int input;
        do{
            menu();
            System.out.println("input: "); input = Integer.parseInt(sc.nextLine());
            switch(input){
                case 1:
                    inputData();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    show_highest();
                    break;
            }
        }while(input != 0);
    }
}

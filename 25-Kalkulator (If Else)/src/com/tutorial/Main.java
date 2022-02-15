package com.tutorial;

import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float a, b, hasil;
        char operator;

        System.out.println("Latihan Kalkulator");
        System.out.print("nilai a = ");
        a = input.nextFloat();
        System.out.print("operator = ");
        operator = input.next().charAt(0);
        System.out.print("nilai b = ");
        b = input.nextFloat();
        System.out.println("lakukan = " + a + " " + operator + " " + b);

        if (operator == '+') {
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/') {
            hasil = a / b;
                if (b == 0) {
                    System.out.println("tidak dapat melakukan pembagian dengan 0");
                } else {
                    System.out.println("hasil = " + hasil);
                }
        } else {
                System.out.println("operator tidak ditemukan");
        }
    }
}

package com.tutorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float a,hasil;
        int b;
        System.out.println("Kalkulator");
        String operator;
        System.out.print("a = ");
        a = input.nextFloat();
        System.out.print("operator = ");
        operator = input.next();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.println("lakukan = " + a + " " + operator + " " + b);

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                switch(b){
                    case 0:
                        System.out.println("tidak dapat dibagi dengan 0");
                        break;
                    default:
                        hasil = a / b;
                        System.out.println("hasil = " + hasil);
                        break;
                }
                break;
            default:
                System.out.println("operator tidak ditemukan");
        }

    }
}

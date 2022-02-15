package com.tutorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        // Urutan aritmetika
        int hasil = 2 * 3 / 6;
        System.out.println(hasil);
        int hasil2 = 8 / 2 * 4;
        System.out.println(hasil2);
        int hasil3 = 8 / 2 / 4;
        System.out.println(hasil3);
        int hasil4 = 4 + 2 - 7;
        System.out.println(hasil4);
        int hasil5 = 3 - 2 + 7;
        System.out.println(hasil5);

        Scanner Masuk = new Scanner(System.in);
        // Berhitung
        int a, b, c, x, y;
        System.out.print("a = ");
        a = Masuk.nextInt();
        System.out.print("b = ");
        b = Masuk.nextInt();
        System.out.print("c = ");
        c = Masuk.nextInt();
        System.out.print("x = ");
        x = Masuk.nextInt();
        y = (a*x*x)+(b*x)+c;
        System.out.println("y = " + y);



    }
}

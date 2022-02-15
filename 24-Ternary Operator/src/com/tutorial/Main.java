package com.tutorial;

import java.util.*;
public class Main {
    public static void main(String[] args){

        // Ternary Operator
        // variabel = kondisi ? jika benar : jika salah;

        /*int x,y;

        Scanner nilai = new Scanner(System.in);
        System.out.print("nilai x = ");
        x = nilai.nextInt();
        y = (x < 0) ? (-x) : (x);
        System.out.println("mutlak x adalah " + y);*/
        System.out.print("  | ");
        for (int j = 0; j < 4; j++) System.out.print(" " + j);
        System.out.println("\n--------------");
        for (int i=0; i < 4; i++){
            System.out.print(i + " | ");
            for (int j = i; j <= 4; j++){
                System.out.printf("%4d",(i+j)%4);
            }
            System.out.println();
        }
    }
}

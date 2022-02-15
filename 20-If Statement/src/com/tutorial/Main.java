package com.tutorial;

import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner masuk = new Scanner(System.in);
        int x;
        System.out.print("x = ");
        x = masuk.nextInt();

        if(x == 3){
            System.out.println("nilai x = " + x + " benar");
        } else {
            System.out.println("nilai x = " + x + " salah");
        }
    }
}

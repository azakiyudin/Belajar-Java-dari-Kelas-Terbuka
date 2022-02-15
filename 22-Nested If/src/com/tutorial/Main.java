package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Nested If
        // If bersarang

        Scanner input = new Scanner(System.in);
        System.out.println("awal program");
        System.out.print("masukkan nilai a = ");
        int a = input.nextInt();
        System.out.print("masukkan nilai b = ");
        int b = input.nextInt();
        if (a == 5) {
            if (b > 5) {
                System.out.println("a = 5 dan b > 5");
            } else if (b == 5) {
                System.out.println("a = b = 5");
            } else {
                System.out.println("a = 5 dan b < 5");
            }
        } else if (a > 5) {
            if (b > 5) {
                System.out.println("a = b > 5");
            } else if (b == 5) {
                System.out.println("a > 5 dan b = 5");
            } else {
                System.out.println("a > 5 dan b < 5");
            }
        }
        else{
            if (b > 5) {
                System.out.println("a < 5 dan b > 5");
            } else if (b == 5) {
                System.out.println("a < 5 dan b = 5");
            } else {
                System.out.println("a < 5 dan b < 5");
            }
        }
    }
}
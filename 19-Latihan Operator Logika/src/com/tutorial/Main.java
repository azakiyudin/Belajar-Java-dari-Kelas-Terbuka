package com.tutorial;

import java.util.*;
public class Main {
    public static void main(String[] args){

        // ambil data user
        Scanner tebak = new Scanner(System.in);

        // tebakan
        int a = 3;
        System.out.print("masukkan tebakan = ");
        int tbak = tebak.nextInt();
        boolean tes;
        tes = (a == tbak);
        System.out.println("tebakan anda = " + tes);

        // range nilai
        int x;
        System.out.print("cek nilai = ");
        x = tebak.nextInt();
        boolean y;
        y = (x > 6) && (x < 11);
        System.out.println("nilai anda = " + y);

        // range nilai
        int p;
        System.out.print("cek nilai = ");
        p = tebak.nextInt();
        boolean r;
        r = (p < 6) || (p > 11);
        System.out.println("nilai anda = " + r);

    }
}

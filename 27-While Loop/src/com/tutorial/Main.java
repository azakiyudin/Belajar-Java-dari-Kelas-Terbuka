package com.tutorial;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bilangan = ");
        long n = input.nextLong();
        long cek;
        long fac = 2;
        long p = (n * (n + 1) / 2);
        for (long a=2; (a*a) <= p; a++) {
            cek = (p % a);
            if (cek == 0) {
                long b = p / (a - 1);
                if (b == (a - 1)) {
                    fac++;
                } else {
                    fac += 2;
                }
            }
        }
        System.out.println(p + " faktornya ada " + fac);


        /*long batas, f1, f2, f3, n;
        //boolean ko = true;
        //System.out.print("masukkan batas = ");
        //batas = input.nextLong();
        f1 = 0; f2 = 1;
        //n = 0;
        long x = 0;
        while(f1 < 80000000){
            f3 = f1 + f2;
            f2 = f1;
            f1 = f3;
            //System.out.println("fibonacci ke-" + n + " adalah " + f3);
            //batas--;
            //n++;
            if (f3 % 2 == 0){
                System.out.println(x + " + " + f3 + " = " + (x+f3));
                x = x + f3;
                f3 += f3;
            }
            /*if (batas == 0){
                ko = false;
            }*/
        }
    }
//}
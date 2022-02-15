package com.tutorial;

public class Main {
    public static void main(String[] args){

        // unary adalah operasi yang dilakukan pada satu variabel

        // unary + dan -
        int angka = 2;
        System.out.printf("unary '-', %d menjadi %d \n",angka,-angka);
        System.out.printf("unary '+', %d menjadi %d \n",angka,+angka);

        // unary increment dan decrement
        int angka2 = 6;
        angka2++;
        System.out.printf("nilai dengan '++' menjadi %d \n",angka2);

        int angka3 = 5;
        angka3--;
        System.out.printf("nilai dengan '--' menjadi %d \n",angka3);

        int a = 9;
        System.out.printf("nilai dengan '++' prefix menjadi %d \n",++a);

        int b = 9;
        System.out.printf("nilai dengan '++' postfix menjadi %d \n",b++);
        System.out.printf("nilai hasil postfix adalah %d \n",b);

        // unary boolean dengan tanda seru (!) untuk negasi
        boolean hehe = true;
        System.out.println("nilai boolean = " + hehe);
        System.out.println("nilai boolean = " + !hehe);
    }
}

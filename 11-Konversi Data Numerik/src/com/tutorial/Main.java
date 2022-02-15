package com.tutorial;

public class Main {
    public static void main(String[] args){

        // program konversi data
        int nilaiInt=509; //32-bit
        System.out.println("nilai integer = " + nilaiInt);

        // Memperluas ke tipe data yang lebih besar
        long nilaiLong=nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil ke tipe data yang lebih kecil
        byte nilaiByte=(byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);

        // Casting pembagian
        float a = 7; //Salah satu float
        int b = 3;

        float c = a/b;
        System.out.printf("%f / %d = %f \n",a,b,c);

        int p = 8;
        int q = 5;

        float r = (float) p/q; // langsung dikonversi
        System.out.printf("%d / %d = %f",p,q,r);
    }
}

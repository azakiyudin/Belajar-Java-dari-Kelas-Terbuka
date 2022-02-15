package com.tutorial;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        //Mengambil input
        Scanner userInput = new Scanner(System.in);

        //Menghitung Luas dan Volume
        /*int sisi, luas, volume;
        System.out.println("MENGHITUNG LUAS PERSEGI DAN VOLUME KUBUS");
        System.out.print("Sisi = ");
        sisi = userInput.nextInt();
        luas = sisi * sisi;
        volume = luas * sisi;
        System.out.println("Luas = " + luas);
        System.out.print("Volume = " + volume + "\n");*/

        //Menghitung volume limas segitiga
        float p, q, r, alas, tsegitiga, luasalas, tlimas, vlimas;
        p = 1;
        q = 2;
        r = 3;
        System.out.println("MENGHITUNG VOLUME LIMAS SEGITIGA");
        System.out.print("alas segitiga = ");
        alas = userInput.nextFloat();
        System.out.print("tinggi segitiga = ");
        tsegitiga = userInput.nextFloat();
        System.out.print("tinggi limas = ");
        tlimas = userInput.nextFloat();
        luasalas = p / q * alas * tsegitiga;
        System.out.println("Luas alas = " + luasalas);
        vlimas = p / r * tlimas * luasalas;
        System.out.println("Volume limas = " + vlimas);

    }
}

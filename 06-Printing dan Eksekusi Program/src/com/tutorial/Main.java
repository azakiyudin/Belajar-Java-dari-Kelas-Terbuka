package com.tutorial;

public class Main {

    public static void main(String[] args){

        System.out.println("baris pertama"); //Statement diakhiri ";"
        System.out.println("baris kedua"); //Eksekusi baris per baris

        System.out.print("baris ketiga"); //print akan nempel dengan baris bawahnya
        System.out.println("baris keempat pasti nempel dengan baris ketiga"); //baris bawahnya ga akan nempel karena pakai "ln" (line)

        System.out.print("baris kelima ga akan nempel \n"); //command enternya ada di baris keempat
        System.out.print("baris keenam enter manual \n"); //"\n" untuk enter
        System.out.printf("baris ketujuh kurang tau juga ini untuk apa %d", 51); //printf untuk ya begitu contohnya ada angkanya

    }
}

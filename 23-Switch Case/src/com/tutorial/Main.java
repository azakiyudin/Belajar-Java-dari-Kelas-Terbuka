package com.tutorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        // Switch Case

        String nama, jwb;

        Scanner input = new Scanner(System.in);
        System.out.print("syp nama km: ");
        nama = input.next();
        switch (nama){
            case "lupa":
                System.out.println("kok lupa???");
                break;
            case "gtw":
                System.out.println("lah kok gtw???");
                break;
            default:
                System.out.print("ohh " + nama + " ya\nkm mw gk jd pcrku? (y/g): ");
                jwb = input.next();
                switch (jwb){
                    case "y":
                        System.out.println("ok km jd pcrku yhh " + nama);
                        break;
                    case "g":
                        System.out.println("yhh sedih bgtt :((");
                        break;
                    default:
                        System.out.println("jawaban km gk valid");
                }
        }
    }
}

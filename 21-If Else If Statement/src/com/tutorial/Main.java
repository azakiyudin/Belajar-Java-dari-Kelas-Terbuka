package com.tutorial;


import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("a = ");
        a = input.nextInt();
        if(a > 6){
            System.out.println("a = " + a + " > 3");
        }
        else if(a < 2){
            System.out.println("a = " + a + " < 2");
        }
        else if(a == 2 || a == 6){
            System.out.println("a = " + a);
        }
        else{
            System.out.println("2 < " + a + " < 6");
        }
    }
}

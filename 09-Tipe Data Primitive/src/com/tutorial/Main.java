package com.tutorial;

public class Main {
    public static void main(String[] args){
        // tipe data di java:
        // integer, byte, short, long, double, float, char, boolean

        // integer (bilangan bulat)
        int i = 10;
        System.out.println("=====TIPE DATA INTEGER=====");
        System.out.println("nilai integer i = " + i);
        System.out.println("nilai maksimum = " + Integer.MAX_VALUE);
        System.out.println("nilai minimum = " + Integer.MIN_VALUE);
        System.out.println("besar integer = " + Integer.BYTES + " bytes");
        System.out.println("besar integer = " + Integer.SIZE + " bit");

        // byte (bilangan bulat)
        byte b = 10;
        System.out.println("=====TIPE DATA BYTE=====");
        System.out.println("nilai byte b = " + b);
        System.out.println("nilai maksimum = " + Byte.MAX_VALUE);
        System.out.println("nilai minimum = " + Byte.MIN_VALUE);
        System.out.println("besar integer = " + Byte.BYTES + " bytes");
        System.out.println("besar integer = " + Byte.SIZE + " bit");

        // short (bilangan bulat)
        short s = 10;
        System.out.println("=====TIPE DATA SHORT=====");
        System.out.println("nilai short s = " + s);
        System.out.println("nilai maksimum = " + Short.MAX_VALUE);
        System.out.println("nilai minimum = " + Short.MIN_VALUE);
        System.out.println("besar integer = " + Short.BYTES + " bytes");
        System.out.println("besar integer = " + Short.SIZE + " bit");

        // long (bilangan bulat)
        long l = 10L;
        System.out.println("=====TIPE DATA LONG=====");
        System.out.println("nilai long l = " + l);
        System.out.println("nilai maksimum = " + Long.MAX_VALUE);
        System.out.println("nilai minimum = " + Long.MIN_VALUE);
        System.out.println("besar integer = " + Long.BYTES + " bytes");
        System.out.println("besar integer = " + Long.SIZE + " bit");

        // double (bilangan real)
        double d = -10.5D;
        System.out.println("=====TIPE DATA DOUBLE=====");
        System.out.println("nilai double d = " + d);
        System.out.println("nilai maksimum = " + Double.MAX_VALUE);
        System.out.println("nilai minimum = " + Double.MIN_VALUE);
        System.out.println("besar integer = " + Double.BYTES + " bytes");
        System.out.println("besar integer = " + Double.SIZE + " bit");

        // float (bilangan real)
        float f = -8.5F;
        System.out.println("=====TIPE DATA FLOAT=====");
        System.out.println("nilai float f = " + f);
        System.out.println("nilai maksimum = " + Float.MAX_VALUE);
        System.out.println("nilai minimum = " + Float.MIN_VALUE);
        System.out.println("besar integer = " + Float.BYTES + " bytes");
        System.out.println("besar integer = " + Float.SIZE + " bit");

        // char (karakter) berdasarkan ASCII
        char c = 'c';
        System.out.println("=====TIPE DATA CHAR=====");
        System.out.println("nilai char c = " + c);
        System.out.println("nilai maksimum = " + Character.MAX_VALUE);
        System.out.println("nilai minimum = " + Character.MIN_VALUE);
        System.out.println("besar integer = " + Character.BYTES + " bytes");
        System.out.println("besar integer = " + Character.SIZE + " bit");

        // boolean (benar-salah)
        // tidak ada maximum/minimum
        boolean val = false;
        System.out.println("=====TIPE DATA BOOLEAN=====");
        System.out.println("nilai boolean val = " + val);
        System.out.println("nilai maksimum = " + Boolean.TRUE);
        System.out.println("nilai minimum = " + Boolean.FALSE);
    }
}

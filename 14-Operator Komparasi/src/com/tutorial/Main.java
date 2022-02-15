package com.tutorial;

public class Main {
    public static void main(String[] args){

        // Operator komparasi akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // Operator Persamaan
        System.out.println("===PERSAMAAN===");
        a = 20;
        b = 32;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %b \n",a,b,hasilKomparasi);

        a = 20;
        b = 20;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %b \n",a,b,hasilKomparasi);

        // Operator Pertaksamaan
        System.out.println("===PERTAKSAMAAN===");
        a = 20;
        b = 32;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %b \n",a,b,hasilKomparasi);

        a = 32;
        b = 32;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %b \n",a,b,hasilKomparasi);

        // Operator Pertidaksamaan (Kurang Dari)
        System.out.println("===PERTIDAKSAMAAN KURANG DARI===");
        a = 20;
        b = 32;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %b \n",a,b,hasilKomparasi);

        a = 32;
        b = 15;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %b \n",a,b,hasilKomparasi);

        // Operator Pertidaksamaan (Lebih Dari)
        System.out.println("===PERTIDAKSAMAAN LEBIH DARI===");
        a = 20;
        b = 32;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %b \n",a,b,hasilKomparasi);

        a = 32;
        b = 15;
        hasilKomparasi = (a < b);
        System.out.printf("%d > %d --> %b \n",a,b,hasilKomparasi);

        // Operator Pertidaksamaan (Kurang Dari Sama Dengan)
        System.out.println("===PERTIDAKSAMAAN KURANG DARI SAMA DENGAN===");
        a = 32;
        b = 32;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %b \n",a,b,hasilKomparasi);

        // Operator Pertidaksamaan (Lebih Dari Sama Dengan)
        System.out.println("===PERTIDAKSAMAAN LEBIH DARI SAMA DENGAN===");
        a = 20;
        b = 20;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %b \n",a,b,hasilKomparasi);

    }
}

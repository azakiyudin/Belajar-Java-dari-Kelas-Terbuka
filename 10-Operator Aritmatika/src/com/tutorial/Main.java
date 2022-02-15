package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operasi Aritmatika
        int pertama = 6;
        int kedua = 4;

        int hasil;

        // 1. Penjumlahan
        hasil = pertama + kedua;
        System.out.println(pertama + " + " + kedua + " = " + hasil);

        // 2. Pengurangan
        hasil = pertama - kedua;
        System.out.printf("%d - %d = %d \n",pertama,kedua,hasil);

        // 3. Perkalian
        hasil = pertama * kedua;
        System.out.printf("%d x %d = %d \n",pertama,kedua,hasil);

        // 4. Pembagian
        hasil = pertama / kedua;
        System.out.printf("%d / %d = %d \n",pertama,kedua,hasil);

        float a = 6;
        float b = 4;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);
        System.out.printf("%f / %f = %f \n",a,b,hasilFloat);

        // 5. Modulus (sisa pembagian)
        hasil = pertama % kedua;
        System.out.printf("%d %% %d = %d \n",pertama,kedua,hasil);
    }

}

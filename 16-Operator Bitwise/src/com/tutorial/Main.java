package com.tutorial;

public class Main {
    public static void main(String[] args){

        //Operator bitwise -> operator pada bit

        byte a,b,c;
        String a_bits,b_bits,c_bits;

        a = 5;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n \n",a_bits,a);

        //SHIFT LEFT (<<)
        System.out.println("===SHIFT LEFT (<<)===");
        b = (byte)(a << 2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n \n",b_bits,b);

        //SHIFT RIGHT (>>)
        System.out.println("===SHIFT RIGHT (<<)===");
        b = (byte)(a >> 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n \n",b_bits,b);

        //BITWISE OR (|)
        System.out.println("===BITWISE OR (|)===");
        a = 20;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 13;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("--------------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n \n",c_bits,c);

        //BITWISE AND (&)
        System.out.println("===BITWISE AND (&)===");
        a = 34;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 23;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("--------------AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n \n",c_bits,c);

        //BITWISE XOR (^)
        System.out.println("===BITWISE XOR (^)===");
        a = 21;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 13;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("--------------XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n \n",c_bits,c);

        //BITWISE NEGASI (~)
        System.out.println("===BITWISE NEGASI (~)===");
        a = 11;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        System.out.println("--------------NEGASI");
        b = (byte)(~a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n",b_bits,b);
    }
}

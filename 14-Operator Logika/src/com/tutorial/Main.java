package com.tutorial;

public class Main {
    public static void main(String[] args){

        // Operator Logika
        // Operasi yang dapat dilakukan pada tipe pada boolean
        // AND, OR, XOR, negasi
        // OPERATOR ATAU (OR ||)
        boolean a,b,c;
        System.out.println("===OPERATOR OR (||)===");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " --> " + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " --> " + c);

        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " --> " + c);

        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " --> " + c);

        // OPERATOR AND
        System.out.println("===OPERATOR AND (&&)===");
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " --> " + c);

        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " --> " + c);

        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " --> " + c);

        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " --> " + c);

        // OPERATOR XOR (^)
        System.out.println("===OPERATOR XOR (^)===");
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " --> " + c);

        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " --> " + c);

        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " --> " + c);

        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " --> " + c);

        // OPERATOR NEGASI (!)
        System.out.println("===OPERATOR NEGASI (!)===");
        a = true;
        b = (!a);
        System.out.println(a + " --> (!) " + b);

        a = false;
        b = (!a);
        System.out.println(a + " --> (!) " + b);


    }
}

/*Create and use methods (functions) in Java
Use method parameters and return types
Understand method overloading */

import java.util.Scanner;

public class function {
    public static void main(String args[]) {
        MathFunction mf = new MathFunction();
        StringFunction sf = new StringFunction();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nmbr:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Addition" + mf.add(a, b, c));
        System.out.println("Substraction" + mf.substract(a, b));
        System.out.println("Multiplication" + mf.multiply(a, b));

        sc.nextLine();
        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println("String in uppercase:" + sf.toUpper(str));
        System.out.println("String length:" + sf.length(str));

    }
}

class MathFunction {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int substract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

class StringFunction {
    String toUpper(String s) {
        return s.toUpperCase();
    }

    int length(String s) {
        return s.length();
    }
}

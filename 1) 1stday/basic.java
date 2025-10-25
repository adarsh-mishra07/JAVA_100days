//Variables and Data Types

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int age = 22;
        double price = 99.99;
        char grade = 'A';
        String name = "Adarsh Mishra";
        boolean isJavaFun = true;

        System.out.println("Name :" + name);
        System.out.println("Price :" + price);
        System.out.println("Grade :" + grade);
        System.out.println("age :" + age);
        System.out.println("Is java fun :" + isJavaFun);

        Input I = new Input();
        I.Intro();

        Operator O = new Operator();
        O.operator();

        Condition c = new Condition();
        c.condition();
    }
}

// input from user (Scanner Class)

class Input {
    void Intro() {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = Sc.nextLine();

        System.out.println("Enter your PhoneNumber :");
        int PhoneNumber = Sc.nextInt();

        System.out.println("Welcome: " + name + "and Your mbl nmbr is :" + PhoneNumber);
    }
}

class Operator {
    void operator() {
        int a = 10, b = 2;
        System.out.println("Addition:" + (a + b));
        System.out.println("Substraction:" + (a - b));
        System.out.println("Multiplication:" + (a * b));
        System.out.println("Division:" + (a / b));
        System.out.println("Modulus:" + (a % b));
    }
}

class Condition {

    void condition() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("Grade: A+");
        else if (marks >= 75)
            System.out.println("Grade: A");
        else if (marks >= 50)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: Fail");
    }

}
import java.util.Scanner;

public class loop {
    public static void main(String args[]) {
        Day2 D1 = new Day2();
        // D1.q1();
        // D1.q2();
        // D1.q3();
        D1.q4();
    }
}

// Q1: Print numbers from 1 to 10 using while and for both
class Day2 {

    void q1() {
        System.out.println("For loop : 1 to 10 :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 1;
        System.out.println("while loop : 1 to 10 :");
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // Q2: Print even numbers between 1–20

    void q2() {
        System.out.println("Even NUmber : 1 to 20 :");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    // Q3: Take a number from user and print its multiplication table

    void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for multiplication");
        int i = sc.nextInt();
        System.out.println("Multiplication of :" + i);
        for (int j = 1; j <= 10; j++) {
            int mul = i * j;
            System.out.println(mul);
        }
    }

    // Q4: Take a number and find its factorial
    void q4() {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number factorial");
        int num = sc.nextInt();
        for (int j = num; j > 0; j--) {
            fact = fact * j;
        }
        System.out.println("Factorial of : " + num + " is = " + fact);
    }

}

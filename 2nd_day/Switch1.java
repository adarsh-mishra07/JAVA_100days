
import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Calculation C = new Calculation();
        C.cal();
    }
}

class Calculation {
    void cal() {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Addition 2) Substraction 3) Multiplication 4)Division :");
        System.out.println("Enter the Operation number do you want :");
        a = sc.nextInt();
        System.out.println("Enter the number num1 and num2 to perform operation");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch (a) {
            case (1):
                int result = num1 + num2;
                System.out.println("This Addition of:" + num1 + "and" + num2 + " is " + result);
                break;

            case (2):
                int result2 = num1 - num2;
                System.out.println("This Substraction of:" + num1 + "and" + num2 + " is " + result2);
                break;

            case (3):
                int result3 = num1 * num2;
                System.out.println("This multiplication of:" + num1 + "and" + num2 + " is " + result3);
                break;

            case (4):
                int result4 = num1 / num2;
                System.out.println("This Division of:" + num1 + "and" + num2 + " is " + result4);
                break;

            default:
                System.out.println("please enter vallid operation number");
                break;
        }
    }
}

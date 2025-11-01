
import java.util.Scanner;

public class MathAssist {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1) Addition 2) Substraction 3) Multiplication 4)Division :");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("Enter the number num1 and num2 to perform operation");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            switch (choice) {

                case (1):
                    int result = num1 + num2;
                    System.out.println("This Addition of:" + num1 + " and " + num2 + " is " + result);
                    break;

                case (2):
                    int result2 = num1 - num2;
                    System.out.println("This Substraction of:" + num1 + " and " + num2 + " is " + result2);
                    break;

                case (3):
                    int result3 = num1 * num2;
                    System.out.println("This multiplication of:" + num1 + " and " + num2 + " is " + result3);
                    break;

                case (4):
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        int result4 = num1 / num2;
                        System.out.println("The division of " + num1 + " and " + num2 + " is " + result4);
                    }
                    break;

                default:
                    System.out.println("please enter vallid operation number");
                    break;
            }
            sc.nextLine();
            System.out.println("Do you want to continue - Y/N");
            String ch = sc.nextLine();
            if (ch.equalsIgnoreCase("y"))
                continue;
            else if (ch.equalsIgnoreCase("n"))
                break;
            sc.close();
        }

    }

}

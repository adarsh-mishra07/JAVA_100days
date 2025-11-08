import java.util.Scanner;
// Array Creation ,Decleration , user input
/*
 * import java.util.Scanner;
 * 
 * public class Array {
 * public static void main(String[] args) {
 * int[] a = new int[5];
 * System.out.println("Enter the element in Array");
 * Scanner sc = new Scanner(System.in);
 * for (int i = 0; i < a.length; i++) {
 * a[i] = sc.nextInt();
 * }
 * 
 * for (int num : a) {
 * System.out.println(num);
 * }
 * }
 * }
 * 
 

// Sum of Array

class Array {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[5];
        System.out.println("Enter the numbr");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum =" + sum);
    }
}



// Minimum and Maximum 

class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("MAXIMUM value=" + max);
        System.out.println("MINIMUM value=" + min);
    }
}

*/

// Reverse of Array 

class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter the nmbr");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse of array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}

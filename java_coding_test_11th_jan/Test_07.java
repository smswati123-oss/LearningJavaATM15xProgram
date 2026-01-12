package java_coding_test_11th_jan;

import java.util.Scanner;

public class Test_07 {
    //Write a Java program to perform addition, subtraction, multiplication
    // , or division based on user choice using a switch statement.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("choose operation");
        int operation = sc.nextInt();
        int result = 0;
        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
             case 4:
                result = a / b;
                break;
            default:
                    System.out.println("Invalid input");
        }
        System.out.println("result is " + result);
    }
}

package java_coding_test_11th_jan;

import java.util.Scanner;

public class Test_06 {
    //Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = input.nextInt();
        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
                System.out.println("Invalid input");
                break;
        }


    }
}

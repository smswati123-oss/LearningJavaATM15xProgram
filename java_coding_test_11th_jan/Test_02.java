package java_coding_test_11th_jan;

import java.util.Scanner;

public class Test_02 {
    //Write a Java program to check whether a given number is even or odd using arithmetic operators.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if (i%2==0) {
            System.out.println("Number is even");
        } else  {
            System.out.println("Number is odd");
        }



    }
}

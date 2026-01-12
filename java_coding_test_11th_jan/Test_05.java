package java_coding_test_11th_jan;

import java.util.Scanner;

public class Test_05 {
    //Write a Java program to check whether a given number is positive
    // , negative, or zero using the ternary operator.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println(a>0?"positive": (a<0?"negative" :"zero"));
    }
}

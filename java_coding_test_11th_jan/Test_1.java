package java_coding_test_11th_jan;

import java.util.Scanner;

public class Test_1 {
    //Write a Java program that takes two integer numbers and prints their sum, difference,
    // multiplication, division, and remainder.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=m+n;
        System.out.println("sum = " +sum);
        int diff=m-n;
        System.out.println("diff = " +diff);
        int mul=m*n;
        System.out.println("mul = " +mul);
        int div=n/m;
        System.out.println("div = " +div);
        int mod=n%m;
        System.out.println("mod = " +mod);
    }
}


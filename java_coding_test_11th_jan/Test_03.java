package java_coding_test_11th_jan;

import java.util.Scanner;

public class Test_03 {
    //Write a Java program to convert a double value into an int using explicit type casting
    // and print both values.
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int value;
        double value2=sc.nextDouble();
        value = (int) value2;
        System.out.println("Explicit int value is "+value);
    }
}



package Java_coding_test_18_jan;

import java.util.Scanner;

public class Test_05 {
    //Write a Java program to reverse a given string using a loop.
    public static void main(String[] args) {
String input = "Swati";
        String reverse = "";
        for (int i = input.length()-1; i >=0; i--) {
    reverse = reverse+input.charAt(i);
}
        System.out.println(reverse);
    }
}
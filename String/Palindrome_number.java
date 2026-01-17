package String;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput=scanner.nextLine();
        String reversed_string = " ";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed_string = reversed_string + userInput.charAt(i);
        }
        if (reversed_string.equalsIgnoreCase(userInput)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome!");
        }
    }
}

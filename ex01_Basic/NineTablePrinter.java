package ex01_Basic;

public class NineTablePrinter {
    public static void main(String[] args) {
        int tableNumber = 9;

        System.out.println("--- Table of 9 ---");

        // Use a for loop to iterate from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = tableNumber * i;

            // Using System.out.printf() for formatted output
            // %d is a format specifier for integers
            // %n adds a platform-specific newline character
            System.out.printf("%d * %d = %d%n", tableNumber, i, result);
        }
    }

}

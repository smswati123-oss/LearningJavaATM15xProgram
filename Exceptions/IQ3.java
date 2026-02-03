package Exceptions;

public class IQ3 {
    public static void main(String[] args) {
        final double PI = 3.14;
        int a = 0;
        try {
            int X = 10/a;
        } catch (Exception e) {
            System.out.println("Divide by zero");
        } finally {
            System.out.println("It will execute anyhow");
        }

    }
}

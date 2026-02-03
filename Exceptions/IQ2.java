package Exceptions;

public class IQ2 {
    public static void main(String[] args) {

        try {
            String inputuser = args[0];
            int a = Integer.parseInt(inputuser);
            int output = 100/a;
        } catch (ArrayIndexOutOfBoundsException| ArithmeticException|NumberFormatException e) {
            System.out.println(e.getMessage());
        }


    }
}

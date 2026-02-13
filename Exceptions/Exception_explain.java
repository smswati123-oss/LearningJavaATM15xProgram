package Exceptions;

public class Exception_explain {
    public static void main(String[] args) {
        System.out.println("Starting program");
        String inputuser = args[0];  //array indexoutofboundsexception
        Integer a = Integer.parseInt(inputuser);//numberformat Collection_Framwok.exception
        Integer output = 100/a;// Arithmatic Collection_Framwok.exception /by zero
        System.out.println(output);
        System.out.println("Ending program");


    }
}

package ex02_Basics;

public class Lab28_Typecasting_Narrowing {
    public static void main(String[] args) {
        int value = 300;
       // byte b = value; // implicit narrowing
        byte b2 =(byte) value; //explicit narrowing
        System.out.println(b2);


    }
}

package java_coding_test_11th_jan;

public class Test_10 {
    //Write a Java program to print all even numbers between 1 and 50 using a do-while loop
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Even number between 2 to 50");
        do {
            System.out.println(number);
            number=number+2;
        } while (number <= 50);
    }
}

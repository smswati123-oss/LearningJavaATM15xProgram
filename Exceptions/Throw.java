package Exceptions;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age!");
        int age = sc.nextInt();
        try {
            validateAge(age);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
        static void validateAge (int age) throws Exception {
            if (age<18){
                throw new Exception("you are minor");
        }
    }

}

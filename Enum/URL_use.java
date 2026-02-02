package Enum;

public class URL_use {
    public static void main(String[] args) {
        System.out.println(ENV.QA.getBaseURL());
        //Here i can write A code
        if (ENV.QA.getBaseURL().equalsIgnoreCase("https://api.github.com")) {
            System.out.println("Start on QA !!");
        }
    }
}

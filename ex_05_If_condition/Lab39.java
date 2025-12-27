package ex_05_If_condition;

public class Lab39 {
    public static void main(String[] args) {
        System.out.println("Enter the age via CLI option\n");
        int age = Integer.parseInt (args[0]);
        if (age < 18) {
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }


    }
}

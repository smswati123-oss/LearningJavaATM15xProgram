package Four_loop;

import java.util.Scanner;

public class For_loop_continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            if(i%2==5){
                continue;
            }
            System.out.println(i);
        }
    }
}

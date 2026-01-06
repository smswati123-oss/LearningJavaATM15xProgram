package Four_loop;

public class Odd_Even {
    public static void main(String[] args) {
        //to find even number from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even=>" +i);
                System.out.println("Odd=>" +i);
            }
        }
    }
}

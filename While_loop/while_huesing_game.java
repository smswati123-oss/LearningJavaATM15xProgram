package While_loop;

import java.util.Random;

public class while_huesing_game {
    public static void main(String[] args) {
        //guess a number from 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(10);
        System.out.println(numberToGuess);
    }
}

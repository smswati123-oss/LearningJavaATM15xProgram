package While_loop;

public class Guessing_game {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
        System.out.println("enter a number");
    int guess;
    int attempts = 0;
        while (true) {
        guess = scanner.nextInt();
        attempts++;

        if ( guess < numberToGuess){
            System.out.println("To low try again");
        }else if ( guess > numerToGuess){
            System.out.println("To high try again");
        }else {
            System.out.println("correct you have taken-> " + attempts );
            break;
        }
    }
}
}



package arrays;

public class Right_Aligne_Triangle {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i - 1; space++) {   //3-0-1
                System.out.print(" ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
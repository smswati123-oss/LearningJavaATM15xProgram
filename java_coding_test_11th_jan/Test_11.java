package java_coding_test_11th_jan;

public class Test_11 {
    //Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5
    // using the break statement..
    public static void main(String[] args) {
        for (int j = 0; j <= 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }
        System.out.println("Loop terminate");
    }
}

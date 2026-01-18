package Java_coding_test_18_jan;

public class Test_01 {
    //Write a Java program to count the total number of characters in a given string (excluding spaces).
    public static void main(String[] args) {
        String originalString = "Hello world";
        int count = 0;

        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("Total characters (excluding spaces): " + count);
    }
}

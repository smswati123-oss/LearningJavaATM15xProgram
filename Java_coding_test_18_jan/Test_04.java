package Java_coding_test_18_jan;

public class Test_04 {
    //Write a Java program to compare two strings and check whether they are equal or not.
    public static void main(String[] args) {
        String s1 =  new String("abc");
        String s2 = new String("abc");

        String s3 ="ABC";
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
    }
}

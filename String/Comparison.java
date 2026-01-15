package String;

public class Comparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("Hello");
       //==comparison-string check ref in string
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);

        //equals (content)->value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
    }
}

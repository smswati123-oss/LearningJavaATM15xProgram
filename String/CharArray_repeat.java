package String;

public class CharArray_repeat {
    public static void main(String[] args) {
        String s = "Java".substring(2);
        System.out.println(s);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);//'j' , 'a','v',

        boolean b = " ".isBlank();
        System.out.println(b);
        String s2 = "ab".repeat(3);
        System.out.println(s2);

      //  boolean b11 = "Java".equalsIgnoreCase();
     //   System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}

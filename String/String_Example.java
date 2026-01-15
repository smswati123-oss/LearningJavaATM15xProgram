package String;

public class String_Example {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(0);
        System.out.println(c);

        int result = "ABC".compareTo("abc");
        int result1 = "abc".compareTo("abc");
        System.out.println(result);
        System.out.println();

        int idx = "Java".indexOf('a'); //1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf('a');
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);
    }
}

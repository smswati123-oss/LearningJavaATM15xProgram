package String;

public class Empty_join_replace {
    public static void main(String[] args) {
        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("*", "Java", "python");
        System.out.println(s11);

        String s12 = "Java".replace('a', '0');
        System.out.println(s12);
    }
}

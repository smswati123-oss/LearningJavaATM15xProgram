package String;

public class StringBuffer_replace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append("Programming");
        System.out.println(sb);

        sb.replace(0,4,"c++");
        System.out.println(sb);
    }
}

package String;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("Hello");
        sb.append("World");
        sb.reverse();
        System.out.println(sb);
    }
}

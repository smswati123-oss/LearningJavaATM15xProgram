package ex02_Basics;

public class Program {
    public static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

        int c = 3;

        int b = c++ * ++c;

        System.out.println(b);

        int d = 5;

        System.out.println(d++ + d--);
    }
}

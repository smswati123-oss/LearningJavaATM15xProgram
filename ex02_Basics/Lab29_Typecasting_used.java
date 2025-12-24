package ex02_Basics;

public class Lab29_Typecasting_used {
    public static void main(String[] args) {
        int course = 100;
        float NSRTGST =18.45f;
        int total = course+ (int) NSRTGST; //narrowing explicit
        System.out.println(total);

        float total2 = course+ NSRTGST; //widening implicit
        float total3 = (float) course+ NSRTGST; //widening explicit
        System.out.println(total2);

        //when use smaler+bigger use bigger one in type casting

    }
}

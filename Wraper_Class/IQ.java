package Wraper_Class;

public class IQ {
    public static void main(String[] args) {
        Integer  a = 127;
        Integer b = 127;
        System.out.println(a == b); //true(cached)

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false (not cached)
        System.out.println(c.equals(d));

        //Integer num = null;
       // int value = num; //Null point exception
      //  System.out.println(value);

        Integer aaa =10;
        System.out.println(aaa.toString());


    }
}

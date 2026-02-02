package Wraper_Class;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        System.out.println(b); //b has not attribute method
        //Boxing-Primitive data type is converted wrapper -Automatic JVM will do
        Integer aa = 43;
        int a1 = aa; //unboxing
        System.out.println(a1); // aa lost attribute and behaviour


    }
}

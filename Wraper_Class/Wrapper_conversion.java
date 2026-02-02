package Wraper_Class;

public class Wrapper_conversion {
    public static void main(String[] args) {
        String num = "10";
        int aa = 10;
        //String->wrapper conversion
        Integer a = Integer.parseInt(num);
        System.out.println(a);
        //Double.parseDouble()
        //string to primitive
        int ap = Integer.parseInt(num);
        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);
    }
}

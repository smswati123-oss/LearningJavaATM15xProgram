package Enum;

public class Enum_practice {
    public static void main(String[] args) {
        Day today = Day.Monday;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());//zero index position
    }
}

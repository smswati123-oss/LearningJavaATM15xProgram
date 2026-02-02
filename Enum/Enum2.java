package Enum;

public class Enum2 {
    public static void main(String[] args) {
        Day today = Day.Monday;
        switch (today) {
            case Monday-> System.out.println("Monday");
            case Tuesday-> System.out.println("Tuesday");
        }
        System.out.println(API_URL.valueOf("google"));

    }
}

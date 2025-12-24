package ex02_Basics;

public class Lab19_Interview {
    public static void main(String[] args) {
        int balaji_salary= 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);
    }
}
//divide and conqur
//A-balaji salary>10-12>10 true
//B-balaji salary<5-12<5-false
//A||B-true(true||false)-true
//!(true)-false
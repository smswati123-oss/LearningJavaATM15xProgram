package ex_03_Ternary_Operator;

public class Lab32_Turnary_Operator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int max = x>y ?x:y;
        int min = x>y ?y:x;
        System.out.println(max);
        System.out.println(min);
    }
}

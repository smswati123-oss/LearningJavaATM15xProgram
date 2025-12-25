package ex_03_Ternary_Operator;

import org.w3c.dom.ls.LSOutput;

public class Lab34_Turnar_Operator {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int max12 = (n1 > n2) ? n1 : n2;
        int max = (max12 > n3) ? max12 : n3;
        System.out.println(max);

    }



}

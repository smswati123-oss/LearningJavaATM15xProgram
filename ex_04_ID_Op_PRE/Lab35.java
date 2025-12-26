package ex_04_ID_Op_PRE;

public class Lab35 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        //++a-a+a+1
        //Exp and result table
        //line no | a |result b
        //8|10|NA
        //9|11|11
        //10|11|-a
        //11|11|11-print

    }
}

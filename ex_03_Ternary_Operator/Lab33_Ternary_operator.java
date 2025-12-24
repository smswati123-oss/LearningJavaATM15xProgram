package ex_03_Ternary_Operator;

public class Lab33_Ternary_operator {
    public static void main(String[] args) {
        String ageinputString = args[0];
        System.out.println(ageinputString instanceof String);
        int ageuserinput =Integer.parseInt(ageinputString);

        String Result = (ageuserinput<18) ? "minor":(ageuserinput<=60) ? "adult":"srcitizen";
        System.out.println(Result);

    }
}

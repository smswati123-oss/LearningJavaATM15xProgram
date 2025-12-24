package ex02_Basics;

public class Lab15_Interview_concat_plus {
    public static void main(String[] args) {
        String firstname = "Pramod";
        String lastname = "Dutta";

        int a = 10;
        int b = 20;
        System.out.println(firstname+lastname+a+b);

        //JVM perform concatenation only
        System.out.println(a+b+firstname+lastname);

        System.out.println(firstname+lastname+(a+b));

        //BODMAS FORMULA-BRAKET OF DIV,MUL,ADD,SUB
    }
}

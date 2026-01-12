package java_coding_test_11th_jan;

public class Test_13 {
    //Write a Java program to print numbers from 1 to 10,
    // but skip printing the number 5 using the continue statement.
    public static void main(String[] args) {
for (int a=0;a<10;a++){
    if (a==5){
        continue;
    }
System.out.println(a);
}
    }
}

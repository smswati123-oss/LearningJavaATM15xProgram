package arrays;

public class array_01 {
    public static void main(String[] args) {
        //      int a = 10;
        //    int marks [] = {91,98,77,100};
        //      int[] marks2 = {91,98,77,100};

        //     boolean[] is married people = {true,true,false};// allowed
        //     String[] names = {"pramod","lucky",314}; //not llowed srring name+intiger
        int[] marks = {1, 2, 3, 4};
        //2nd way to create array
        int[] marks2 = new int[3];
        int mark3[] = new int[5]; // fixed siz
        String[] names = new String[3];
        names[0] = "pramod";
        names[1] = "amit";
        names[2] = "yash";
        System.out.println(marks[0]);
        System.out.println(marks2[0]);
    }
}

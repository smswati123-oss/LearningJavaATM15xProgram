package arrays;


import java.util.Arrays;

public class Interview_2nd_highnumber_array {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1,100};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}

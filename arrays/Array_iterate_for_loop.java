package arrays;

import java.util.Scanner;

public class Array_iterate_for_loop {
    public static void main(String args[]){
        int[][] matrix = {
                {1 ,2 ,3},
                {4 ,5 ,6},
                {7 ,8 ,9},
        };
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println("");
        }
    }
}

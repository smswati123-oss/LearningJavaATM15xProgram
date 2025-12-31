package ex_05_If_condition;

public class Grade_Calculator {
    //Write a program that calculates and displays the letter grade for a given numerical score
    //e.g., A, B, C, D, or F) based on the following grading scale:
    public static void main(String[] args) {
        int Score = 100;
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        if (Score >= 90 && Score == 100) {
            System.out.println("A");

        } else if (Score >= 80 && Score == 89) {
            System.out.println("B");
        } else if (Score >= 70 && Score == 79) {
            System.out.println("C");
        } else if (Score >= 60 && Score == 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
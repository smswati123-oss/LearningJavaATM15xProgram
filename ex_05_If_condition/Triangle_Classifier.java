package ex_05_If_condition;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//Write a program that classifies a triangle based on its side length
        //Given three input values representing the lengths of the sides
        //determine if the triangle is equilateral (all sides are equal)
        //isosceles (exactly two sides are equal), or scalene (no sides are equal)
        int a =  scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a == b && a ==c ){
            System.out.println("equilateraltriangle");
        }else if (a==c && b==c){
            System.out.println("isosceles triangle");
        } else {
            System.out.println("scalenetriangle");
        }
    }

    }


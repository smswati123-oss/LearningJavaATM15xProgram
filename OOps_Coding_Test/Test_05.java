package OOps_Coding_Test;

import java.util.Scanner;

public class Test_05 {
   // Create a class "Animal" and subclasses "Dog" and "Cat".
   // Override a method to make each animal make a sound.
    abstract class Animal{
        public abstract void makeSound();
   }
   class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("I'm a dog");
        }
   }
   class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("I'm a cat");
        }
   }
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter animal name: ");
       String name = input.nextLine();
       if(name.equals("Dog")){
           System.out.println("I'm a dog");
       }else if(name.equals("Cat")){
           System.out.println("I'm a cat");
       }else {
           System.out.println("Invalid animal name");

       }
   }
}

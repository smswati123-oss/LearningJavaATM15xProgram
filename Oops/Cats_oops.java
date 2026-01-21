package Oops;

public class Cats_oops {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat ("mufasa");
        System.out.println(c2.name);
    }
}

class Cat{
    String name;
    Cat(){
        System.out.println("DC");
        System.out.println(this.name);
    }
    Cat(String nameGiven){
        this.name=nameGiven;
    }
    void running(){
        int local_var = 10;
        System.out.println("who is running->" + this.name);
    }


}


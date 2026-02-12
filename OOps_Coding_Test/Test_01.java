package OOps_Coding_Test;

public class Test_01 {
    //Create a Person class with constructor parameters for name and age
    // then create two instances and call a display method for each.

    private String name;
    private int age;
    public Test_01(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("name is " + name+ " and age is " + age);
    }
    public static void main(String[] args){

        Test_01 person1 = new Test_01("Swati", 20);
Test_01 person2 = new Test_01("David", 30);


        }
    }


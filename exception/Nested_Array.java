package exception;

import java.util.ArrayList;
import java.util.List;

public class Nested_Array {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("apple");
        fruits1.add("orange");
        System.out.println(fruits1);

        List<String> fruits2 = new ArrayList();
        fruits2.add("banana");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List all_fruits = new ArrayList();
        all_fruits.addAll(fruits1);
        all_fruits.addAll(fruits2);
        System.out.println(all_fruits);
    }
}

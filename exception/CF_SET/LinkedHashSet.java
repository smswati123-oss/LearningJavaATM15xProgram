package exception.CF_SET;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSet {
    public static void main(String[] args) {
        //Linkedlist mechanism to store element
        //order will maintain ,no duplicate
        Set<String> hs = new HashSet();
        Set lhs = new java.util.LinkedHashSet();
        lhs.add("Dpple");
        lhs.add(null);
        lhs.add("Orange");
        System.out.println(lhs);
        System.out.println(lhs.contains("Orange"));
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());

        Set ts = new TreeSet();
        //Black and red tree mechanism to store element
        //Natural sorting order maintained
        ts.add("Orange");
        ts.add("Apple");
        System.out.println(ts);

    }
}
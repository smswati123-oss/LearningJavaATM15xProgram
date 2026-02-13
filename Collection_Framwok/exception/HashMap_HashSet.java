package Collection_Framwok.exception;

import java.util.*;
import java.util.LinkedHashMap;

public class HashMap_HashSet {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("Name","David");
        student1.put("Age",18);
        student1.put("Address","BLR");
        System.out.println(student1);
        System.out.println(student1.getOrDefault("Role_no",null));
        Map<String,Object> student2 = new LinkedHashMap<>();
        student2.put("name","Swati");
        student2.put("age",18);
        student2.put("address","BLR");
        System.out.println(student2);
        Set book_read_items = new HashSet();
        book_read_items.add("Banana");
        book_read_items.add("Apple");

    }
}

package Collection_Framwok.exception;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CF_MAP {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();
        Map<String,Integer> marks = new HashMap();
        marks.put("Rahul",10);
        marks.put("Preeti",20);
        System.out.println(marks);
        //Accessing
        System.out.println(marks.get("Rahul"));
        System.out.println(marks.get("Preeti"));
        System.out.println(marks.getOrDefault("Rahul",10));
        marks.put("Rahul",10);
        System.out.println(marks.get("Rahul"));
        System.out.println(marks.containsKey("Rahul"));
        System.out.println(marks.containsValue("Preeti"));
        //size
        System.out.println(marks.size());
        marks.remove("Rahul");
        System.out.println(marks);
    }

}

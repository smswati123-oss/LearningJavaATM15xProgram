package Collection_Framwok.exception;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String,String> countries = new java.util.LinkedHashMap<>();
        countries.put("USA","United States");
        countries.put("JP","Japan");
        countries.put("IN","India");
        System.out.println(countries);
    }
}

package Collection_Framwok.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        Map<String,Integer> prices = new TreeMap<String,Integer>();
        prices.put("Banana",100);
        prices.put("Apple",50);
        prices.put("Orange",50);
        System.out.println(prices);
    }
}

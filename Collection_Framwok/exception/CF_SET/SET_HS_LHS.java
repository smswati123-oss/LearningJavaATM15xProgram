package Collection_Framwok.exception.CF_SET;

import java.util.*;

public class SET_HS_LHS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        hs.add("apple");
        hs.add("orange");
        hs.add("waterMelon");
        hs.add("watermelon");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
    }
}

package Collection_Framwok.exception.CF_SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HS {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("set elements:"+set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

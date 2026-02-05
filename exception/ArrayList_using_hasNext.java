package exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_using_hasNext {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bred");
        list.add("cat");
        list.add("dog");
        list.add(123);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

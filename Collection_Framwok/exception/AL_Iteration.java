package Collection_Framwok.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL_Iteration {
    public static void main(String[] args) {
        List <String> mylist = new ArrayList();
        List <String> mylist2 = new ArrayList();

        mylist.add("A");
        mylist.add("B");
        System.out.println("  To print Arraylist-1 ");
         for (String name : mylist) {
             System.out.println(name);
             //other way to print
             Iterator iterator = mylist.iterator();
             while (iterator.hasNext()) {
                 System.out.println(iterator.next());
             }
         }
    }
}

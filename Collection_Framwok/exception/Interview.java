package Collection_Framwok.exception;

import java.util.ArrayList;
import java.util.Collections;

public class Interview {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        for(Integer o:al){
            System.out.println(o);
        }
    }
}

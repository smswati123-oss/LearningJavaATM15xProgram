package Collection_Framwok.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_marks {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(50);
        marks.add(20);
        System.out.println(marks);
        Collections.sort(marks);
    }
}

package exception;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("a");
        list.add("b");
        list.addFirst("c");
        list.addLast("d");
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
    }
}

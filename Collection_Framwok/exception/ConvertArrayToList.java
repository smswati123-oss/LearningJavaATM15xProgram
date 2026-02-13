package Collection_Framwok.exception;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"java","python"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}

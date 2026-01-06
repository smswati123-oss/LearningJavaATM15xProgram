package ex_06_switch;

public class JDK_13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch(itemcode) {
            case 001, 002 ,005:
                System.out.println("All electric item");
                break;
            case 004, 006, 007:
                System.out.println("this is mech");
                break;
            default:
                System.out.println("None");

        }

    }
}

package ex_06_switch;

public class Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ascii");
                break;
                default:
                    System.out.println("Not match");
        }
    }
}

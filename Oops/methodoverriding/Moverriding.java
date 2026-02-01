package Oops.methodoverriding;

public class Moverriding {
    public static void main(String[] args) {
        pramod p1 = new pramod();
        p1.home();
        father f1 = new father();
        f1.home();

    }
}

class father {
    public void home(){
        System.out.println("father home");
    }
}
class pramod{
    public void home(){
        System.out.println("pramod home");
    }
}
package Four_loop;

public class Four_loop_break {
    public static void main(String[] args) {
        for(int j=0;j<50;j++){
            if (j%2==5){
                break;
            }
            System.out.println(j);
        }
        System.out.println("end");
    }
}

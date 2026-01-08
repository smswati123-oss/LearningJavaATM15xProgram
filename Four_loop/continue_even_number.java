package Four_loop;

public class continue_even_number {
    public static void main(String[] args) {
        for(int j=0;j<=50;j++){
            if(j%2==0){
                continue;
            }
            System.out.println(j);
        }
    }
}

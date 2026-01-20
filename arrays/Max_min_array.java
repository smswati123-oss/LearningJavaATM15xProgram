package arrays;

public class Max_min_array {
    public static void main(String[] args){
        int[] array= {15,20,25,30};
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}

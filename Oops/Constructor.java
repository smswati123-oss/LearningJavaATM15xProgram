package Oops;

public class Constructor {
    public static void main(String[] args) {
        MySQL a = new MySQL();
        ReadExcelFile e = new ReadExcelFile();


    }
}
class MySQL {
     MySQL(){
         System.out.println("MySQL connected!");
     }
}
class ReadExcelFile {
    ReadExcelFile(){
        System.out.println("ReadExcelFile connected!");
    }
}

package OOps_Coding_Test;

import java.util.Scanner;


public class Test_02 {
    private String name;
    private String section;
    private int rollNo;
  void details(){
    System.out.println(name);
    System.out.println(section);
    System.out.println(rollNo);
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.nextLine();
      System.out.println("Enter name");
      String section = sc.nextLine();
      System.out.println("Enter the roll no:");
      int rollNo = sc.nextInt();
      System.out.println("Enter the section:");
      String sectionName = sc.nextLine();
      sc.close();
  }
}

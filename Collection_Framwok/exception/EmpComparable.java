package Collection_Framwok.exception;

import java.util.*;

public class EmpComparable {
    public static void main (String [] args) {
        EmployeeT e1 = new EmployeeT(5,"Swati");
        EmployeeT e2 = new EmployeeT(6,"Rahul");

                List<EmployeeT>employeeList = new ArrayList<>();
                employeeList.add(e1);
                employeeList.add(e2);
        System.out.println(employeeList);

        //sort them based on d
        Collections.sort(employeeList);
        System.out.println("Given list is sorted based on employee name");
        System.out.println(employeeList);
    }
}
class EmployeeT implements Comparable<EmployeeT> {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String printDetails(){
        return id + " " + name ;
}
    public EmployeeT (int id , String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeT{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
   public int compareTo(EmployeeT o) {
        return this.name.compareTo(o.name);
    }


}


package Collection_Framwok.exception;

import java.util.*;

public
class List_Comparator {
    public static void main(String[] args) {
        List<Employee> markslist = new ArrayList<>();
        markslist.add(new Employee(3,"Swati",100));
        markslist.add(new Employee(2,"Alice",50));
        System.out.println(markslist);

        Comparator<Employee> idComparator = (e1,e2)->e1.id-e2.id;
        Collections.sort(markslist,idComparator);
        System.out.println(markslist);
    }

}

class Employee{
    Integer id;
    public Employee(Integer id,String name,Integer salary){
        this.id=id;
        this.salary = salary;

    }
    String name;
    Integer salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

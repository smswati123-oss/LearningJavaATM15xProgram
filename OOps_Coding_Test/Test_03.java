//package OOps_Coding_Test;
//
////Create private instance variables and provide public getter/setter
//// methods to access and modify them safely.
//public class Test_03 {
//    public static void main(String[] args) {
//
//        class Employee {
//            // Private instance variables
//            private int id;
//            private String name;
//            private double salary;
//
//            // Default constructor (optional, but good practice)
//            public Employee() {
//            }
//
//            // Constructor to initialize an employee with specific values
//            public Employee(int id, String name, double salary) {
//                this.id = id;
//                this.name = name;
//                this.salary = salary;
//            }
//
//            // Public getter method for 'id'
//            public int getId() {
//                return id;
//            }
//
//            // Public setter method for 'id'
//            public void setId(int id) {
//                this.id = id;
//            }
//
//            // Public getter method for 'name'
//            public String getName() {
//                return name;
//            }
//
//            // Public setter method for 'name'
//            public void setName(String name) {
//                this.name = name;
//            }
//
//            // Public getter method for 'salary'
//            public double getSalary() {
//                return salary;
//            }
//
//            // Public setter method for 'salary'
//            public void setSalary(double salary) {
//                this.salary = salary;
//            }
//
//            // Optional: Override toString() for easy printing/debugging
//            @Override
//            public String toString() {
//                return "Employee{" +
//                        "id=" + id +
//                        ", name='" + name + '\'' +
//                        ", salary=" + salary +
//                        '}';
//            }
//
//            public static void main(String[] args) {
//                Employee emp = new Employee(102, "Bob", 82000.0);
//
//                System.out.println("ID: " + emp.getId());
//                System.out.println("Name: " + emp.getName());
//                System.out.println("Salary: $" + emp.getSalary());
//                emp.setSalary(emp.getSalary());
//                System.out.println("Employee details:");
//            }
//        }
//    }
//}

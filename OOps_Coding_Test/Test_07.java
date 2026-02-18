package OOps_Coding_Test;

public class Test_07 {
    //Create an Employee base class and Manager, Developer subclasses
    // . Each should have different salary calculation methods.
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 60000, 10000);
        Developer developer = new Developer("Bob", 50, 160);

        // Calculate and display salaries
        System.out.println("Payroll Details:");
        System.out.println("----------------");
        System.out.println("Manager " + manager.getName() + " salary: $" + manager.calculateSalary() + "");
        System.out.println("Developer " + developer.getName() + " salary: $" + developer.calculateSalary() + "");
    }
}

class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    /**
     * Calculates the salary for the employee.
     * This method is intended to be overridden by subclasses.
     * @return The calculated salary.
     */
    public double calculateSalary() {
        return 0.0; // Default implementation or an abstract method
    }

    public String getName() {
        return name;
    }
}


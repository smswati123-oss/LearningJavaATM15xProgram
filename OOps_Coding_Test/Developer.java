package OOps_Coding_Test;

public class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Overrides the calculateSalary method to return the developer's total salary.
     * @return The developer's total salary (hourly rate * hours worked).
     */
    @Override
    public double calculateSalary() {
        // Assuming no overtime for simplicity based on the prompt's input
        return hourlyRate * hoursWorked;
    }
}

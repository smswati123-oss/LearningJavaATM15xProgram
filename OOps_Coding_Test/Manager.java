package OOps_Coding_Test;

public class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    /**
     * Overrides the calculateSalary method to return the manager's total salary.
     * @return The manager's total salary (base salary + bonus).
     */
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

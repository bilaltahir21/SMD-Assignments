import java.util.ArrayList;

public abstract class Employee {
    protected String name;
    protected int age;
    protected int salary;
    protected int workingHours;
    protected ArrayList<String> benefits = new ArrayList<String>();

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        benefits.add("Basic benefits");
    }

    abstract void displayBenefits();

    abstract int calculatePay();
}

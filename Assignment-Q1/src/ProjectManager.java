public class ProjectManager extends Employee {
    ProjectManager(String name, int age) {
        super(name, age);
        this.benefits.add("Manager Benefits");
        this.benefits.add("Developer Benefits");
    }

    @Override
    void displayBenefits() {
        System.out.println(this.name + ", you have Manager Benefits:");
        for (String i : this.benefits) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    @Override
    int calculatePay() {
        System.out.println("Project Manager Paid.!");
        return 0;
    }
}

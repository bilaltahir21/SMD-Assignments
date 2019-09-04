public class Intern extends Employee {
    Intern(String name, int age) {
        super(name, age);
    }

    @Override
    void displayBenefits() {
        System.out.println(this.name + ", you have Intern Benefits:");
        for (String i : this.benefits) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    @Override
    int calculatePay() {
        System.out.println("Intern Paid.!");
        return 0;
    }
}

public class SoftwareDeveloper extends Employee {
    SoftwareDeveloper(String name, int age) {
        super(name, age);
        this.benefits.add("Developer benefits");
    }

    @Override
    void displayBenefits() {
        System.out.println(this.name + ", you have Developer Benefits:");
        for (String i : this.benefits) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    @Override
    int calculatePay() {
        System.out.println("Developer Paid.!");
        return 0;
    }
}

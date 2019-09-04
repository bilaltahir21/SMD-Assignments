public class TypeB extends Student {
    TypeB(String name, int age, int numberOfCourses, int feePerCourse) {
        super(name, age, numberOfCourses, feePerCourse);
    }

    @Override
    protected int calculateFee() {
        return (this.numberOfCourses*this.feePerCourse);
    }

    @Override
    public void displayFee() {
        System.out.println("Your fee is:" + this.calculateFee());
    }
}

public class TypeA extends Student {
    TypeA(String name, int age, int numberOfCourses, int feePerCourse) {
        super(name, age, numberOfCourses, feePerCourse);
    }

    @Override
    protected int calculateFee() {
        return (this.numberOfCourses*this.feePerCourse)/2;
    }

    @Override
    public void displayFee() {
        System.out.println("Your fee after scholarship is:" + this.calculateFee());
    }


}

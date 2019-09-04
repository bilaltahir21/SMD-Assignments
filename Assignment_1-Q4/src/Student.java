public abstract class Student {
    String name;
    int age;
    int numberOfCourses;
    int feePerCourse;

    Student(String name, int age, int numberOfCourses, int feePerCourse){
        this.name=name;
        this.age=age;
        this.numberOfCourses=numberOfCourses;
        this.feePerCourse=feePerCourse;
    }

    protected abstract int calculateFee();
    protected abstract void displayFee();
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student one=new TypeA("Ali",12,2,3000);
        Student two=new TypeB("Bob",13,2,3000);

        ArrayList<Student> students=new ArrayList<Student>();
        students.add(one);
        students.add(two);

        for (Student i:students)
            i.displayFee();
    }
}

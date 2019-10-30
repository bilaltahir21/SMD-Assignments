import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee one = new Intern("Alpha", 16);
        Employee two = new SoftwareDeveloper("Bravo", 17);
        Employee three = new ProjectManager("Charlie", 18);

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(one);
        list.add(two);
        list.add(three);

        for (Employee i : list) {
            i.displayBenefits();
        }
    }
}

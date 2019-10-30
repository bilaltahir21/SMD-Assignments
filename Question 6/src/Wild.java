public class Wild extends Animal {
    Wild(String name, int age) {
        super(name, age);
    }

    @Override
    void eatFood() {
        System.out.println("Got a prey !");
    }
}

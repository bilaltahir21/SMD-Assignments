public abstract class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    void sleep(){
        System.out.println("Zzzzzzzzzzzzzz...");
    }
    void walk(){
        System.out.println("tuk tuk tuk..");
    }

    abstract void eatFood();
}

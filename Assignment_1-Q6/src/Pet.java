public class Pet extends Animal {
    private DoTricks trick;

    Pet(String name, int age) {
        super(name, age);
    }

    @Override
    void eatFood() {
        System.out.println("Plate finished !");
    }

    void playWithIt(){
        System.out.println("It was fun !");
    }

    void learnTricks(DoTricks trick){
        this.trick=trick;
    }

    void playDead(){
        trick.playDead();
    }

    void chaseBall(){
        trick.chaseBall();
    }
}

import java.util.ArrayList;

public class Main {
    public static <Animals> void main(String[] args) {
        Animal one=new Pet("Husky", 12);
        Animal two=new Wild("Xave", 12);

        ArrayList<Animal> Animals =new ArrayList<Animal>();
        Animals.add(one);
        Animals.add(two);

        for(Animal i:Animals)
            i.eatFood();


        Tricks t=new Tricks();
        Pet d=new Pet("Zuzu", 67);
        d.learnTricks(t);
        d.chaseBall();
    }
}

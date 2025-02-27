package exercise.bird;
import exercise.animal.Animal;

public class Bird extends Animal{

    public Bird(boolean mammal){
        super(mammal);
    };

    @Override
    public void verso() {   
        System.out.println("cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("mangia i semi");
    }
}

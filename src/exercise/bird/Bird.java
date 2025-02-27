package exercise.bird;
import exercise.animal.Animal;
import exercise.interfaces.Winged;

public class Bird extends Animal implements Winged{

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

    @Override
    public void fly() {
        System.out.println("sto volando!!");
    }
}

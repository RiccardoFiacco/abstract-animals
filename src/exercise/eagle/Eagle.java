package exercise.eagle;
import exercise.animal.Animal;
import exercise.interfaces.Winged;

public class Eagle extends Animal implements Winged{

    public Eagle(boolean mammal){
        super(mammal);
    };

    @Override
    public void verso() {   
        System.out.println("AAAAAAAAAAAAAA");
    }

    @Override
    public void mangia() {
        System.out.println("mangia carne");
    }

    @Override
    public void fly() {
        System.out.println("sto volando!!");
    }
}

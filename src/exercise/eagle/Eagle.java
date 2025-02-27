package exercise.eagle;
import exercise.animal.Animal;

public class Eagle extends Animal{

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
}

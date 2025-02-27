package exercise.dolphin;
import exercise.animal.Animal;

public class Dolphin extends Animal{

    public Dolphin(boolean mammal){
        super(mammal);
    };

    @Override
    public void verso() {   
        System.out.println(".....");
    }

    @Override
    public void mangia() {
        System.out.println("mangia i pesci");
    }
}

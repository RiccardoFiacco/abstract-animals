package exercise.dolfin;
import exercise.animal.Animal;

public class Dolfin extends Animal{

    public Dolfin(boolean mammal){
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

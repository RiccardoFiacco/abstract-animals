package exercise.dolphin;
import exercise.animal.Animal;
import exercise.interfaces.Aquatic;

public class Dolphin extends Animal implements Aquatic{

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

    @Override
    public void swim() {
        System.out.println("sto nuotando!!");
    }
}

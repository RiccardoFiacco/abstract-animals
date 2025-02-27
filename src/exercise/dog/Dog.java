package exercise.dog;
import exercise.animal.Animal;

public class Dog extends Animal {
   private int paw;
   private String race;

    public Dog(boolean mammal){
        super(mammal);
    };

    public Dog(boolean mammal, int paw, String race){
        super(mammal);
        this.paw = paw;
        this.race = race;
    }

    public int getPaw() {
        return paw;
    }
    public void setPaw(int paw) {
        this.paw = paw;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    };

    @Override
    public void verso() {   
        System.out.println("BAUUU");
    }

    @Override
    public void mangia() {
        System.out.println("mangia i croccantini");
    }
}

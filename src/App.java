import exercise.bird.Bird;
import exercise.dog.Dog;
import exercise.dolphin.Dolphin;
import exercise.eagle.Eagle;
import exercise.interfaces.Aquatic;
import exercise.interfaces.Winged;

public class App {

    public static void makeItFly(Winged a){
        a.fly();
    };

    public static void makeItSwimm(Aquatic a){
        a.swim();
    };

    public static void main(String[] args) throws Exception {
        Eagle e = new Eagle(false);
        Bird b = new Bird(false);
        Dog d = new Dog(true);
        Dolphin dd = new Dolphin(false);

        e.mangia();
        e.verso();
        b.mangia();
        b.verso();
        d.mangia();
        d.verso();
        dd.mangia();
        dd.verso();
        
        makeItFly(b);
        makeItSwimm(dd);
    }
}

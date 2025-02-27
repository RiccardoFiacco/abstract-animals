package exercise.animal;

public abstract class Animal {
    private boolean mammal;
    
    public Animal(boolean mammal){
        this.mammal = mammal;
    }

    public void dormi(){
        System.out.println("zZzZz...");
    };

    //(mostra a video il verso fatto dall'animale specifico)
    public abstract void verso();

    //(mostra a video quello che mangia : erba, carne, ...?
    public abstract void mangia();

    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }

}

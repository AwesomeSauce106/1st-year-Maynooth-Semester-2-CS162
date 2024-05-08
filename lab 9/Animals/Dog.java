public class Dog extends Animal{
    // C1
    private int numDogBiscuitsEaten;
    // B
    public Dog(){
        super();
        numDogBiscuitsEaten = 0;        // C2
    }
    public Dog(String s, String s1){
        super(s,s1);
        numDogBiscuitsEaten = 0;        // C2
    }

    // C3
    public int getBiscuitsEaten(){
        return numDogBiscuitsEaten;
    }

    // C4
    public void eatDogBiscuit(){
        numDogBiscuitsEaten++;
    }
}

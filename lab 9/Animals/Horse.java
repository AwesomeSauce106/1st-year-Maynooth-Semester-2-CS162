public class Horse extends Animal{
    // D1
    private int speed;

    // B
    public Horse(){
        super();
        speed = 35;     // D2
    }
    public Horse(String s, String s1, int i){
        super(s,s1);
        speed = i;      //D3
    }

    // D4
    public void setSpeed(int i){
        speed = i;
    }
    public int getSpeed(){
        return speed;
    }
}

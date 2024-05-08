public class Car extends Vehicle {  //Update required on this line
    // B2
    private boolean sportsModel; // check if the vehicle is a Sports Model or not
    
    //Write Constructors here
    // B3
    public Car(){
        super();
        sportsModel = false;
    }
    // B4
    public Car(int n, String s, boolean b){
        super(n,s);
        sportsModel = b;
    }
    
    // Instance methods of child
    public void setSportsModel(boolean sports) {
        sportsModel = sports;
    }
    
    public boolean isSportsModel() 
    {
        return sportsModel;
    }
}

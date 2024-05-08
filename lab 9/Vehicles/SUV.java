public class SUV extends Vehicle { //Update required on this line
    
    private String wheelDrive; // states whether SUV is 4, front, or rear wheel drive
    
    public SUV()
    {
        super();
        wheelDrive="front";
    }
    
    //Write General Constructor here
    public SUV(int n,String s,String s1){
        super(n,s);
        wheelDrive = s1;
    }
    //Write Getter and Setter methods here
    public void setDrive(String s){
        wheelDrive = s;
    }
    public String getDrive(){
        return wheelDrive;
    }
}

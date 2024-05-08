public class Square{
    private int length;
    public Square(){
        length = 1;
    }
    public Square(int i){
        length = i;
    }
    public void setter(int i){
        length = i;
    }
    public int getter(){
        return length;
    }
    public int getArea(){
        return length*length;
    }

    public String toString(){
        String details = "LENGTH: "+length;
        return details;
    }
}

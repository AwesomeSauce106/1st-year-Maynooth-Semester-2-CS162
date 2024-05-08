public class County{
    // i love my county, Wexford <3
    private String name;
    private double area;
    private int footballWins;

    public County(){
        name = "Wexford";
        area = 2352.65;
        footballWins = 5;
    }

    public County(String s, String d, String n){
        name = s;
        area = Double.parseDouble(d);
        footballWins = Integer.parseInt(n);
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setWins(int footballWins){
        this.footballWins = footballWins;
    }

    // getters
    public String getName(){
        return name;
    }
    public double getArea(){
        return area;
    }
    public int getWins(){
        return footballWins;
    }

    public String toString(){
        String details = "County Name: " + name + "\n";
        details += "County Area: " + area + "\n";
        details += "Football Wins: " + footballWins;
        return details;
    }
}

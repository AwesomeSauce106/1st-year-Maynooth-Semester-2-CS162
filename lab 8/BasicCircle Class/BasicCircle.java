import java.util.*;
//import java.lang.Math.*;
public class BasicCircle{
    private int radius;

    public BasicCircle(){
        radius = 1;
    }

    public BasicCircle(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int num){
        radius = num;
    }

    public double getCircumference(){
        return Math.round((2.00 * Math.PI * (double) radius)*100.0)/100.0;
    }
    public double getArea(){
        return Math.round((Math.pow(radius,2)*Math.PI)*100.0)/100.0;
    }
}

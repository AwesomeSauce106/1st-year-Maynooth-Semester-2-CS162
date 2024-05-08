import java.util.*;
public class TestBasicCircle{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BasicCircle circ = new BasicCircle(sc.nextInt());
        BasicCircle circ1 = new BasicCircle(sc.nextInt());
        BasicCircle circ2 = new BasicCircle(sc.nextInt());
        
        sc.close();

        // print radius
        System.out.println("Circle 1 has a radius of " + circ.getRadius());
        System.out.println("Circle 2 has a radius of " + circ1.getRadius());
        System.out.println("Circle 3 has a radius of " + circ2.getRadius());

        // print circumference
        System.out.println("Circle 1 has a circumference of " + circ.getCircumference());
        System.out.println("Circle 2 has a circumference of " + circ1.getCircumference());
        System.out.println("Circle 3 has a circumference of " + circ2.getCircumference());

        // print area
        System.out.println("Circle 1 has an area of " + circ.getArea());
        System.out.println("Circle 2 has an area of " + circ1.getArea());
        System.out.println("Circle 3 has an area of " + circ2.getArea());
        
        
    }
}

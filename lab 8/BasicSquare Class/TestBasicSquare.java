import java.util.*;

public class TestBasicSquare{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // setting objects
        BasicSquare bs = new BasicSquare();
        BasicSquare bs1 = new BasicSquare();
        BasicSquare bs2 = new BasicSquare();

        // setting custom values
        bs.setLen(sc.nextInt());
        bs1.setLen(sc.nextInt());
        bs2.setLen(sc.nextInt());
        sc.close();

        // print radius
        System.out.println("Square 1 has a side of length " + bs.getLen());
        System.out.println("Square 2 has a side of length " + bs1.getLen());
        System.out.println("Square 3 has a side of length " + bs2.getLen());

        // print circumference
        System.out.println("Square 1 has a perimeter of " + bs.getPerimeter());
        System.out.println("Square 2 has a perimeter of " + bs1.getPerimeter());
        System.out.println("Square 3 has a perimeter of " + bs2.getPerimeter());

        // print area
        System.out.println("Square 1 has an area of " + bs.getArea());
        System.out.println("Square 2 has an area of " + bs1.getArea());
        System.out.println("Square 3 has an area of " + bs2.getArea());
        
    }
}

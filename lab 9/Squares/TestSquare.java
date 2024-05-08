import java.util.*;
public class TestSquare{
    public static void main(String[] args){
        Square[] sqr = new Square[4];           // B1

        // B2
        for(int i = 0; i<4;i++){
            sqr[i] = new Square();
        }

        // B3
        sqr[0].setter(10);
        sqr[2].setter(10);

        // B4
        for(int i = 0; i < 4; i++){
            System.out.println("Square " + (i+1) + " has a side length of " + sqr[i].getter());
        }
        // B5
        System.out.println("Square 1 has an area of " + sqr[0].getArea());
        System.out.println("Square 2 has an area of " + sqr[1].getArea());
        // B6
        String st = sqr[2].toString();
        System.out.println(st);
    }
}

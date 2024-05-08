import java.util.*;
public class Tester{
    public static void main(String[] args){
        SUV suv1 = new SUV();       // D1
        SUV suv2 = new SUV(2,"Nissan","4");     // D2

        Car car1 = new Car(3,"Ford",true);         // D3

        // D4
        suv1.setBrand("BMW");
        suv1.setDrive("rear");
        suv1.setNoOfDoors(5);

        // D5
        suv1.printDetails();
        System.out.println((suv1.getDrive()));

        // D6
        car1.setNoOfDoors(5);
        car1.printDetails();
        System.out.println((car1.isSportsModel()));
    }
}

import java.util.*;
public class GeneralTester{
    public static void main(String[] args){
        Dog dog = new Dog();        // E1
        Tiger tiger = new Tiger("omnivore","purr");     // E2
        Horse horse = new Horse("herbivore","neigh",40);   // E3

        dog.printDetails();     // E4
        dog.setAnimalSound("woof");     // E5
        dog.eatDogBiscuit();    // E6

        // E7
        dog.printDetails();
        System.out.println(dog.getBiscuitsEaten());

        horse.printDetails();       // E8
        
        // E9
        horse.setSpeed(48);
        System.out.println(horse.getSpeed());

        tiger.setAnimalDiet("carnivore");     // E10
        tiger.printDetails();           // E11
    }
}

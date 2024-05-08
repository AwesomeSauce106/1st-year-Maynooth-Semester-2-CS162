import java.util.*;
public class TestDog{
    public static void main(String[] args){
        // 1
        Dog dog = new Dog("Lady","Poodle",2,false);
        Dog dog1 = new Dog("Rocky","Pitt Bull",4,true);
        Dog dog2 = new Dog();

        // 2
        dog2.setName("Spot");
        dog2.setBreed("Dalmatian");
        dog2.setAge(3);
        dog2.setIsDangerous(false);

        // 3
        System.out.println("Dog 3 is called " + dog2.getName());
        System.out.println("It is a " + dog2.getBreed());
        System.out.println("They are " + dog2.getAge() + " years old");
        System.out.println("Their Licence Number is " + dog2.getLicenceNo());
        if(dog2.getIsDangerous()){
            System.out.println("They are Dangerous");
        }else{
            System.out.println("They are NOT Dangerous");
        }

        // 4
        dog.bark();
        dog1.bark();
        dog2.bark();

        // 5        ternary part
        String s = dog.getIsDangerous() ? dog.getName()+" is Dangerous":dog.getName() + " is NOT Dangerous";
        String s1 = dog1.getIsDangerous() ? dog1.getName()+" is Dangerous":dog1.getName() + " is NOT Dangerous";
        String s2 = dog2.getIsDangerous() ? dog2.getName()+" is Dangerous":dog2.getName() + " is NOT Dangerous";
        System.out.println(s + "\n" + s1 + "\n" + s2);
    }
}

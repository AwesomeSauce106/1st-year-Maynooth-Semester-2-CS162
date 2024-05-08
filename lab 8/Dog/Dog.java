import java.util.*;
public class Dog{
    private String name;
    private String breed;
    private int age;
    private static int uid = 1000;
    private int licenceNo;
    private boolean isDangerous;

    // default constructor
    public Dog(){
        name = "leBonBon";
        breed = "lebonJames";
        age = 40;
        uid += 1;
        licenceNo = uid;
        isDangerous = true; // :o
    }
    // general constructor
    public Dog(String n, String b, int a, boolean tf){
        name = n;
        breed = b;
        age = a;
        uid += 1;
        licenceNo = uid;
        isDangerous = tf;
    }

    // setter
    public void setName(String n){
        name = n;
    }
    public void setBreed(String b){
        breed = b;
    }
    public void setAge(int a){
        age = a;
    }
    public void setIsDangerous(boolean b){
        isDangerous = b;
    }

    // getters
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public boolean getIsDangerous(){
        return isDangerous;
    }
    public int getLicenceNo(){
        return licenceNo;
    }

    // woof woof :)
    public void bark(){
        System.out.println(name +" has Licence number " + licenceNo +" and says Woof! Woof! Woof!");
    }

}

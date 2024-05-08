public class Animal{
    // A1
    private String animalDiet;
    private String animalSound;
    
    // A2
    public Animal(){
        animalDiet = "undefined";
        animalSound = "undefined";
    }

    // A3
    public Animal(String s, String s1){
        animalDiet = s;
        animalSound = s1;
    }

    // A4
    public void setAnimalDiet(String s){
        animalDiet = s;
    }
    public void setAnimalSound(String s){
        animalSound = s;
    }
    public String getAnimalDiet(){
        return animalDiet;
    }
    public String getAnimalSound(){
        return animalSound;
    }
    
    // A5
    public void printDetails(){
        System.out.println("Diet: " + animalDiet);
        System.out.println("Animal Sound: " + animalSound);
    }
}

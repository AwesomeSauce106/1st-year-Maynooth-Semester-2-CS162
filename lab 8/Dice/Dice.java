import java.util.*;
public class Dice{
    private int numOfSides;
    private int faceValue;

    public Dice(){
        Random rand = new Random();
        numOfSides = 6;
        faceValue = rand.nextInt(6);    // random number 0-5
        faceValue++;        // random number 1-6
    }
    public Dice(int i, int j){
        numOfSides = i;
        faceValue = j;
    }
    public void setNumOfSides(int n){
        numOfSides = n;
    }
    public int getFaceValue(){
        return faceValue;
    }
    public int getNumOfSides(){
        return numOfSides;
    }
    public int rollDice(){
        Random rand = new Random();
        faceValue = rand.nextInt(numOfSides) + 1;    // random number
        return faceValue;
    }
}

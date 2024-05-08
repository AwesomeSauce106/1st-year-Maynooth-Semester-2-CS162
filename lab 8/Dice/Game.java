import java.util.*;
public class Game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dice d = new Dice(6,6);
        Dice d1 = new Dice(20,20);

        System.out.println(d.getNumOfSides());
        System.out.println(d1.getFaceValue());
        d.setNumOfSides(15);
        System.out.println(d1.rollDice());

        sc.close();
    }
}

import java.util.*;
public class TestPerson{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // B1
        Person[] p = new Person[3];
        for(int i = 0;i < 3;i++){
            p[i] = new Person(sc.nextLine(), sc.nextLine());
        }
        sc.close();

        // B2
        System.out.println("Person 1 is called " + p[0].getName());
        System.out.println("They live in " + p[0].getAddress());
        System.out.println("Their PPS Number is " + p[0].getPPSNo());

        // B3
        p[1].setName("Paul Smyth");
        p[1].setAddress("Dublin");

        // B4
        for(int i = 0; i < 3; i++){
            p[i].showPerson();
        }

        // B5
        String s = p[2].toString();
        System.out.println(s);
    }
}

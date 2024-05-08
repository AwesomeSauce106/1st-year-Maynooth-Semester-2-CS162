import java.util.*;
// i love my county, Wexford <3
public class SortCounty{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        County[] county = new County[5];

        for(int i = 0; i < 5; i++){
            county[i] = new County(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        sc.close();
        
        bubbleSortCounty(county);       // sorts counties
        printCountyArray(county);       // prints counties

        
    }

    // bubble sort
    public static void bubbleSortCounty(County data[]){
        int n = data.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if( (data[j].getWins()) > (data[j + 1].getWins()) ){

                    County temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    // prints counties
    public static void printCountyArray(County data[]){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i].toString());
        }
    }
}

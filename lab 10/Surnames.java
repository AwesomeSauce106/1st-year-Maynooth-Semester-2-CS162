public class Surnames{

    public static void bubblesort(String[] names){
        int n = names.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(getSurname(names[j]).compareTo(getSurname(names[j + 1])) > 0){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
    }

    // gets surname
    public static String getSurname(String fullName){
        String[] parts = fullName.split(" ");
        return parts[parts.length - 1];
    }

    public static void main (String args[]){
        //DO NOT CHANGE THE ARRAY DECLARATION
        String names[]={"Annie Apple", "Dippy Duck", "Eddie Elephant", "Oscar Orange", "Uppy Umbrella","Vicky Violet"};
        bubblesort(names);

        for(String name : names){
            System.out.print(name + ", ");
        }
    } 
}

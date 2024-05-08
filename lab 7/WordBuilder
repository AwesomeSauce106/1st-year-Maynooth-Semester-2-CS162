public class WordBuilder{
    public static void main (String args[]){
        //DO NOT CHANGE THE ARRAY DECLARATIONS
        char letters[]={'l', 'o', 'e', 'h', 'l'};
        int positions[]={2, 4, 1, 0, 3};
        String word = buildWord(positions, letters);
        System.out.println(word);
    } 
    public static void bubbleSort(int[] a, char[] c){
        int n = a.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    // swap positions
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    // swap positions based on letters
                    char tempLetter = c[j];
                    c[j] = c[j+1];
                    c[j+1] = tempLetter;
                }
            }
        }
    }
    public static String buildWord(int[] ia, char[] ca){
        bubbleSort(ia,ca);
        StringBuilder wordBuilder = new StringBuilder();
        for(char c : ca){
            wordBuilder.append(c);
        }
        return wordBuilder.toString();
    }
}

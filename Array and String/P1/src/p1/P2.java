
package p1;


public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str ="aikemcb";
        
        int[] letters = new int[128];
        
        char[] s_array = str.toCharArray();
        for(char c: s_array){
            System.out.println(letters[c]);
            letters[c]++;
            System.out.println(letters[c]);
        }
        
    }
    
}

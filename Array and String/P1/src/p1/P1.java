package p1;

/**
 *
 * @author aung
 */
public class P1 {

    
    // Problem1: Product of All Other Numbers
    
    // Question: Write a function that takes a list of integers and returns a list of the products
    
    //Brute force algorithm 
    /* Double Loop 
    
    */
    
    public static int[] ProductOfAllNumber(int[] intArray){
        if(intArray.length < 2){
            throw new IllegalArgumentException("Need more than one integer");
        }
        
        int ProductSoFar = 1;
        int[] ProductOfAllNum = new int[intArray.length];
        
        for(int i = 0; i < intArray.length; i++){
            ProductOfAllNum[i] = ProductSoFar;
            ProductSoFar *= intArray[i];
        }
        
        ProductSoFar = 1;
        for(int i = intArray.length - 1; i >= 0; i--){
            ProductOfAllNum[i] *= ProductSoFar;
            ProductSoFar *= intArray[i];
        }
        
        return ProductOfAllNum;
    }
   
    public static void main(String[] args) {
        
        int[] intArray = {3,1,5,6};
        int[] result =  new int[intArray.length];
        
        result = ProductOfAllNumber(intArray);
        
        for(int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        
    }
    
    
}

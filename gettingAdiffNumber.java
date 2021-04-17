public class gettingAdiffNumber {

    public static int getDifferentNumber(int[] arr){
        int n = arr.length; 
        Set <Integer> set = new HashSet<>(); 
        
        for(int a : arr){
          set.add(a); 
        }
        for(int i = 0; i<n; i++){
          if (!set.contains(i)){
            return i; 
          }
        }
        return n; 
      }
      
    public void main (String [] args){
    
    
      }
    }
      
    
}

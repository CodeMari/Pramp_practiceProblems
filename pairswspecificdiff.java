import java.util.Map;

public class pairswspecificdiff {

    public int [][] findPairsWithGivenDifference(int[] arr, int k){
        Map<Integer, Integer> pairMap = new HashMap<>(); 
        for(int temp: arr){
            pairMap.put(temp-k, temp); 

        }
        int j= 0; 
        for(int i =0; i<arr.length; i++){
            if(pairMap.containsKey(arr[i])){
                j++; 
            }
        }
        int[][] resultsArray = new int[j][2]; 
        j=0; 
        for(int i=0; i<arr.length; i++){
            if(pairMap.containsKey(arr[i])){
                resultsArray[j][0]= pairMap.get(arr[i]); 
                resultsArray[j][1]= arr[i]; 
                j++;
                System.out.println(pairMap.get(arr[i])+","+ arr[i]);
            }
        }
        return resultArray; 
    }


}

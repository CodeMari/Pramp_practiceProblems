package FB_practice;
/*
Given a list of n integers arr[0..(n-1)], determine the number of different pairs of elements within it which sum to k.
If an integer appears in the list multiple times, each copy is considered to be different; that is, two pairs are considered 
different if one pair includes at least one array index which the other doesn't, even if they include the same value

*/
public class Pair_sums {
    int pairSums(int[] nums, int k){

        int count = 0; 
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int i=0; i<nums.length; i++)

            int diff = k-nums[i]; 
            if(map.containsKey(diff)){
                map.put(nums[i],i);
                count++; 

            }
            return count; 
    }

}

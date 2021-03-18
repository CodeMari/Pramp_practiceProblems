package FB_practice;
/*
You are given an array arr of N integers. For each index i, you are required to determine the number of contiguous subarrays that fulfills the following conditions:
-The value at index i must be the maximum element in the contiguous subarrays, and
-These contiguous subarrays must either start from or end on index i.
*/
public class contiguous_subarr {
    int [] countSubarrays(int [] arr){

        while(arr.length>0){
            int n = arr.length; 
            int[] ans = new int [arr.length]; 

            for(int i=0; i<n; i++){
                //setting =1 b/c [3] is considered as one subarray
                ans[i]=1; 
            }
            for(int i=0; i<n; i++){
                int current = arr[i]; 
                int left = i-1;
                int right = i+1; 

                while(left >=0 && current > left[i]){
                    ans[i]++; 
                    left--; 
                }
                while(right <n && current> arr[right]){
                    ans[i]++; 
                    right++;
                }
            }
            return ans; 

        }
    }
    return null; 
}

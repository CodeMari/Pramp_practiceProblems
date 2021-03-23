package FB_practice;

/* 
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such 
that it has enough space to hold
 additional elements from nums2


*/
public class mergekarray {
    public void merge(int[] n1, int m, int[] n2, int n){
        for(int i=0; i<n; i++){
            //put all elements in n1
            n1[i+m]=n2[i]; 
        }
        //sort n1 
        Arrays.sort(n1)

    }
}

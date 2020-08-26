package Pramp_practiceProblems;

/*
Given an array of integers arr where each element is at most k places away from its sorted position, code an efficient function sortKMessedArray that sorts arr. For instance, for an input array of size 10 and k = 2, an element belonging to index 6 in the sorted array will be located at either index 4, 5, 6, 7 or 8 in the input array.

Analyze the time and space complexities of your solution.
oseudocode below: 
*/

public class KmessedArray {
    
    functionKMessedArray(arr, k): 
    n = arr.length;

    h= new MinHeap() 

    h.buildHeap(arr[0,...k])

    for i from k+1 to n-1: 

    arr[i(k+1)]= h.extractMin()

    for i from 0 to k: 
        arr[n-k-1 +i]= h.extractMin()

        return arr; 
}

/*
Time Complexity: building a heap takes O(K) time for K+1 elements. Insertion into and extraction from the min-heap take O(log(K)), each. Across all three loops, we do at least one of these actions N times, so the total time complexity is O(N⋅log(K)). if K is substantially smaller than N, then we can consider log(K) constant and argue that the complexity is practically linear.

Space Complexity: we need to a maintain min-heap of size K+1 throughout the algorithm, so the auxiliary space complexity is O(K).
*/
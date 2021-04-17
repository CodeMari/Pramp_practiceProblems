/**A sorted array of distinct integers shiftArr is shifted to the left by an unknown
 *  offset and you don’t have a pre-shifted copy of it. For instance, the sequence 1, 2, 3, 4, 5 
 * becomes 3, 4, 5, 1, 2, after shifting it twice to the left.

Given shiftArr and an integer num, implement a function shiftedArrSearch that finds and 
returns the index of num in shiftArr. If num isn’t in shiftArr, return -1. 
Assume that the offset can be any value between 0 and arr.length - 1.

solution-- binary search O(logn) 
 * 
 * 
 * 
 */


public class shiftedArraySearch {
    static int shiftedArrSearch(int[] shiftArr, int num){
        int n = shiftArr.length; 
        int left  =0; 
        int right = n-1; 
        int midpoint; 
        int shiftPoint = 0; 

        while(left<right){
            midpoint = left+ (right-left)/2; 

            if(midpoint +1<n  && shiftArr[midpoint]> shiftArr[midpoint +1]){
                    shiftPoint = midpoint +1; 
                    break; 

            }
            if(midpoint-1>=0 && shiftArr[midpoint-1]> shiftArr[midpoint]){
                shiftPoint= midpoint; 
                break;
            }
            if(shiftArr[left]< shiftArr[midpoint]){
                left = midpoint+1; 
            }else{
                right = midpoint -1; 
            }
        }
            int a = binarySearch(shiftArr, num, 0, shiftPoint-1); 

            int b = binarySearch(shiftArr,  num, shiftPoint, n-1); 
            return a!=1? a: b;
        }

         public static int binarySearch(int[] shiftArr, int num, int left, int right){
             while(left<=right){
                 int midpoint = left +(right - left)/2; 

                 if(shiftArr[midpoint]==num)
                 return midpoint; 
             }else{
                 if(shiftArr[midpoint]>num){
                     right = midpoint-1; 
                 }else{
                     left = midpoint+1; 
                 }
             }
            }
            return -1; 

        }
public static void main(String[] args){
    int[] shiftArr = {9, 12, 17, 2, 4, 5};
    int result= shiftedArrSearch(shiftArr, 2);
    System.out.println(result); 
    }
}
}
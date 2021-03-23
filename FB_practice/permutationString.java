package FB_practice;
/*Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
time complexity: O(l1+26(l2-l1))
space: O(1)

*/

public class permutationString {
    public boolean checkInclusions(String s1, String s2){
        if(s1.length()> s2.length()){return false;
        }
        int [] s1_arr = new int[26];
        int [] s2_arr = new int[26];
        for(int i =0; i<s1.length(); i++){
            s1_arr[s1.charAt(i)-'a']++;
            s2_arr[s2.charAt(i)-'a']++; 
        }
        if(Arrays.equals(s1_arr, s2_arr)){return true;
        }
        for(int k = 0; k<s2.length()-s1.length(); k++){
            s2_arr[s2.charAt(k)-'a']--; 
            s2_arr[s2.charAt(k+s1.length())-'a']++; 
            if(Arrays.equals(s1_arr, s2_arr)){return true; 
            }
            return false;
            }
        }
    }

}

package FB_practice;
/*In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.

 

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.*/
public class verifying_Alien {
    public boolean isAlienDictionary(String [] words, String order){
        int [] index = new int[26];
        for(int i=0; i<order.length(); i++)
            index[order.charAt(i)-'a']=i;
            search: for(int i=0; i<words.length-1; i++){
                String word1 = words[i];
                String word2 = words[i+1];
        
                for(int k=0; k<Math.min(word1.length(), word2.length()); k++ ){
                    if(word1.charAt(k)!= word2.charAt(k)){
                        if(index[word1.charAt(k)-'a']> index[word2.charAt(k)-'a'])
                        return false; 
                        continue search; 
                    }
                }
            
            } 
            if(words1.length()> words2.length()){
                return false;
            }

    }
}

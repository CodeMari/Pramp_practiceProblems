import javax.lang.model.util.ElementScanner6;

public class sentencereverse {
   static char[] reverseWords(char[] arr){
       int n = arr.length; 
       String temp = ""; 
       Stack<String> st = new Stack<>();
       for(int i = 0; i<n; i++){
           if(arr[i]=='  ')
           {
               if(temp !="")
               st.push(temp); 
               temp =""; 
               st.push(" "); 
           }
           else temp = temp+String.valueOf(arr[i]); 

       }
       st.push(temp); 
       int j=0; 
       while(!st.empty())
       {
           temp = st.pop();
           for(int i =0; i<temp.length(), i++){
               arr[j]=temp.charAt(i); 
               j++; 
           }
       }
       return arr;
   } 
}

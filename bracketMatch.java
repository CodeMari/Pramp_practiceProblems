public class bracketMatch {
    static int bracketMatch(String text){
        int counter =0; 
        int ans =0; 

        for(int i =); i<text.length(); i++){
            char c = text.charAt(i); 
            if(c=='(')
            counter ++; 
            if(c ==')')
            counter--; 
            if(counter<0){
                counter++; 
                ans++; 

            }
        }
        return counter + ans;
    }
    
}

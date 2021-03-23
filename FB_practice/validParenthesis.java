package FB_practice;
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine
 if the input string is valid. */
public class validParenthesis {
    public boolean isValid(String s){
        Stack<Character> stack  = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{'); 

        for(int i =0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()==map.get(s.charAt(i))){
                    stack.pop();
                }else{
                    return false;
                }else{
                    stack.push(s.charAt(i));
                }
            }
            return (stack.isEmpty());
        }

    }    
}

package balancedParentheses;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParentheses {

	static Stack<Character> st = new Stack<Character>();
	
    static final private HashMap<Character, Character> braceToBrace;
	static{
		braceToBrace = new HashMap<Character, Character>();
		braceToBrace.put('(',')');
		braceToBrace.put('[',']');
		braceToBrace.put('{','}');
	}
	
	public static boolean isBalanced(String parentheses){
		
		if(parentheses.length() < 2){
			return false;
		}else{
			/* if we are encountering (,{,[ brackets then push into stack */
			for(char c : parentheses.toCharArray()){
				switch(c){
					case '(':
					case '{':
					case '[':
						st.push(c);
				}
				switch(c){
					case ')':
					case '}':
					case ']':
						if(!st.isEmpty()){
							Character ch = st.peek();
							if(braceToBrace.get(ch) == c){
								st.pop();
							}else{
								return false;
							}
						}else{
							return false;
						}
					default:
				}
			}
		}
		if(st.isEmpty()){
			return true;
		}
		return false;
	}
}
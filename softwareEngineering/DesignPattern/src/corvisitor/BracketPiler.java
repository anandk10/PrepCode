package corvisitor;

import java.util.HashMap;
import java.util.Stack;

public class BracketPiler {

	
    static final private HashMap<Character, Character> braceToBrace;
	static{
		braceToBrace = new HashMap<Character, Character>();
		braceToBrace.put('(',')');
		braceToBrace.put('[',']');
		braceToBrace.put('{','}');
	}
	
	
	static Stack<Character> pile = new Stack<Character>();
	
	static void putBracket(Character bracket) {
		
		
		switch(bracket){
			case '(':
			case '{':
			case '[':
				pile.push(bracket);
		}
		switch(bracket){
			case ')':
			case '}':
			case ']':
				if(!pile.isEmpty()){
					Character ch = pile.peek();
					if(braceToBrace.get(ch) == bracket){
						pile.pop();
					}
				}/*else{
						BracketPiler false;
					}
				}else{
					return false;
				}*/
		}
		
		
	}
	
	static boolean isBalanced() {
		
		return pile.isEmpty();	
		
	}
	
	
	
}

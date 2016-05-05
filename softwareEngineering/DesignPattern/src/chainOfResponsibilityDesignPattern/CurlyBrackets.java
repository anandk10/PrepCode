package chainOfResponsibilityDesignPattern;

import balancedParentheses.BalancedParentheses;

public class CurlyBrackets implements Brackets{

	Brackets bracket;
	
	@Override
	public void setNextBracket(Brackets bracket) {
		// TODO Auto-generated method stub
		this.bracket = bracket;
	}

	@Override
	public void handleBracket(String expression) {
		// TODO Auto-generated method stub
		if( expression.contains("[") || expression.contains("]")) {
			System.out.println("Passing control to super bracket handler.");
			this.bracket.handleBracket(expression);
		} else {
			System.out.println(BalancedParentheses.isBalanced(expression));
			System.out.println("Curly brackets handled.");
		}
	}

}

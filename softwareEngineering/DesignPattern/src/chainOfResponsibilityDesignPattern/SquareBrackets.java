package chainOfResponsibilityDesignPattern;

import balancedParentheses.BalancedParentheses;

public class SquareBrackets implements Brackets {

	Brackets bracket;
	
	@Override
	public void setNextBracket(Brackets bracket) {
		// TODO Auto-generated method stub
		this.bracket = bracket;
	}

	@Override
	public void handleBracket(String expression) {
		// TODO Auto-generated method stub
		System.out.println(BalancedParentheses.isBalanced(expression));
		System.out.println("All brackets will be handled.");
	}



}

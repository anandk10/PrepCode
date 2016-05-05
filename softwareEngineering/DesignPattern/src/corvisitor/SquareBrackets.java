package corvisitor;

public class SquareBrackets implements Brackets {

	Brackets bracket;
	
	@Override
	public void setNextBracket(Brackets bracket) {
		// TODO Auto-generated method stub
		this.bracket = bracket;
	}

	@Override
	public void handleBracket(char expression) {
		// TODO Auto-generated method stub
		
		System.out.println("Current character "+expression);
		switch(expression) {

			case '[':
			case ']':
				BracketPiler.putBracket(expression);
				System.out.println(this.getClass().getName()+" has handled this.");
				break;
			default:
				System.out.println("Not a bracket so couldn't handle.");
				return;
		}
	}
	
	
	@Override
	public boolean isBalanced() {
		// TODO Auto-generated method stub
		return BracketPiler.isBalanced();
	}



}

package corvisitor;

public interface Brackets {
	public void setNextBracket(Brackets bracket);
	public void handleBracket(char expression);
	public boolean isBalanced();

}

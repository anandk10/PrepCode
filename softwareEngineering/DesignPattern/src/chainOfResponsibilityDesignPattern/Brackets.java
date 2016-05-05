package chainOfResponsibilityDesignPattern;

public interface Brackets {
	public void setNextBracket(Brackets bracket);
	public void handleBracket(String expression); 
}

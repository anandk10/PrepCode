package chainOfResponsibilityDesignPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareBrackets square = new SquareBrackets();
		CurlyBrackets curly = new CurlyBrackets();
		RegularBrackets regular = new RegularBrackets();
		regular.setNextBracket(curly);
		curly.setNextBracket(square);
		
		regular.handleBracket("{(a+b)}");
		regular.handleBracket("[(a+b)]");
		regular.handleBracket("{[(a+b)]}");
		regular.handleBracket("[({(a+b)})]");
		regular.handleBracket("{(a+b}");
		
		
		
	}

}

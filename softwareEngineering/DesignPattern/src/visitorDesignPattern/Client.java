package visitorDesignPattern;

public class Client {

	public static void main(String[] args) {
		
		EvaluationVisitor eval = new EvaluationVisitor();
		
		ProcessString processString = new ProcessString();
		
		ProcessNumber processNumber = new ProcessNumber();
		
		
		Visitable visitable = new ProcessNumber();
		visitable.accept(eval);
		//processNumber.accept(eval);
		processString.accept(eval);
		
	}
	
}

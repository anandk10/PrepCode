package corvisitor;

import java.util.Scanner;

import visitorDesignPattern.EvaluationVisitor;
import visitorDesignPattern.ProcessNumber;
import visitorDesignPattern.ProcessString;
import visitorDesignPattern.Visitable;

public class Client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Initializing the objects */
		SquareBrackets square = new SquareBrackets();
		CurlyBrackets curly = new CurlyBrackets();
		RegularBrackets regular = new RegularBrackets();

		/* Setting the chain */
		regular.setNextBracket(curly);
		curly.setNextBracket(square);
		
		/* The visitor */ 
		EvaluationVisitor eval = new EvaluationVisitor();
		
		Visitable visitable = null;
		
		/* Getting the expression */
		String expression = "({}[a+b])";
		System.out.println("Enter the expression : ");
		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			expression = input.nextLine();
		}
		System.out.println("Entered expression : "+expression);
		/* flag that determines the visitor */
		boolean visitorSet = false;
		
		
		/* Iterating over the input expression */
		for(int i=0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			
			regular.handleBracket(c);

			if(!visitorSet) {
				if(Character.isDigit(c)) {
					visitorSet = true;
					visitable = new ProcessNumber();
				} else if(Character.isAlphabetic(c)) {
					visitorSet = true;
					visitable = new ProcessString();
				}
			}
		
		}
		
		System.out.println(regular.isBalanced());
		
		if(regular.isBalanced()) {
			System.out.println("Is balanced. ");
			visitable.accept(eval);
		} else {
			System.out.println("Not balanced.");
		}
		
		
		
	}

}

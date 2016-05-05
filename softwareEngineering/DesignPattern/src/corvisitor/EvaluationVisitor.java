package corvisitor;

public class EvaluationVisitor implements Visitor {

	@Override
	public void visit(ProcessString processString) {
		// TODO Auto-generated method stub
		System.out.println("The string is processed.");
	}

	@Override
	public void visit(ProcessNumber processNumber) {
		// TODO Auto-generated method stub
		System.out.println("The number is processed.");
	}

}

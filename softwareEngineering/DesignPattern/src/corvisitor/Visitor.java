package corvisitor;

public interface Visitor {

	public void visit(ProcessString processString);
	public void visit(ProcessNumber processNumber);
	
}

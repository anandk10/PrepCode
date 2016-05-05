package corvisitor;

public class ProcessNumber implements Visitable{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}

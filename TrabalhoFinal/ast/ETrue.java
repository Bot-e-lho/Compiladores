package ast;

public class ETrue extends Exp {

	public ETrue() {
		super();

	}

	@Override
	public String toJava() {
		return "true";
	}

}

package ast;

import java.util.Map;

public class ETrue extends Exp {

	public ETrue() {
		super();

	}

	@Override
	public String toJava(Map<String,String> env) {
		return "true";
	}

}

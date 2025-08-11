package ast;

import java.util.Map;

public class EFalse extends Exp {

	public EFalse() {
		super();

	}

	@Override
	public String toJava(Map<String,String> env) {
		return "false";
	}
}

package ast;

import java.util.Map;

public class EVar extends Exp {
	public String var;

	public EVar(String var) {
		this.var = var;

	}

	@Override
	public String toJava(Map<String,String> env) {
		return var;
	}
}

package ast;

import java.util.Map;

public class EOpExp extends Exp {
	public String op;
	public Exp arg1;
	public Exp arg2;

	public EOpExp(String op, Exp arg1, Exp arg2) {
		this.op = op;
		this.arg1 = arg1;
		this.arg2 = arg2;

	}

	@Override
	public String toJava(Map<String,String> env) {
        String left = arg1.toJava(env);
        String right = arg2.toJava(env);
        return "(" + left + " " + op + " " + right + ")";
    }

}

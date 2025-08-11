package ast;

import java.util.Map;

public class CReturn extends Comando {
	public int linha;
	public Exp exp;

	public CReturn(int linha, Exp exp) {
		this.linha = linha;
		this.exp = exp;

	}

	@Override
    public String toJava(Map<String,String> env, String indent) {
        return indent + "return " + exp.toJava(env) + ";\n";
    }

}

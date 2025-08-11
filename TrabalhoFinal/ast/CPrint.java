package ast;

import java.util.Map;

public class CPrint extends Comando {
	public int linha;
	public Exp exp;

	public CPrint(int linha, Exp exp) {
		this.linha = linha;
		this.exp = exp;

	}

	@Override
    public String toJava(Map<String,String> env, String indent) {
        return indent + "System.out.println(" + exp.toJava(env) + ");\n";
    }

}

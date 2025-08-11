package ast;

import java.util.Map;

public class CAtribuicao extends Comando {
	public int linha;
	public String var;
	public Exp exp;

	public CAtribuicao(int linha, String var, Exp exp) {
		this.linha = linha;
		this.var = var;
		this.exp = exp;
	}

	@Override
    public String toJava(Map<String,String> env, String indent) {
        return indent + var + " = " + exp.toJava(env) + ";\n";
    }

}

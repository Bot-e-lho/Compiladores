package ast;

import java.util.ArrayList;
import java.util.Map;

public class CIf extends Comando {
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;

	public CIf(int linha, Exp exp, ArrayList<Comando> bloco) {
		this.linha = linha;
		this.exp = exp;
		this.bloco = bloco;
	}

	@Override
    public String toJava(Map<String,String> env, String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("if(").append(exp.toJava(env)).append(") {\n");
        for (Comando c : bloco) {
            sb.append(c.toJava(env, indent + "    "));
        }
        sb.append(indent).append("}\n");
        return sb.toString();
    }

}

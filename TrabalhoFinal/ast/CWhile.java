package ast;

import java.util.ArrayList;
import java.util.Map;

public class CWhile extends Comando {
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;

	public CWhile(int linha, Exp exp, ArrayList<Comando> bloco) {
		this.linha = linha;
		this.exp = exp;
		this.bloco = bloco;
	}

	@Override
    public String toJava(Map<String,String> env, String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("while(").append(exp.toJava(env)).append(") {\n");
        for (Comando c : bloco) sb.append(c.toJava(env, indent + "    "));
        sb.append(indent).append("}\n");
        return sb.toString();
    }

}

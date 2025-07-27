package ast;

import java.util.ArrayList;

public class CChamadaFun extends Comando {
	public int linha;
	public String fun;
	public ArrayList<Exp> args;

	public CChamadaFun(int linha, String fun, ArrayList<Exp> args) {
		this.linha = linha;
		this.fun = fun;
		this.args = args;
	}

	// @Override
	public String toJava() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < args.size(); i++) {
			sb.append(args.get(i).toJava());
			if (i < args.size() - 1)
				sb.append(", ");
		}
		return fun + "(" + sb.toString() + ")";
	}

}

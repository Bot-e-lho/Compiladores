package ast;

import java.util.ArrayList;

public class EChamadaFun extends Exp {
	public String fun;
	public ArrayList<Exp> args;

	public EChamadaFun(String fun, ArrayList<Exp> args) {
		this.fun = fun;
		this.args = args;
	}

	@Override
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

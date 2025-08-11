package ast;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CChamadaFun extends Comando {
	public int linha;
	public String fun;
	public ArrayList<Exp> args;

	public CChamadaFun(int linha, String fun, ArrayList<Exp> args) {
		this.linha = linha;
		this.fun = fun;
		this.args = args;
	}

	@Override
    public String toJava(Map<String,String> env, String indent) {
        String params = args.stream()
                            .map(e -> e.toJava(env))
                            .collect(Collectors.joining(", "));
        return indent + fun + "(" + params + ");\n";
    }

}

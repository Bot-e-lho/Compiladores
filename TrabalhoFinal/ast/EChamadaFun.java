package ast;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class EChamadaFun extends Exp {
	public String fun;
	public ArrayList<Exp> args;

	public EChamadaFun(String fun, ArrayList<Exp> args) {
		this.fun = fun;
		this.args = args;
	}

	@Override
    public String toJava(Map<String,String> env) {
        String params = args.stream().map(e -> e.toJava(env)).collect(Collectors.joining(", "));
        return fun + "(" + params + ")";
    }

}

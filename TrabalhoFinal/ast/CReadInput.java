package ast;

import java.util.Map;

public class CReadInput extends Comando {
	public int linha;
	public String var;

	public CReadInput(int linha, String var) {
		this.linha = linha;
		this.var = var;
	}

	@Override
    public String toJava(Map<String,String> env, String indent) {
        String tipo = env.getOrDefault(var, "float");
        switch (tipo) {
            case "bool":
                return indent + var + " = sc.nextBoolean();\n";
            case "float":
                return indent + var + " = sc.nextFloat();\n";
            default:
                return indent + var + " = sc.next();\n";
        }
    }

}

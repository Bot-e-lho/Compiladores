package ast;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import compiler.Bela;


public class Fun {
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;

	public Fun(String nome, ArrayList<ParamFormalFun> params, String retorno, ArrayList<VarDecl> vars,
			ArrayList<Comando> body) {
		this.nome = nome;
		this.params = params;
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

	public String toJava(Map<String,String> parentEnv) {
        java.util.Map<String,String> env = new java.util.HashMap<>(parentEnv);
        String paramsDecl = params.stream()
                                  .map(p -> Bela.mapType(p.type) + " " + p.var)
                                  .collect(Collectors.joining(", "));
        for (ParamFormalFun p : params) env.put(p.var, p.type);

        StringBuilder sb = new StringBuilder();
        sb.append("public static ").append(Bela.mapType(retorno)).append(" ").append(nome)
          .append("(").append(paramsDecl).append(") {\n");

        sb.append("    java.util.Scanner sc = new java.util.Scanner(System.in);\n");

        for (VarDecl v : vars) {
            env.put(v.var, v.type);
            if ("float".equals(v.type)) sb.append("    float ").append(v.var).append(" = 0.0f;\n");
            else if ("bool".equals(v.type)) sb.append("    boolean ").append(v.var).append(" = false;\n");
            else sb.append("    ").append(Bela.mapType(v.type)).append(" ").append(v.var).append(";\n");
        }

        for (Comando c : body) {
            sb.append(c.toJava(env, "    "));
        }

        sb.append("}\n\n");
        return sb.toString();
    }

}

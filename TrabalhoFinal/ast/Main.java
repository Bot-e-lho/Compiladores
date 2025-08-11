package ast;

import java.util.ArrayList;
import java.util.Map;
import compiler.Bela;

public class Main {

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;

	public Main(ArrayList<VarDecl> vars, ArrayList<Comando> coms) {
		this.vars = vars;
		this.coms = coms;
	}

	public String toJava(Map<String,String> env) {
        StringBuilder sb = new StringBuilder();
        sb.append("public static void main(String[] args) {\n");
        sb.append("    java.util.Scanner sc = new java.util.Scanner(System.in);\n");

        for (VarDecl v : vars) {
            env.put(v.var, v.type);
            if ("float".equals(v.type)) sb.append("    float ").append(v.var).append(" = 0.0f;\n");
            else if ("bool".equals(v.type)) sb.append("    boolean ").append(v.var).append(" = false;\n");
            else sb.append("    ").append(Bela.mapType(v.type)).append(" ").append(v.var).append(";\n");
        }

        for (Comando c : coms) sb.append(c.toJava(env, "    "));
        sb.append("}\n");
        return sb.toString();
    }
}

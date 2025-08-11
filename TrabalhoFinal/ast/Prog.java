package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Prog {
    public Main main;
    public ArrayList<Fun> fun;

    public Prog(Main main, ArrayList<Fun> fun) {
        this.main = main;
        this.fun = fun;
    }

    public String toJava(String className) {
        Map<String,String> globalEnv = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append("import java.util.*;\n");
        sb.append("public class ").append(className).append(" {\n\n");
        // funções
        for (Fun f : fun) sb.append(f.toJava(globalEnv));
        // main
        sb.append(main.toJava(globalEnv));
        sb.append("\n}\n");
        return sb.toString();
    }

    // compatibilidade com chamadas antigas
    public String toJava() {
        return toJava("GeneratedBela");
    }
}

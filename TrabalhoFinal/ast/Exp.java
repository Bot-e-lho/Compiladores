package ast;

import java.util.Map;

public abstract class Exp {
    public abstract String toJava(Map<String,String> env);
}
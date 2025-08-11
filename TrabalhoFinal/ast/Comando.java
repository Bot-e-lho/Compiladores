package ast;
import java.util.Map;


public abstract class Comando {
    public abstract String toJava(Map<String,String> env, String indent);
}

package ast;

import java.util.Map;

public class EFloat extends Exp {
	public float value;

	public EFloat(float value) {
		this.value = value;

	}

	@Override
	public String toJava(Map<String,String> env) {
        if (Float.isNaN(value)) return "0.0f";
        // formata de forma simples
        if (value == (int)value) return String.format("%.1ff", value);
        return Float.toString(value) + "f";
    }

}

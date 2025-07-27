package ast;

public class EFloat extends Exp {
	public float value;

	public EFloat(float value) {
		this.value = value;

	}

	@Override
	public String toJava() {
		return String.valueOf(value);
	}

}

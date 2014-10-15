package es.upm.miw.pd.composite.expression.solution;

public abstract class Operacion extends Expresion {
	protected Expresion exp1;
	protected Expresion exp2;
	
	public Operacion (Expresion exp1, Expresion exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

}

package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion {
	
	private int numero;

	public Numero(int i) {
		this.numero = i;
	}
	
	@Override
	public int operar() {
		return this.numero;
	}

	@Override
	public String toString() {
		return ""+this.numero;
	}

}

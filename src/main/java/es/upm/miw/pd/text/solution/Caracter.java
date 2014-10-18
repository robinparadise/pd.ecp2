package es.upm.miw.pd.text.solution;

public class Caracter extends Componente {

	protected char caracter;

	public Caracter(Character caracter) {
		// TODO Auto-generated constructor stub
		this.caracter = caracter;
	}

	@Override
	public void add(Componente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dibujar(boolean mayusculas) {
		// TODO Auto-generated method stub
		if (mayusculas) {
			return Character.toString(this.caracter).toUpperCase();
		}
		else {
			return Character.toString(this.caracter);
		}
	}

	@Override
	public boolean isCompuesto() {
		// TODO Auto-generated method stub
		return false;
	}

}

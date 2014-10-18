package es.upm.miw.pd.text.solution;

public abstract class Componente {

	public abstract void add(Componente c);

	public abstract String dibujar(boolean mayusculas);

	public abstract boolean isCompuesto();

}

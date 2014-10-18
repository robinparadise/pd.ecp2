package es.upm.miw.pd.text.solution;

public class Parrafo extends Composite {
	
	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		if ( componente.isCompuesto()) {
			throw new UnsupportedOperationException();
		}
		else {
			this.componentes.add(componente);
		}
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String parrafo = super.dibujar(mayusculas);
		parrafo = parrafo + '\n';
		return  parrafo;
				
	}

}

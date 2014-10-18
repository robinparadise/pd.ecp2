package es.upm.miw.pd.text.solution;

public class Texto extends Composite {
	
	@Override
	public void add(Componente componente) {
		if ( !componente.isCompuesto() ) {
			throw new UnsupportedOperationException();
		}
		else
			this.componentes.add(componente);
	}
	
	@Override
	public String dibujar(boolean mayusculas) {
		String texto = super.dibujar(mayusculas);
		texto = texto + "---o---" + '\n';
		return texto;
	}
}

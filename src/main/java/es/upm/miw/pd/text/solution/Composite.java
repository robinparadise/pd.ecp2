package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Componente {
	List<Componente> componentes = new ArrayList<Componente>();
	
	public abstract void add(Componente c);
	
	public String dibujar ( boolean mayusculas){
		String texto = "";
		for ( Componente c : componentes){
			texto += c.dibujar(mayusculas);
		}
		return texto;
	}
	
	@Override
	public boolean isCompuesto(){
		return true;
	}
	
	public void delete ( Componente c){
		if ( this.componentes.contains(c))
			this.componentes.remove(c);
	}
}

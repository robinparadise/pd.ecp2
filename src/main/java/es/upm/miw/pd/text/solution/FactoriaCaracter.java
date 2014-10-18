package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	
	private static FactoriaCaracter factoryaCaracter;
	private Map<Character, Caracter> caracteres;
	
	private FactoriaCaracter(){
		caracteres = new HashMap<Character, Caracter>();
	}
	
	public static FactoriaCaracter getFactoria(){
    	if( FactoriaCaracter.factoryaCaracter == null)
    		FactoriaCaracter.factoryaCaracter = new FactoriaCaracter();
    	return FactoriaCaracter.factoryaCaracter;
    }
	
	public Caracter get( Character key){
		if(!caracteres.containsKey(key)){
			Caracter c = new Caracter(key);
			caracteres.put(key, c);
		}
	return caracteres.get(key);
	}


}

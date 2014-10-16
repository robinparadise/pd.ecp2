package es.upm.miw.pd.state.connection;

public class StateEsperando extends State {

	@Override
	public Estado getEstado() {
		// TODO Auto-generated method stub
		return Estado.ESPERANDO;
	}
	
	public void abrir(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void cerrar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void parar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void iniciar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void enviar(Conexion c, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void recibir(Conexion conexion, int respuesta) {
		if (respuesta > 0) {
			conexion.setState(new StateCerrado());
		} else {
			conexion.setState(new StatePreparado());
		}
	}

}

package es.upm.miw.pd.state.connection;

public class StateParado extends State {

	@Override
	public Estado getEstado() {
		// TODO Auto-generated method stub
		return Estado.PARADO;
	}
	
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
		
	public void iniciar(Conexion conexion) {
		conexion.setState(new StatePreparado());
	}
	
	public void parar(Conexion conexion) {
	}
	
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}

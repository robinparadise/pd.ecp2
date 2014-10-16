package es.upm.miw.pd.state.connection;

public class StateCerrado extends State {

	@Override
	public Estado getEstado() {
		// TODO Auto-generated method stub
		return Estado.CERRADO;
	}
	
	public void abrir(Conexion conexion) {
		conexion.setState(new StatePreparado());
	}
		
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void cerrar(Conexion conexion) {
	}
	
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}

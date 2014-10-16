package es.upm.miw.pd.state.connection;

public class StatePreparado extends State {

	@Override
	public Estado getEstado() {
		// TODO Auto-generated method stub
		return Estado.PREPARADO;
	}
	
	public void cerrar(Conexion conexion) {
		conexion.setState(new StateCerrado());
	}
	
	public void parar(Conexion conexion) {
		conexion.setState(new StateParado());
	}
	
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setState(new StateEsperando());
	}
	
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}

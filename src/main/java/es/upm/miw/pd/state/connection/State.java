package es.upm.miw.pd.state.connection;

public abstract class State {
	
	public abstract Estado getEstado();
	
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
	}

	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
	}

	public void parar(Conexion conexion) {
		// TODO Auto-generated method stub
	}

	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub
	}

	public void enviar(Conexion conexion, String msg) {
		// TODO Auto-generated method stub
	}

	public void recibir(Conexion conexion, int respuesta) {
		// TODO Auto-generated method stub
	}

}

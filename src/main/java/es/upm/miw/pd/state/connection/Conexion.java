package es.upm.miw.pd.state.connection;

public class Conexion {
    //private Estado estado;
	private State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        //this.estado = Estado.CERRADO;
        this.state = new StateCerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.state.getEstado();
    }

    public void abrir() {
        this.state.abrir(this);
    }

    public void cerrar() {
    	this.state.cerrar(this);
    }

    public void parar() {
    	this.state.parar(this);
    }

    public void iniciar() {
    	this.state.iniciar(this);
    }

    public void enviar(String msg) {
    	this.state.enviar(this, msg);
    }

    public void recibir(int respuesta) {
    	this.state.recibir(this, respuesta);
    }

	public void setState(State state) {
		// TODO Auto-generated method stub
		this.state = state;
	}

}

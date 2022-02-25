package clases;

public class Alumno extends Persona {

	String expediente;
	@SuppressWarnings("unused")
	private String atribPrivado;
	public String atribPublico;
	protected String atribProtected;

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	protected void metodoProtected() {};

	public Alumno(String expediente) {
		super();
		this.expediente = expediente;
	}
	void metodoDefault() {};
	
	
}

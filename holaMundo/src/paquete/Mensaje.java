package paquete;

import java.util.Date;

public class Mensaje {
	private String emisor;
	private String Cuerpo;
	private Date fechaHoraCreacion;
	private Date fechaHoraModificacion;
	private String destinatario;
	
	
	

	public Mensaje() {
		this.emisor = "Emisor desconocido";
		this.Cuerpo = "Texto desconocido";
		this.fechaHoraCreacion = new Date();
		this.fechaHoraModificacion = new Date();
	}

	public Mensaje(String emisor, String texto) {
		this.emisor = emisor;
		this.Cuerpo = texto;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraModificacion = new Date();
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	private void actualizarFechaHoraModificacion() {
		this.fechaHoraModificacion = new Date();
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
		actualizarFechaHoraModificacion();
	}

	public String getCuerpo() {
		return Cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.Cuerpo = cuerpo;
		actualizarFechaHoraModificacion();
	}
	

	@Override
	public String toString() {
		return"("+ fechaHoraModificacion + ") Mensaje de " + emisor + ": " + Cuerpo + "";
	}
	
	
	
	
}

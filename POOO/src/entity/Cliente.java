package entity;

public class Cliente {
	String nombrecompleto;
	String telefonodecontacto;

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	public String getTelefonodecontacto() {
		return telefonodecontacto;
	}

	public void setTelefonodecontacto(String telefonodecontacto) {
		this.telefonodecontacto = telefonodecontacto;
	}

	public Cliente(String nombrecompleto, String telefonodecontacto) {
		this.nombrecompleto = nombrecompleto;
		this.telefonodecontacto = telefonodecontacto;
	}

	public Cliente() {
	}

}

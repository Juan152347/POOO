package entity;

public class Concierto extends ServicioAdicional {
	private String artista;
	private String lugar;
	private String horaIngreso;
	
	public Concierto(String artista, String lugar, String horaIngreso) {
		this.artista = artista;
		this.lugar = lugar;
		this.horaIngreso = horaIngreso;
	}


	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}


	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

	


}

package entity;

public class Concierto implements ServicioAdicional {
	private String artista;
	private String lugar;
	private String horaIngreso;
	
	public Concierto(String artista, String lugar, String horaIngreso) {
		this.artista = artista;
		this.lugar = lugar;
		this.horaIngreso = horaIngreso;
	}

<<<<<<< HEAD
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
	
	
	
=======
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

>>>>>>> branch 'master' of https://github.com/Juan152347/POOO.git
}

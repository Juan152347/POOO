package entity;

public class Concierto extends ServicioAdicional {
	private String artista;
	private String lugar;
	private String horaIngreso;

	public Concierto( String descripcion, double precio, String artista, String lugar,
	String horaIngreso) {
	super( descripcion, precio);
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
		String h = horaIngreso.substring(0, 1);
		int num = Integer.valueOf(h).intValue();
		String grado = horaIngreso.substring(1);
		double descuento;
		double nuevoPrecio;
		boolean compararP = grado.equalsIgnoreCase("pm");
		boolean compararA = grado.equalsIgnoreCase("am");
		
		if(compararP == true) {
			for(int i= 6; i<12; i-=-1) {
				if(num == i) {
					descuento = precio*0.10;
					nuevoPrecio= precio + descuento;
					return nuevoPrecio;
				}
			}
		}
		
		if(compararA ==true) {
			for(int i = 1; i<=6; i-=-1) {
				if(num == i) {
					descuento = precio*0.10;
					nuevoPrecio = precio + descuento;
					return nuevoPrecio;
				}
			}
			if(num == 12) {
				descuento = precio*0.10;
				nuevoPrecio = precio + descuento;
				return nuevoPrecio;
			}
		}
		return precio;
	}
	

}

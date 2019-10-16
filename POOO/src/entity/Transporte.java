package entity;

public class Transporte implements ServicioAdicional{
	private double distancia;
	private TipoTransporte tipo;
	private int numeroPasajeros;
	
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public TipoTransporte getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransporte tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public Transporte(double distancia, TipoTransporte tipo, int numeroPasajeros) {
		this.distancia = distancia;
		this.tipo = tipo;
		this.numeroPasajeros = numeroPasajeros;
		
	}
	
	
}

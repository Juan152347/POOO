package entity;

import enu.TipoTransporte;


public class Transporte extends  ServicioAdicional{


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


	public Transporte(long codigoServicio, String descripcion, double precio, double distancia, TipoTransporte tipo,
	int numeroPasajeros) {
	super(codigoServicio, descripcion, precio);
	this.distancia = distancia;
	this.tipo = tipo;
	this.numeroPasajeros = numeroPasajeros;
	}


	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	



}

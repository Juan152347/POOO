package entity;

import java.util.Date;

public class Ecologico extends Tour {
	private boolean vacunacionRequerida;
	private double impuestoLocal;
	private boolean dificilAcceso;
	
	public Ecologico( String nombreComercial, String lugarPartida, Date fechaRegreso,
			Date fechaSalida, double precio, boolean vacunacionRequerida, double impuestoLocal, boolean dificilAcceso) {
		super( nombreComercial, lugarPartida, fechaRegreso, fechaSalida, precio);
		this.vacunacionRequerida = vacunacionRequerida;
		this.impuestoLocal = impuestoLocal;
		this.dificilAcceso = dificilAcceso;
	}
	
	@Override 
	public int  calcularEstadia () {
		long mils=Math.abs(getFechaRegreso().getTime())-Math.abs(getFechaSalida().getTime());
		long dias= Math.abs(mils/1000/60/60/24);
		if (dificilAcceso) {
		dias=dias+2;
		}
		return (int) dias;
	}
	@Override
	public double calcularPrecio() {
		return ((calcularEstadia()*getPrecio())+((calcularEstadia()*getPrecio())*impuestoLocal)/100);
	}
}

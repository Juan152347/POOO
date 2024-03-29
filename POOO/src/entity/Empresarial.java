package entity;

import java.util.Date;

import enu.TipoEmpresa;

public class Empresarial extends Tour {
	private String nombreEmpresa;
	private boolean viajeroFrecuente;
	private TipoEmpresa tipo;
	
	public Empresarial( String nombreComercial, String lugarPartida, Date fechaRegreso,
			Date fechaSalida, double precio, String nombreEmpresa, boolean viajeroFrecuente, TipoEmpresa tipo) {
		super( nombreComercial, lugarPartida, fechaRegreso, fechaSalida, precio);
		this.nombreEmpresa = nombreEmpresa;
		this.viajeroFrecuente = viajeroFrecuente;
		this.tipo = tipo;
	}

	@Override
	public double calcularPrecio() {
		double preci;
		preci=super.calcularEstadia()*getPrecio();
		if(tipo==TipoEmpresa.MEDIO_COMUNICACION||tipo==TipoEmpresa.TURISMO) {
			preci=preci*0.9;
		}
		return preci;
	}
	
	
}

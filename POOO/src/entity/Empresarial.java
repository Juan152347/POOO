package entity;

import java.sql.Date;

import enu.TipoEmpresa;

public class Empresarial extends Tour {
	private String nombreEmpresa;
	private boolean viajeroFrecuente;
	private TipoEmpresa tipo;
	
	public Empresarial(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso,
			Date fechaSalida, double precio, String nombreEmpresa, boolean viajeroFrecuente, TipoEmpresa tipo) {
		super(codigoIdentidad, nombreComercial, lugarPartida, fechaRegreso, fechaSalida, precio);
		this.nombreEmpresa = nombreEmpresa;
		this.viajeroFrecuente = viajeroFrecuente;
		this.tipo = tipo;
	}
	
	
}

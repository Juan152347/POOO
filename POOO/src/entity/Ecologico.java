package entity;

import java.sql.Date;

public class Ecologico extends Tour {
	private boolean vacunacionRequerida;
	private double impuestoLocal;
	private double dificilAcceso;
	
	public Ecologico(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso,
			Date fechaSalida, double precio, boolean vacunacionRequerida, double impuestoLocal, double dificilAcceso) {
		super(codigoIdentidad, nombreComercial, lugarPartida, fechaRegreso, fechaSalida, precio);
		this.vacunacionRequerida = vacunacionRequerida;
		this.impuestoLocal = impuestoLocal;
		this.dificilAcceso = dificilAcceso;
	}
	
	
}

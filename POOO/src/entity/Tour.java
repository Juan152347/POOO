package entity;

import java.sql.Date;

public class Tour {
	private long codigoIdentidad;
	private String nombreComercial;
	private String lugarPartida;
    private Date fechaRegreso;
    private Date fechaSalida;
	private double precio;
	
	public Tour(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso, Date fechaSalida,
			double precio) {
		this.codigoIdentidad = codigoIdentidad;
		this.nombreComercial = nombreComercial;
		this.lugarPartida = lugarPartida;
		this.fechaRegreso = fechaRegreso;
		this.fechaSalida = fechaSalida;
		this.precio = precio;
	}
	
	public Tour() {
	}

	public long getCodigoIdentidad() {
		return codigoIdentidad;
	}
	public void setCodigoIdentidad(long codigoIdentidad) {
		this.codigoIdentidad = codigoIdentidad;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getLugarPartida() {
		return lugarPartida;
	}
	public void setLugarPartida(String lugarPartida) {
		this.lugarPartida = lugarPartida;
	}
	public Date getFechaRegreso() {
		return fechaRegreso;
	}
	public void setFechaRegreso(Date fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String toString() {
	    return "Codigo Identidad:"+" "+this.codigoIdentidad+" "+ "Nombre Comercial:"+" "+this.nombreComercial+"  "+"Lugar de partida:"+" "+this.lugarPartida+" "+;
	}
	
	
}

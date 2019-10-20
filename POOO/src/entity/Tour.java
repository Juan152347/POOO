package entity;

import java.util.Date;

public class Tour {
 
	private String nombreComercial;
	private String lugarPartida;
    private Date fechaRegreso;
    private Date fechaSalida;
	private double precio;
	
	
	
	public Tour(String nombreComercial, String lugarPartida, Date fechaRegreso, Date fechaSalida, double precio) {
		this.nombreComercial = nombreComercial;
		this.lugarPartida = lugarPartida;
		this.fechaRegreso = fechaRegreso;
		this.fechaSalida = fechaSalida;
		this.precio = precio;
	}


	public Tour() {
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
	    return  "Nombre Comercial:"+" "+
	      this.nombreComercial+" "+"Lugar de partida:"+" "+this.lugarPartida+" "+"fecha regreso:"+" "+
	    this.fechaRegreso+" "+"fecha salida:"+" "+this.fechaSalida+" "+"precio:"+" "+this.precio;
	}
	
	public int  calcularEstadia () {
		
		long mils=Math.abs(fechaRegreso.getTime())-Math.abs(fechaSalida.getTime());
		long dias= Math.abs(mils/1000/60/60/24);
		return (int) dias;
		
	}
	public double calcularPrecio() {
		return (calcularEstadia()*precio);
	}
}

package entity;

import java.util.ArrayList;
import java.util.Calendar;

public class Reserva {

	private long numeroReservas;
	private Calendar fecha;
	private boolean pagado;
	private int cantidadPersona;
	private ArrayList<ServicioAdicional> serviciosAdicionales;
	
	public long getNumeroReservas() {
		return numeroReservas;
	}
	public void setNumeroReservas(long numeroReservas) {
		this.numeroReservas = numeroReservas;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public int getCantidadPersona() {
		return cantidadPersona;
	}
	public void setCantidadPersona(int cantidadPersona) {
		this.cantidadPersona = cantidadPersona;
	}
	
	public Reserva(long numeroReservas, Calendar fecha, boolean pagado, int cantidadPersona) {
		super();
		this.numeroReservas = numeroReservas;
		this.fecha = fecha;
		this.pagado = pagado;
		this.cantidadPersona = cantidadPersona;
	}
	
	
}

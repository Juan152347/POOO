package entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Reserva {

	private Calendar fecha;
	private boolean pagado;
	private int cantidadPersona;
	private Tour tourReservado;
	private Cliente clienteReserva;
	private Map<Integer, ServicioAdicional> serviciosAdicionales = new HashMap<>();

	public Map<Integer, ServicioAdicional> getServiciosAdicionales() {
		return serviciosAdicionales;
	}

	public void setServiciosAdicionales(Map<Integer, ServicioAdicional> serviciosAdicionales) {
		this.serviciosAdicionales = serviciosAdicionales;
	}

	public Tour getTourReservado() {
		return tourReservado;
	}

	public void setTourReservado(Tour tourReservado) {
		this.tourReservado = tourReservado;
	}

	public Cliente getClienteReserva() {
		return clienteReserva;
	}

	public void setClienteReserva(Cliente clienteReserva) {
		this.clienteReserva = clienteReserva;
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

	public Reserva(Calendar fecha, boolean pagado, int cantidadPersona, Tour tourReservado, Cliente clienteReserva) {
		super();

		this.fecha = fecha;
		this.pagado = pagado;
		this.cantidadPersona = cantidadPersona;
		this.tourReservado = tourReservado;
		this.clienteReserva = clienteReserva;
	}

	public Reserva() {
	}

	public String toString() {
		return "fecha: " + this.fecha.getTime() + " " + "estado de pago: " + this.pagado + " " + "cantidad de personas: "
				+ this.cantidadPersona + " " + "tour: " + this.tourReservado.getNombreComercial() + " " + "cliente: "
				+ this.clienteReserva;
	}

}

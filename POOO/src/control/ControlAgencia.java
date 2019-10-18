package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import entity.Cliente;
import entity.Reserva;
import entity.Tour;

public class ControlAgencia {
	private GestionCliente gestioncliente;
	private GestionTours gestiontours;
	private Map<Long, Tour> listaTours = new HashMap<>();
	private Map<Long, Cliente> listaClientes = new HashMap<>();
	private Map<Long,Reserva> reservas=new HashMap<>();

	public void verListatours() {
		for (Tour tour : listaTours.values()) {
			System.out.println(tour.toString());
		}
   	}
	public void verListacliente() {
		for(Cliente cliente:listaClientes.values()) {
			System.out.println(cliente.toString());
		}
	}
	public boolean validarTour(long codigo) {
		if (codigo > 1000000 && codigo < 10000000) {
			return true;
		} else {
			return false;
		}

	}
	
}

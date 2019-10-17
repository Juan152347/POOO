package control;

import java.util.HashMap;

import entity.Cliente;

public class GestionCliente {
	public void insertarCliente(Long cod, String nombre, String telefono, HashMap<Long, Cliente> listaclientes) {
		Cliente ncli = new Cliente(nombre, telefono);
		listaclientes.put(cod, ncli);
	}

	public boolean verificarexistencia(HashMap<Long, Cliente> listaclientes, long cod) {
		if (listaclientes.get(cod) != null) {
			return true;
		} else {
			return false;
		}
	}
}

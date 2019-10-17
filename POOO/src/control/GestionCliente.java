package control;

import java.util.HashMap;

import entity.Cliente;

public class GestionCliente {
	public void insertarCliente(Long cod,String nombre, String telefono, HashMap<Long,Cliente> listaclientes) {
     Cliente ncli=new Cliente(nombre,telefono);
     listaclientes.put(cod,ncli);
	}
}

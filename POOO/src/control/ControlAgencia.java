package control;

import java.util.HashMap;
import java.util.Map;

import entity.Cliente;
import entity.Tour;

public class ControlAgencia {
GestionCliente gestioncliente;
GestionTours gestiontours;
Map<Integer,Tour> listaTours=new HashMap<>();
Map<Integer,Cliente> listaClientes=new HashMap<>();
}

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
private Map<Integer,Tour> listaTours=new HashMap<>();
private Map<Integer,Cliente> listaClientes=new HashMap<>();
private ArrayList<Reserva> reservas;
}

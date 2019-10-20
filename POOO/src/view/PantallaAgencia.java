package view;

import control.ControlAgencia;
import control.GestionCliente;
import control.GestionTours;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PantallaAgencia {
	public static void main(String[] args) {
      ControlAgencia co=new ControlAgencia();
      GestionTours gt=new GestionTours();
      GestionCliente gc=new GestionCliente();
      //Clientes con metodo insertar cliente del control
      gc.insertarCliente((long)89657412, "n1", "4444444", co.getListaClientes());
      gc.insertarCliente((long)95123475, "n2", "5555555", co.getListaClientes());
      gc.insertarCliente((long)96325876, "n3", "6666666", co.getListaClientes());
      gc.insertarCliente((long)98745634, "n4", "7777777", co.getListaClientes());
      gc.insertarCliente((long)98623148, "n5", "8888888", co.getListaClientes());
      co.verListacliente();
      
      
	}
}

package view;

import control.ControlAgencia;
import control.GestionCliente;
import control.GestionTours;
import enu.TipoEmpresa;

import java.util.Calendar;
import java.util.Date;
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
      
      
      Calendar c=Calendar.getInstance();
      c.set(Calendar.HOUR_OF_DAY, 0);
	  c.set(Calendar.MINUTE, 0);
	  c.set(Calendar.SECOND, 0);
	  c.set(Calendar.MILLISECOND, 0);
      c.set(2020, 0, 2);
      Date fs1=c.getTime();
      c.set(2020, 0, 15);
      Date fr1=c.getTime();
      c.set(2020, 1, 2);
      Date fs2=c.getTime();
      c.set(2020, 1, 15);
      Date fr2=c.getTime();
      c.set(2020, 2, 2);
      Date fs3=c.getTime();
      c.set(2020, 2, 15);
      Date fr3=c.getTime();
      c.set(2020, 3, 2);
      Date fs4=c.getTime();
      c.set(2020, 3, 15);
      Date fr4=c.getTime();
      c.set(2020, 4, 2);
      Date fs5=c.getTime();
      c.set(2020, 4, 15);
      Date fr5=c.getTime();
      c.set(2020, 5, 2);
      Date fs6=c.getTime();
      c.set(2020, 5, 15);
      Date fr6=c.getTime();
      c.set(2020, 6, 2);
      Date fs7=c.getTime();
      c.set(2020, 6, 15);
      Date fr7=c.getTime();
      c.set(2020, 7, 2);
      Date fs8=c.getTime();
      c.set(2020, 7, 15);
      Date fr8=c.getTime();
      c.set(2020, 8, 2);
      Date fs9=c.getTime();
      c.set(2020, 8, 15);
      Date fr9=c.getTime();
      /*
      gt.insertarTour((long)9865321, "nc1", "lp1", fr1, fs1, 1000, co.getListaTours());
      gt.insertarTour((long)7896325, "nc2", "lp2", fr2, fs2, 1000, co.getListaTours());
      gt.insertarTour((long)9856475, "nc3", "lp3", fr3, fs3, 1000, co.getListaTours());
      gt.insertarTourEc((long)9632541, "nc4", "lp4", fr4, fs4, 2000, co.getListaTours(), true, 500, false);
      gt.insertarTourEc((long)5863215, "nc5", "lp5", fr5, fs5, 2000, co.getListaTours(), true, 500, false);
      gt.insertarTourEc((long)9462138, "nc6", "lp6", fr6, fs6, 2000, co.getListaTours(), true, 500, false);
      gt.insertarTourEm((long)5462318, "nc7", "lp7", fr7, fs7, 3000, co.getListaTours(), "ne1", false, TipoEmpresa.MEDIO_COMUNICACION);
      gt.insertarTourEm((long)9632000, "nc8", "lp8", fr8, fs8, 3000, co.getListaTours(), "ne2", true, TipoEmpresa.TECNOLOGIA);
      gt.insertarTourEm((long)5603267, "nc9", "lp9", fr9, fs9, 3000, co.getListaTours(), "ne3", false, TipoEmpresa.TURISMO);
      co.verListatours();
      co.llenarservicosa();
      co.reservartour();
      co.verreservas();
      co.modificarreserva();
      co.verreservas();*/
      co.llenarTours();
      co.verListatours();
	}
}

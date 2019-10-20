package view;

import control.ControlAgencia;
import control.GestionCliente;
import control.GestionTours;
import entity.Reserva;
import enu.TipoEmpresa;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PantallaAgencia {
	public static void main(String[] args) {
		ControlAgencia co = new ControlAgencia();
		GestionTours gt = new GestionTours();
		GestionCliente gc = new GestionCliente();
		// Clientes con metodo insertar cliente del control
		gc.insertarCliente((long) 89657412, "n1", "4444444", co.getListaClientes());
		gc.insertarCliente((long) 95123475, "n2", "5555555", co.getListaClientes());
		gc.insertarCliente((long) 96325876, "n3", "6666666", co.getListaClientes());
		gc.insertarCliente((long) 98745634, "n4", "7777777", co.getListaClientes());
		gc.insertarCliente((long) 98623148, "n5", "8888888", co.getListaClientes());
		co.verListacliente();

		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		c.set(2020, 0, 2);
		Date fs1 = c.getTime();
		c.set(2020, 0, 15);
		Date fr1 = c.getTime();
		c.set(2020, 1, 2);
		Date fs2 = c.getTime();
		c.set(2020, 1, 15);
		Date fr2 = c.getTime();
		c.set(2020, 2, 2);
		Date fs3 = c.getTime();
		c.set(2020, 2, 15);
		Date fr3 = c.getTime();
		c.set(2020, 3, 2);
		Date fs4 = c.getTime();
		c.set(2020, 3, 15);
		Date fr4 = c.getTime();
		c.set(2020, 4, 2);
		Date fs5 = c.getTime();
		c.set(2020, 4, 15);
		Date fr5 = c.getTime();
		c.set(2020, 5, 2);
		Date fs6 = c.getTime();
		c.set(2020, 5, 15);
		Date fr6 = c.getTime();
		c.set(2020, 6, 2);
		Date fs7 = c.getTime();
		c.set(2020, 6, 15);
		Date fr7 = c.getTime();
		c.set(2020, 7, 2);
		Date fs8 = c.getTime();
		c.set(2020, 7, 15);
		Date fr8 = c.getTime();
		c.set(2020, 8, 2);
		Date fs9 = c.getTime();
		c.set(2020, 8, 15);
		Date fr9 = c.getTime();

		gt.insertarTour((long) 9865321, "nc1", "lp1", fr1, fs1, 1000, co.getListaTours());
		gt.insertarTour((long) 7896325, "nc2", "lp2", fr2, fs2, 1000, co.getListaTours());
		gt.insertarTour((long) 9856475, "nc3", "lp3", fr3, fs3, 1000, co.getListaTours());
		gt.insertarTourEc((long) 9632541, "nc4", "lp4", fr4, fs4, 2000, co.getListaTours(), true, 500, false);
		gt.insertarTourEc((long) 5863215, "nc5", "lp5", fr5, fs5, 2000, co.getListaTours(), true, 500, false);
		gt.insertarTourEc((long) 9462138, "nc6", "lp6", fr6, fs6, 2000, co.getListaTours(), true, 500, false);
		gt.insertarTourEm((long) 5462318, "nc7", "lp7", fr7, fs7, 3000, co.getListaTours(), "ne1", false,
				TipoEmpresa.MEDIO_COMUNICACION);
		gt.insertarTourEm((long) 9632000, "nc8", "lp8", fr8, fs8, 3000, co.getListaTours(), "ne2", true,
				TipoEmpresa.TECNOLOGIA);
		gt.insertarTourEm((long) 5603267, "nc9", "lp9", fr9, fs9, 3000, co.getListaTours(), "ne3", false,
				TipoEmpresa.TURISMO);
		co.verListatours();
		Calendar c2 = Calendar.getInstance();
		c2.set(2020, 4, 2);
		Calendar c3 = Calendar.getInstance();
		c3.set(2020, 6, 2);
		Calendar c4 = Calendar.getInstance();
		c4.set(2020, 7, 2);
		Calendar c5 = Calendar.getInstance();
		c5.set(2020, 8, 2);
		Calendar c6 = Calendar.getInstance();
		c5.set(2020, 9, 2);
		Reserva r1 = new Reserva(c2, true, 5, co.getListaTours().get((long)9865321), co.getListaClientes().get((long)89657412));
		co.llenarservicosa();
		r1.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r2=new Reserva(c3, false, 5, co.getListaTours().get((long)7896325), co.getListaClientes().get((long)95123475));
		r2.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r3=new Reserva(c4, false, 5, co.getListaTours().get((long)9856475), co.getListaClientes().get((long)96325876));
		r3.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r4=new Reserva(c5, true, 2, co.getListaTours().get((long)9632541), co.getListaClientes().get((long)98745634));
		r4.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r5=new Reserva(c6, false, 4, co.getListaTours().get((long)5863215), co.getListaClientes().get((long)98623148));
		r5.setServiciosAdicionales(co.getServiciosadicionalesgen());
		co.getReservas().put((long)1111, r1);
		co.getReservas().put((long)2222, r2);
		co.getReservas().put((long)3333, r3);
		co.getReservas().put((long)4444, r4);
		co.getReservas().put((long)5555, r5);
		co.verreservas();
	}
}

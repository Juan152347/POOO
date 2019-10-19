package control;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entity.Cliente;
import entity.Ecologico;
import entity.Empresarial;
import entity.Reserva;
import entity.ServicioAdicional;
import entity.Tour;

public class ControlAgencia {
	private GestionCliente gestioncliente;
	private GestionTours gestiontours;
	private Map<Long, Tour> listaTours = new HashMap<>();
	private Map<Long, Cliente> listaClientes = new HashMap<>();
	private Map<Long, Reserva> reservas = new HashMap<>();
	private Map<Integer,ServicioAdicional> serviciosadicionalesgen=new HashMap<>();

	public void verListatours() {
		for (Tour tour : listaTours.values()) {
			System.out.println(tour.toString());
		}
	}

	public void verListacliente() {
		for (Cliente cliente : listaClientes.values()) {
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

	public HashMap<Long, Tour> ecologico() {
		HashMap<Long, Tour> toursEcologicos = new HashMap<>();
		long cont = 0;

		for (Tour tourE : listaTours.values()) {
			if (tourE instanceof Ecologico) {
				toursEcologicos.put(cont, tourE);
				cont++;
			}
		}
		return toursEcologicos;
	}

	public HashMap<Long, Reserva> reservaEmpresarial() {
		HashMap<Long, Reserva> reservasEmp = new HashMap<>();
		long cont = 0;
		for (Reserva reservaEm : reservas.values()) {
			if (reservaEm.getTourReservado() instanceof Empresarial) {
				reservasEmp.put(cont, reservaEm);
				cont++;
			}
		}
		return reservasEmp;
	}

	public long numerodereserva() {
		long i = Math.round((Math.random() * (9999 - 1000 + 1) + 1000));
		for (long key : reservas.keySet()) {
			if (i == key) {
				return numerodereserva();
			}
		}
		return i;
	}

	public void reservartour() {
		Scanner sc = new Scanner(System.in);
		boolean estac = false;
		boolean estat = false;
		Reserva nreserva = new Reserva();
		System.out.println("digite el numero de identificacion del cliente:");
		long id = sc.nextLong();
		System.out.println("digite el codigo de identificacion del tour:");
		long codt = sc.nextLong();
		if (listaTours.get(codt) != null) {
			estat = true;
		}
		if (listaClientes.get(id) != null) {
			estac = true;
		}
		Cliente auxc = listaClientes.get(id);
		Tour auxt = listaTours.get(codt);
		if (estat && estac) {
			boolean fval = false;
			do {				
				Calendar cal = Calendar.getInstance();
				System.out.println("digite el dia:");
				int dia = sc.nextInt();
				System.out.println("digite el mes:");
				int mes = sc.nextInt();
				System.out.println("digite el año");
				int ano = sc.nextInt();
				cal.set(ano, mes, dia);
				cal.set(Calendar.HOUR_OF_DAY, 0);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 0);
				cal.set(Calendar.MILLISECOND, 0);
				if (validarFecha(cal) && validarFecha(auxc, auxt, cal)) {
					fval = true;
				}
			} while (!fval);
			System.out.println("desea servicios adicionales S/N:");
			char op=sc.next().charAt(0);
			if(op=='s'||op=='S') {
				for (Map.Entry<Integer, ServicioAdicional> servicioAdicional : serviciosadicionalesgen.entrySet()) {
					System.out.println("codigo:"+" "+servicioAdicional.getKey()+"/n"+servicioAdicional.getValue().toString());
				}
				char op2='0';
				do {
					System.out.println("digite el codigo de servicio adicional que desea agregar");
					int cs=sc.nextInt();
					
					
				}while(op2!='n'|| op2!='N');
			}
		}

	}

	public boolean validarFecha(Calendar fecha) {
		Calendar fechaA = Calendar.getInstance();
		long mils = Math.abs(fechaA.getTimeInMillis() - fecha.getTimeInMillis());
		long dias = Math.abs(mils / 1000 / 60 / 60 / 24);
		if (dias > 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validarFecha(Cliente cli, Tour tou, Calendar fecha) {
		for (Reserva reserva : reservas.values()) {
			if (reserva.getClienteReserva().equals(cli) && reserva.getTourReservado().equals(tou)
					&& reserva.getFecha().equals(fecha)) {
				return true;
			}
		}
		return false;
	}

}

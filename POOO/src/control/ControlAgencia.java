package control;

import java.util.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import entity.Cliente;
import entity.Ecologico;
import entity.Empresarial;
import entity.Reserva;
import entity.ServicioAdicional;
import entity.Tour;
import enu.TipoEmpresa;

public class ControlAgencia {
	private GestionCliente gestioncliente;
	private GestionTours gestiontours;
	private Map<Long, Tour> listaTours = new HashMap<>();
	private Map<Long, Cliente> listaClientes = new HashMap<>();
	private Map<Long, Reserva> reservas = new HashMap<>();
	private Map<Integer, ServicioAdicional> serviciosadicionalesgen = new HashMap<>();
	
	
	public void llenarTours() {
		Date s1=new Date(120,1,3);
		Date r1=new Date(120,2,5);
	    Date s2=new Date(120,3,20);
	    Date r2=new Date(120,4,1); 
	    Date s3=new Date(120,7,6);
	    Date r3=new Date(120,8,6);
		Tour t1=new Tour("Tour1","Lugar1",s1,r1,1000);
		Ecologico t2=new Ecologico("Tour2","Lugar2",s2,r2,1500,true,500,false);
		Empresarial t3=new Empresarial("Tour3","Lugar3",s3,r3,2000,"e1",true,TipoEmpresa.TECNOLOGIA);
		listaTours.put((long)552, t1);
		listaTours.put((long)565, t2);
		listaTours.put((long)865, t3);
	}
	public void llenarClientes() {
		Cliente c1=new Cliente("nombre1","1111111");
		Cliente c2=new Cliente("nombre2","2222222");
		Cliente c3=new Cliente("nombre3","3333333");
		listaClientes.put((long)1567987, c1);
		listaClientes.put((long)8657423, c2);
		listaClientes.put((long)7894561, c3);
	}

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
		Calendar cal = Calendar.getInstance();
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
			char op = sc.next().charAt(0);
			if (op == 's' || op == 'S') {
				for (Map.Entry<Integer, ServicioAdicional> servicioAdicional : serviciosadicionalesgen.entrySet()) {
					System.out.println("codigo:" + " " + servicioAdicional.getKey() + "/n"
							+ servicioAdicional.getValue().toString());
				}
				char op2 = '0';
				do {
					System.out.println("digite el codigo de servicio adicional que desea agregar");
					int cs = sc.nextInt();
					if (serviciosadicionalesgen.get(cs) != null) {
						nreserva.getServiciosAdicionales().put(cs, serviciosadicionalesgen.get(cs));
						System.out.println("agregado exitosamente");
					} else {
						System.out.println("no se encontro el servicio adicional");
					}
					System.out.println("¿desea continuar? S/N");
					op2 = sc.next().charAt(0);
				} while (op2 != 'n' || op2 != 'N');
			}
			nreserva.setTourReservado(auxt);
			nreserva.setClienteReserva(auxc);
			nreserva.setFecha(cal);
			Long condr = numerodereserva();
			reservas.put(condr, nreserva);
			double ac = 0;
			System.out.println("Codigo:" + " " + condr);
			System.out.println("Fecha:" + " " + reservas.get(condr).getFecha().getTime());
			System.out.println("Cantidad de personas:" + " " + reservas.get(condr).getCantidadPersona());
			System.out.println("Tour:" + " " + reservas.get(condr).getTourReservado().getNombreComercial());
			System.out.println("Cliente:" + " " + reservas.get(condr).getClienteReserva().getNombrecompleto());
			System.out.println("Servicios adicionales");
			for (Map.Entry<Integer, ServicioAdicional> servicioadicional : reservas.get(condr).getServiciosAdicionales()
					.entrySet()) {
				System.out.println(
						"codigo:" + " " + servicioadicional.getKey() + " " + servicioadicional.getValue().toString());
				ac += servicioadicional.getValue().getPrecio();
			}
			System.out.println("precio total: " + calcularprecioreserva(reservas.get(condr).getCantidadPersona(),
					reservas.get(condr).getTourReservado()) + ac);
		} else {
			System.out.println("no existe el tour o el cliente");
		}

	}

	public void modificarreserva() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿que reserva desea modificar?");
		long a = sc.nextLong();
		char op3 = 'a';

		if (reservas.get(a) != null) {
			System.out.println("¿que desea modificar?");
			System.out.println("1. fecha");
			System.out.println("2. cantidad de personas");
			System.out.println("3. servicios adicionales");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				boolean fval = false;
				while (!fval) {
					Calendar ncal = Calendar.getInstance();
					System.out.println("digite el dia:");
					int dia = sc.nextInt();
					System.out.println("digite el mes:");
					int mes = sc.nextInt();
					System.out.println("digite el año:");
					int ano = sc.nextInt();
					ncal.set(ano, mes, dia);
					ncal.set(Calendar.HOUR_OF_DAY, 0);
					ncal.set(Calendar.MINUTE, 0);
					ncal.set(Calendar.SECOND, 0);
					ncal.set(Calendar.MILLISECOND, 0);
					fval = valfecha(ncal);
					if (fval) {
						reservas.get(a).setFecha(ncal);
					}
				}
				break;
			case 2:
				System.out.println("digite cuantas personas:");
				reservas.get(a).setCantidadPersona(sc.nextInt());
				break;
			case 3:
				System.out.println("servicios adicionales disponibles");
				for (Map.Entry<Integer, ServicioAdicional> servicioAdicional : serviciosadicionalesgen.entrySet()) {
					System.out.println("codigo:" + " " + servicioAdicional.getKey() + "/n"
							+ servicioAdicional.getValue().toString());
				}
				System.out.println("servicios adicionales en la reserva:");
				for (Map.Entry<Integer, ServicioAdicional> servicioAdicional : reservas.get(a).getServiciosAdicionales()
						.entrySet()) {
					System.out.println("codigo:" + " " + servicioAdicional.getKey() + "/n"
							+ servicioAdicional.getValue().toString());
				}
				System.out.println("¿desea quitar o agregar servicios adicionales? Q/A");
				char op2 = sc.next().charAt(0);
				if (op2 == 'q' || op2 == 'Q') {

					do {
						System.out.println("¿que servicio desea quitar?");
						int qser = sc.nextInt();
						reservas.get(a).getServiciosAdicionales().remove(qser);
						System.out.println("¿desea quitar otro servicio? S/N");
						op3 = sc.next().charAt(0);
					} while (op3 != 'n' || op3 != 'N');
				} else if (op2 == 'a' || op2 == 'A') {
					do {
						System.out.println("¿que servicio desea agregar?");
						int aser = sc.nextInt();
						reservas.get(a).getServiciosAdicionales().put(aser, serviciosadicionalesgen.get(aser));
						System.out.println("desea agregar otro S/N");
						op3 = sc.next().charAt(0);
					} while (op3 != 'n' || op3 != 'N');
				}
				break;
			default:
				break;
			}
		} else {
			System.out.println("la reserva no existe");
		}

	}

	public void eliminarreserva() {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite el codigo de la reserva");
		long cod = sc.nextLong();
		if (reservas.get(cod) != null) {
			reservas.remove(cod);
			System.out.println("eliminacion exitosa");
		} else {
			System.out.println("no se encontro la reserva");
		}
	}

	public boolean valfecha(Calendar cal) {
		for (Reserva reserva : reservas.values()) {
			if (reserva.getFecha().equals(cal)) {
				return false;
			}
		}
		return true;
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

	public double calcularprecioreserva(int cantidad, Tour tour) {
		double can = tour.getPrecio() * 0.25;
		double ptotal = tour.getPrecio() + (can * cantidad - 1);
		return ptotal;
	}

	public void verreservas() {
		for (Map.Entry<Long, Reserva> reserva : reservas.entrySet()) {
			System.out.println("codigo " + reserva.getKey() + reserva.getValue().toString());
		}
	}

	public void verreserva(long codt, Calendar fecha) {
		String nombre = listaTours.get(codt).getNombreComercial();
		for (Reserva reserva : reservas.values()) {
			if (reserva.getTourReservado().getNombreComercial().equals(nombre) && reserva.getFecha().equals(fecha)) {
				System.out.println(reserva.toString());
			}
		}
	}

	public double precioReservasToursEcologicosPorFecha(Date fechaInicio, Date fechaFinal) {
		HashMap<Long, Tour> ecologicos = ecologico();
		double ac = 0;
		for (Tour toure : ecologicos.values()) {
			if (toure.getFechaSalida().before(fechaInicio) && toure.getFechaSalida().after(fechaFinal)) {
				ac += toure.getPrecio();
			}
		}
		return ac;
	}

}

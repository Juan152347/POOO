package view;

import control.ControlAgencia;
import control.GestionCliente;
import control.GestionTours;
import entity.Reserva;
import entity.Tour;
import enu.TipoEmpresa;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
		Reserva r1 = new Reserva(c2, true, 5, co.getListaTours().get((long) 9865321),
				co.getListaClientes().get((long) 89657412));
		co.llenarservicosa();
		r1.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r2 = new Reserva(c3, false, 5, co.getListaTours().get((long) 7896325),
				co.getListaClientes().get((long) 95123475));
		r2.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r3 = new Reserva(c4, false, 5, co.getListaTours().get((long) 9856475),
				co.getListaClientes().get((long) 96325876));
		r3.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r4 = new Reserva(c5, true, 2, co.getListaTours().get((long) 9632541),
				co.getListaClientes().get((long) 98745634));
		r4.setServiciosAdicionales(co.getServiciosadicionalesgen());
		Reserva r5 = new Reserva(c6, false, 4, co.getListaTours().get((long) 5863215),
				co.getListaClientes().get((long) 98623148));
		r5.setServiciosAdicionales(co.getServiciosadicionalesgen());
		co.getReservas().put((long) 1111, r1);
		co.getReservas().put((long) 2222, r2);
		co.getReservas().put((long) 3333, r3);
		co.getReservas().put((long) 4444, r4);
		co.getReservas().put((long) 5555, r5);
		co.verreservas();
		int op;
		int opp;
		char opp1 = 's';
		char cg;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("====================================");
			System.out.println("seleccione una opcion");
			System.out.println("1.ver listados de tours disponibles");
			System.out.println("2.insertar tour");
			System.out.println("3.modificar tour");
			System.out.println("4.buscar tour");
			System.out.println("5.eliminar tour");
			System.out.println("6.Ver listado de Clientes registrados en el sistema");
			System.out.println("7.insertar cliente");
			System.out.println("8.modificar cliente");
			System.out.println("9.buscar clienter");
			System.out.println("10. eliminar un cliente");
			System.out.println("11.reservar tour");
			System.out.println("12. modificar reserva");
			System.out.println("13. eliminar reserva");
			System.out.println("14.ver reservas");
			System.out.println("15.Ver listado de Reservas para un tour y una fecha específica");
			System.out.println("16.salir");
			System.out.println("====================================");
			op = sc.nextInt();
			switch (op) {
			case 1:
				co.verListatours();

				break;
			case 2:
				do {
					System.out.println("que tipo de tour desea insertar");
					System.out.println("1.generico");
					System.out.println("2.ecologico");
					System.out.println("3.empresarial");
					opp = sc.nextInt();
					switch (opp) {
					case 1:
						System.out.println("digite un codigo");
						long cod = sc.nextLong();
						System.out.println("digite un nombre ");
						sc.nextLine();
						String n = sc.nextLine();
						System.out.println("digite un lugar de partida");
						String lp = sc.nextLine();
						Calendar call = Calendar.getInstance();
						call.set(Calendar.HOUR_OF_DAY, 0);
						call.set(Calendar.MINUTE, 0);
						call.set(Calendar.SECOND, 0);
						call.set(Calendar.MILLISECOND, 0);
						System.out.println("dia de salida");
						int dia = sc.nextInt();
						System.out.println("mes de salida");
						int mes = sc.nextInt();
						System.out.println("año de salida");
						int ano = sc.nextInt();
						call.set(ano, mes - 1, dia);
						Date fs = call.getTime();
						System.out.println("dia de regreso");
						int dia1 = sc.nextInt();
						System.out.println("mes de regreso");
						int mes1 = sc.nextInt();
						System.out.println("año de regreso");
						int ano1 = sc.nextInt();
						call.set(ano1, mes1 - 1, dia1);
						Date fr = call.getTime();
						System.out.println("digite precio");
						double p = sc.nextDouble();
						gt.insertarTour((long) cod, n, lp, fr, fs, p, co.getListaTours());
						break; 
					case 2:
						System.out.println("digite un codigo");
						long cod1 = sc.nextLong();
						System.out.println("digite un nombre ");
						sc.nextLine();
						String n1 = sc.nextLine();
						System.out.println("digite un lugar de partida");
						String lp1 = sc.nextLine();
						Calendar call1 = Calendar.getInstance();
						call1.set(Calendar.HOUR_OF_DAY, 0);
						call1.set(Calendar.MINUTE, 0);
						call1.set(Calendar.SECOND, 0);
						call1.set(Calendar.MILLISECOND, 0);
						System.out.println("dia de salida");
						int diaa = sc.nextInt();
						System.out.println("mes de salida");
						int mess = sc.nextInt();
						System.out.println("año de salida");
						int anoo = sc.nextInt();
						call1.set(anoo, mess - 1, diaa);
						Date f1s = call1.getTime();
						System.out.println("dia de regreso");
						int dia2 = sc.nextInt();
						System.out.println("mes de regreso");
						int mes2 = sc.nextInt();
						System.out.println("año de regreso");
						int ano2 = sc.nextInt();
						call1.set(ano2, mes2 - 1, dia2);
						Date f1r = call1.getTime();
						System.out.println("digite precio");
						double p1 = sc.nextDouble();
						System.out.println("¿tiene la vacunacion requerida? S/N");
						cg = sc.next().charAt(0);
						boolean v = false;
						if (cg == 's' || cg == 'S') {
							v = true;
						}
						System.out.println("digite el impuesto local");
						double il = sc.nextDouble();
						System.out.println("¿el lugar es de dificil acceso? S/N");
						cg = sc.next().charAt(0);
						boolean da = false;
						if (cg == 's' || cg == 'S') {
							da = true;
						}
						gt.insertarTourEc((long) cod1, n1, lp1, f1r, f1s, p1, co.getListaTours(), v, il, da);
						break;
					case 3:
						System.out.println("digite un codigo");
						long cod2 = sc.nextLong();
						System.out.println("digite un nombre ");
						sc.nextLine();
						String n2 = sc.nextLine();
						System.out.println("digite un lugar de partida");
						String lp2 = sc.nextLine();
						Calendar call2 = Calendar.getInstance();
						call2.set(Calendar.HOUR_OF_DAY, 0);
						call2.set(Calendar.MINUTE, 0);
						call2.set(Calendar.SECOND, 0);
						call2.set(Calendar.MILLISECOND, 0);
						System.out.println("dia de salida");
						int diaaa = sc.nextInt();
						System.out.println("mes de salida");
						int messs = sc.nextInt();
						System.out.println("año de salida");
						int anooo = sc.nextInt();
						call2.set(anooo, messs - 1, diaaa);
						Date f2s = call2.getTime();
						System.out.println("dia de regreso");
						int dia3 = sc.nextInt();
						System.out.println("mes de regreso");
						int mes3 = sc.nextInt();
						System.out.println("año de regreso");
						int ano3 = sc.nextInt();
						call2.set(ano3, mes3 - 1, dia3);
						Date f2r = call2.getTime();
						System.out.println("digite precio");
						double p2 = sc.nextDouble();
						System.out.println("digite el nombre de la empresa");
						String ne = sc.nextLine();
						System.out.println("es frecuente S/N");
						cg = sc.next().charAt(0);
						boolean ef = false;
						if (cg == 's' || cg == 'S') {
							ef = true;
						}
						System.out.println("¿de que tipo es? ");
						System.out.println("tecnologia TE");
						System.out.println("turismo TU");
						System.out.println("medio ME");
						String tip = sc.nextLine();
						TipoEmpresa te = TipoEmpresa.MEDIO_COMUNICACION;
						if (tip == "TE" || tip == "te") {
							te = TipoEmpresa.TECNOLOGIA;
						} else if (tip == "TU" || tip == "tu") {
							te = TipoEmpresa.TURISMO;
						} else if (tip == "ME" || tip == "me") {
							te = TipoEmpresa.MEDIO_COMUNICACION;
						}
						gt.insertarTourEm(cod2, n2, lp2, f2r, f2s, p2, co.getListaTours(), ne, ef, te);
						break;
					default:
						break;
					}

					System.out.println("desea insertar otro tour");
					opp1 = sc.next().charAt(0);
				} while (opp1 == 's');
             break;
			case 3:
				System.out.println("Digite el codigo del tour que desea modificar");
				long code = sc.nextLong();
				gt.ModificarTour(code, co.getListaTours());

				break;
			case 4:
				System.out.println("digite el codigo que desea buscar");
				long codb = sc.nextLong();
				Tour aux = gt.buscarTour(codb, co.getListaTours());
				if (gt.buscarTour(codb, co.getListaTours()) != null) {
					System.out.println(aux.toString());
				} else {
					System.out.println("no existe el tour");
				}
				break;
			case 5:

				System.out.println("digite el codigo que desea eliminar");
				long codE = sc.nextLong();
				if (gt.buscarTour(codE, co.getListaTours()) != null) {
					gt.eliminarTour(codE, co.getListaTours());
				} else {
					System.out.println("el tour no existe");
				}
				break;

			case 6:
				co.verListacliente();

				break;
			case 7:
				System.out.println("digite ID");
				long id = sc.nextLong();
				System.out.println("digite un nombre");
				String nombre = sc.nextLine();
				System.out.println("digite un telefono");
				String tel = sc.nextLine();
				gc.insertarCliente(id, nombre, tel, co.getListaClientes());
				break;

			case 8:
				System.out.println("digite el codigo del cliente");
				long codcli = sc.nextLong();
				if (gc.buscarCliente(codcli, co.getListaClientes()) != null) {
					gc.modificarCliente(co.getListaClientes(), codcli);
				} else {
					System.out.println("el cliente no existe");
				}
			case 9:
				System.out.println("digite el codigo a buscar");
				long codclib = sc.nextLong();
				if (gc.buscarCliente(codclib, co.getListaClientes()) != null) {
					System.out.println(gc.buscarCliente(codclib, co.getListaClientes()).toString());
				}
				break;
			case 10:
				System.out.println("digite el codigo del cliente ");
				long cod = sc.nextLong();
				if (gc.buscarCliente(cod, co.getListaClientes()) != null) {
					gc.eliminarCliente(cod, co.getListaClientes());
					;
				} else {
					System.out.println("no se pudo eliminar");
				}

				break;
			case 11:
				co.reservartour();
				break;
			case 12:
				co.modificarreserva();
			case 13:
				
                co.eliminarreserva();
				break;
			case 14:
				co.verreservas();
				break;
			case 15:
				System.out.println("codigo tour");
				long ct=sc.nextLong();
				System.out.println("digite el dia");
				int d=sc.nextInt();
				System.out.println("digite el mes");
				int m=sc.nextInt();
				System.out.println("digite el año");
				int a=sc.nextInt();
				Calendar tfe=Calendar.getInstance();
				tfe.set(Calendar.HOUR_OF_DAY, 0);
				tfe.set(Calendar.MINUTE, 0);
				tfe.set(Calendar.SECOND, 0);
				tfe.set(Calendar.MILLISECOND, 0);
				tfe.set(a, m-1, d);
				co.verreserva(ct, tfe);
				break;
			default:
				break;
			}

		} while (op != 16);

	}
}

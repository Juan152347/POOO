package control;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

import entity.Ecologico;
import entity.Empresarial;
import entity.Tour;
import enu.TipoEmpresa;

public class GestionTours {
	public boolean insertarTour(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso,
			Date fechaSalida, double precio, HashMap<Long, Tour> listatours) {

		ControlAgencia ca = new ControlAgencia();
		Tour ntour = new Tour(nombreComercial, lugarPartida, fechaRegreso, fechaSalida, precio);

		if (ca.validarTour(codigoIdentidad) == true) {
			listatours.put(codigoIdentidad, ntour);

		}
		if (ca.validarTour(codigoIdentidad) == false) {
			System.out.println("codigo no permitido");
			return false;
		}
		return true;
	}
	public boolean insertarTourEc(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso,
			Date fechaSalida, double precio, HashMap<Long, Tour> listatours,boolean vacunacionRequerida,double impuestoLocal,boolean dificilAcceso) {

		ControlAgencia ca = new ControlAgencia();
		Ecologico ntour = new Ecologico(nombreComercial, lugarPartida, fechaRegreso, fechaSalida, precio,vacunacionRequerida,impuestoLocal,dificilAcceso);

		if (ca.validarTour(codigoIdentidad) == true) {
			listatours.put(codigoIdentidad, ntour);

		}
		if (ca.validarTour(codigoIdentidad) == false) {
			System.out.println("codigo no permitido");
			return false;
		}
		return true;
	}
	public boolean insertarTourEm(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso,
			Date fechaSalida, double precio, HashMap<Long, Tour> listatours,String nombreEmpresa,boolean viajeroFrecuente,TipoEmpresa tipo) {

		ControlAgencia ca = new ControlAgencia();
		Empresarial ntour = new Empresarial(nombreComercial, lugarPartida, fechaRegreso, fechaSalida, precio,nombreEmpresa,viajeroFrecuente,tipo);

		if (ca.validarTour(codigoIdentidad) == true) {
			listatours.put(codigoIdentidad, ntour);

		}
		if (ca.validarTour(codigoIdentidad) == false) {
			System.out.println("codigo no permitido");
			return false;
		}
		return true;
	}
	public void ModificarTour(long codigo, HashMap<Long, Tour> listatours) {

		Scanner x = new Scanner(System.in);
		int p = 0;
		if (VerificarExistencia(codigo, listatours)) {
			do {

				System.out.println("Marque el numero de la opcion que desea modificar:");
				System.out.println("1.Codigo");
				System.out.println("2.Nombre Comercial");
				System.out.println("3.Fecha Regreso");
				System.out.println("4.Fecha Salida");
				System.out.println("5.Precio");
				System.out.println("6.Lugar Partida");
				System.out.println("7.Salir");

				System.out.println("Ingrese que opcion desa modificar: ");
				p = x.nextInt();
				switch (p) {

				case 1:
					System.out.println("Ingrese su nuevo codigo de identificación: ");
					long cod = x.nextLong();
					Tour aux = new Tour();
					aux = listatours.get(codigo);
					listatours.remove(codigo);
					listatours.put(cod, aux);
					break;

				case 2:
					System.out.println("Ingrese su nuevo nombre comercial: ");
					listatours.get(codigo).setNombreComercial(x.nextLine());
					break;
				case 3:
					System.out.println("Ingrese año de regreso:");
					int ano = x.nextInt();
					System.out.println("Ingrese mes de regreso:");
					int mes = x.nextInt();
					System.out.println("Ingrese dia de regreso:");
					int dia = x.nextInt();
					Calendar cal = Calendar.getInstance();
					cal.set(ano, mes, dia);
					cal.setTimeInMillis(0);
					Date dat = cal.getTime();

					listatours.get(codigo).setFechaRegreso(dat);
					break;

				case 6:
					System.out.println("ingrese su nuevo lugar de partida: ");
					listatours.get(codigo).setLugarPartida(x.nextLine());

				case 4:
					System.out.println("Ingrese fecha de salida");
					System.out.println();
					System.out.println("Ingrese año de regreso:");
					int ano1 = x.nextInt();
					System.out.println("Ingrese mes de regreso:");
					int mes1 = x.nextInt();
					System.out.println("Ingrese dia de regreso:");
					int dia1 = x.nextInt();
					Calendar cal1 = Calendar.getInstance();
					cal1.set(ano1, mes1, dia1);
					cal1.setTimeInMillis(0);
					Date dat1 = cal1.getTime();
					listatours.get(codigo).setFechaSalida(dat1);
					break;

				case 5:
					System.out.println("Ingrese su nuevo precio: ");
					listatours.get(codigo).setPrecio(x.nextDouble());
					break;

				}

			} while (p != 7);
		}

		else {
			System.out.println("El Tour solicitado no existe");
		}
	}

	public Tour buscarTour(long cod, HashMap<Long, Tour> listatours) {
		return listatours.get(cod);
	}

	public boolean VerificarExistencia(long codigo, HashMap<Long, Tour> listaTours) {
		if (listaTours.get(codigo) != null) {
			return true;
		} else {
			return false;
		}
	}

	public void eliminarTour(long cod, HashMap<Long, Tour> listatours) {
		listatours.remove(cod);
	}

}

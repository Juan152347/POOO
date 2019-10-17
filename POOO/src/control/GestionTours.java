package control;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

import entity.Tour;

public class GestionTours {
	public boolean insertarTour(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso, Date fechaSalida,
			double precio,HashMap<Long,Tour> listatours) {
		
		ControlAgencia ca = new ControlAgencia();
		Tour ntour = new Tour(nombreComercial,lugarPartida,fechaRegreso,fechaSalida,precio);
		
		
		if (ca.validarTour(codigoIdentidad) == true) {
			listatours.put(codigoIdentidad, ntour);
			
		}
		if (ca.validarTour(codigoIdentidad) == false) {
			System.out.println("codigo no permitido");
			return false;
		}
		return true;
	}
	public void ModificarTour(long codigo, HashMap<Long,Tour> listatours) {

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
					System.out.println("Ingrese su nuevo codigo de identificaci�n: ");
					long cod=x.nextLong();
					Tour aux=new Tour();
					aux=listatours.get(codigo);
					listatours.remove(codigo);
					listatours.put(cod, aux);	
					break;

				case 2:
					System.out.println("Ingrese su nuevo nombre comercial: ");
					listatours.get(codigo).setNombreComercial(x.nextLine());
					break;
				case 3:
					System.out.println("Ingrese a�o de regreso:");
					//listatours.get(codigo).setFechaRegreso();
					int ano=x.nextInt();
					System.out.println("Ingrese mes de regreso:");
					int mes=x.nextInt();
					System.out.println("Ingrese dia de regreso:");
					int dia=x.nextInt();
					Calendar cal= Calendar.getInstance();
					cal.set(ano, mes, dia);
					cal.setTimeInMillis(0);
					Date dat=new Date();
					 dat=cal.getTime();
					//listatours.get(codigo).setFechaRegreso(fechaRegreso);
					break;

				case 6:
					System.out.println("ingrese su nuevo lugar de partida: ");
					listatours.get(codigo).setLugarPartida(x.nextLine());
					

				case 4:
					System.out.println("Ingrese nu nueva hora de partida:");
					
					break;

				case 5:
					System.out.println("Ingrese su nuevo precio: ");
					
					break;

				}

			} while (p != 7);
		}

		else {
			System.out.println("El Tour solicitado no existe");
		}
	}
	public boolean VerificarExistencia(long codigo, HashMap<Long,Tour> listaTours) {
		if (listaTours.get(codigo)!=null) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

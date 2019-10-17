package control;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import entity.Tour;

public class GestionTours {
	public boolean insertarTour(long codigoIdentidad, String nombreComercial, String lugarPartida, Date fechaRegreso, Date fechaSalida,
			double precio,HashMap<Integer,Tour> listatours) {
		int cont=0;
		ControlAgencia ca = new ControlAgencia();
		Tour ntour = new Tour(codigoIdentidad,nombreComercial, lugarPartida, fechaRegreso, fechaSalida,precio);
		
		
		if (ca.validarTour(codigoIdentidad) == true) {
			listatours.put(cont, ntour);
		}
		if (ca.validarTour(codigoIdentidad) == false) {
			System.out.println("codigo no permitido");
			return false;
		}
		return true;
	}
	public void ModificarTour(long codigo, HashMap<Integer,Tour> listatours) {

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
					long cod=x.nextLong();
					
					
					break;

				case 2:
					System.out.println("Ingrese su nuevo nombre comercial: ");
					
					break;

				case 3:
					System.out.println("ingrese su nuevo lugar de partida: ");
					

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
	public boolean VerificarExistencia(long codigo, HashMap<Integer,Tour> listaTours) {
		for (Tour tour : listaTours.values()) {
			if (codigo == tour.getCodigoIdentidad()) {
				return true;
			}

		}
		return false;
	}
	
	
}

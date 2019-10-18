package control;

import java.util.HashMap;
import java.util.Scanner;

import entity.Cliente;

public class GestionCliente {
	public void insertarCliente(Long cod, String nombre, String telefono, HashMap<Long, Cliente> listaclientes) {
		Cliente ncli = new Cliente(nombre, telefono);
		listaclientes.put(cod, ncli);
	}

	public boolean verificarexistencia(HashMap<Long, Cliente> listaclientes, long cod) {
		if (listaclientes.get(cod) != null) {
			return true;
		} else {
			return false;
		}
	}

	public void modificarCliente(HashMap<Long, Cliente> listaclientes, long cod) {
		int op = 0;
		Scanner sc=new Scanner(System.in);
		if (verificarexistencia(listaclientes, cod)) {
			do {
				System.out.println("¿que desea modificar?");
				System.out.println("1.codigo de identificacion");
				System.out.println("2.nombre completo");
				System.out.println("3.telefono de contacto");
				System.out.println("4.salir");
				op=sc.nextInt();
				switch (op) {
				case 1:
                    System.out.println("digite el codigo de identificacion");
                    long a=sc.nextLong();
                    Cliente aux=listaclientes.get(cod);
                    listaclientes.remove(cod);
                    listaclientes.put(a, aux);
                    cod=a;
					break;
				case 2:
					System.out.println("digite el nombre completo");
					listaclientes.get(cod).setNombrecompleto(sc.nextLine());
					break;
				case 3:
					System.out.println("digite el telefono de contacto");
					listaclientes.get(cod).setTelefonodecontacto(sc.nextLine());
					break;
				default:
					break;
				}
			} while (op != 4);
		}
	}
}

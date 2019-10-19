package entity;
import java.lang.Math;
import enu.TipoTransporte;

public class Transporte extends ServicioAdicional {

	private double distancia;
	private TipoTransporte tipo;
	private int numeroPasajeros;

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public TipoTransporte getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransporte tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public Transporte( String descripcion, double precio, double distancia, TipoTransporte tipo,
			int numeroPasajeros) {

		super(descripcion, precio);
		this.distancia = distancia;
		this.tipo = tipo;
		this.numeroPasajeros = numeroPasajeros;
	}

	@Override
	public double calcularPrecio() {
		int cantbuses = (int)Math.ceil(this.numeroPasajeros / this.tipo.getCanpasajero());
		double aumento;

		
		if(tipo==TipoTransporte.TAXI) {
			precio = (distancia * precio);
			precio*=cantbuses;
		}
		
		if (tipo == TipoTransporte.MINIVAN) {

			precio = (distancia * precio);
			aumento = precio * 0.5;
			precio += aumento;
			precio*=cantbuses;
		}
		if (tipo == TipoTransporte.PARTILCULAR)	{

			precio = (distancia * precio);
			aumento = precio * 0.25;
			precio += aumento;
			precio*=cantbuses;

		}

		return precio;
	}

}

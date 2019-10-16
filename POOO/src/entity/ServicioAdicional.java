package entity;

public abstract class   ServicioAdicional {
 
	public long codigoServicio;
	public String descripcion;
	public double precioo;
	
	public abstract double calcularPrecio();
}

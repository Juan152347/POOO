package entity;

public abstract class   ServicioAdicional {
 
	public long codigoServicio;
	public String descripcion;
	public double precio;
	
	public abstract double calcularPrecio();
}

package entity;

public abstract class   ServicioAdicional {
 
	public long codigoServicio;
	public String descripcion;
	public double precio;
	
	
	public long getCodigoServicio() {
		return codigoServicio;
	}


	public void setCodigoServicio(long codigoServicio) {
		this.codigoServicio = codigoServicio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public ServicioAdicional(long codigoServicio, String descripcion, double precio) {
	
		this.codigoServicio = codigoServicio;
		this.descripcion = descripcion;
		this.precio = precio;
	}



	public abstract double calcularPrecio();
	
}

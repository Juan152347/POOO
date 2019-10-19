package entity;

public abstract class   ServicioAdicional {
 
	
	public String descripcion;
	public double precio;
	
	
	


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


	public ServicioAdicional( String descripcion, double precio) {
	
		this.descripcion = descripcion;
		this.precio = precio;
	}

    public String toString() {
    	return "descripcion:"+" "+this.descripcion+"/n"+"precio:"+" "+this.precio;
    }

	public abstract double calcularPrecio();
	
}

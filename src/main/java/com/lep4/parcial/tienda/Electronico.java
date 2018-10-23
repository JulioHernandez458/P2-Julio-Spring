package com.lep4.parcial.tienda;

public abstract class Electronico {
	
	private String nombre;
	private double precio;
	
	public Electronico() {
		super();
	}

	public Electronico(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return nombre + " - $"+ precio;
	}
	

}

package com.lep4.parcial.tienda;

public class Memoria extends Electronico{
	
	private int capacidad;

	
	
	public Memoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memoria(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public Memoria(int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	

}

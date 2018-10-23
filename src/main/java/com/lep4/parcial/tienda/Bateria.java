package com.lep4.parcial.tienda;

public class Bateria extends Electronico{
	
	private boolean recargable;

	public Bateria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bateria(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public Bateria(boolean recargable) {
		super();
		this.recargable = recargable;
	}

	public boolean isRecargable() {
		return recargable;
	}

	public void setRecargable(boolean recargable) {
		this.recargable = recargable;
	}
	
	

}

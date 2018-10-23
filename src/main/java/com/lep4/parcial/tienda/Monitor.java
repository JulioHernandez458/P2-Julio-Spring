package com.lep4.parcial.tienda;

public class Monitor extends Electronico {
	
	private String resolucion;
	private String tipo;
	
	
	
	public Monitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monitor(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	public Monitor(String resolucion, String tipo) {
		super();
		this.resolucion = resolucion;
		this.tipo = tipo;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}

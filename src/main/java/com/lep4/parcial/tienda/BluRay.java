package com.lep4.parcial.tienda;

import java.util.List;

public class BluRay extends Electronico{
	
	private List<String> peliculas;
	
	

	public BluRay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BluRay(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public BluRay(List<String> peliculas) {
		super();
		this.peliculas = peliculas;
	}

	public List<String> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<String> peliculas) {
		this.peliculas = peliculas;
	}
	
	

}

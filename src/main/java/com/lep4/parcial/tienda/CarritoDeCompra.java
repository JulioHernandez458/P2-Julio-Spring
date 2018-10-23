package com.lep4.parcial.tienda;

import java.util.List;

import com.lep4.parcial.tienda.Electronico;

public class CarritoDeCompra {
	

	private List<Electronico> lista;
	private int numero;
	
	
	
	public CarritoDeCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarritoDeCompra(List<Electronico> lista, int numero) {
		super();
		this.lista = lista;
		this.numero = numero;
	}
	public List<Electronico> getLista() {
		return lista;
	}
	public void setLista(List<Electronico> lista) {
		this.lista = lista;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}

package com.lep4.parcial.tienda;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lep4.restaurante.Comida;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new GenericXmlApplicationContext("app-context.xml");

    	CarritoDeCompra carroA = new CarritoDeCompra();
    	CarritoDeCompra carroB = new CarritoDeCompra();
    	
    	ArrayList<Electronico> detalle1 = new ArrayList<Electronico>();
    	ArrayList<Electronico> detalle2 = new ArrayList<Electronico>();

    	Electronico bateria = (Electronico) context.getBean("bateria");
    	Electronico memoria = (Electronico) context.getBean("memoria");
    	Electronico memoria = (<electronica) context.getBean("memoria");
    	Electronico bluray = (Electronica) context.getBean("bluray");
    	Electronico monitor = (Electronica) context.getBean("monitor");

    }
}

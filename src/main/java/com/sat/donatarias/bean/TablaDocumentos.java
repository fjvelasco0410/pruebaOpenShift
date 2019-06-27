package com.sat.donatarias.bean;

import java.util.Base64;

public class TablaDocumentos {
	
	private String nombre;
	private Integer tamanio;
	private Base64 pdf;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getTamanio() {
		return tamanio;
	}
	
	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}
	
	public Base64 getPdf() {
		return pdf;
	}
	
	public void setPdf(Base64 pdf) {
		this.pdf = pdf;
	}

}

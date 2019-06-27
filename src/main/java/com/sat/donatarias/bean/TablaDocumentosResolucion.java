package com.sat.donatarias.bean;

import java.util.Base64;

public class TablaDocumentosResolucion {
	
	private String nombre;
	private Integer tamanio;
	private Base64 pdf;
	private TipoSolicitudBean tipoSolicitudBean;
	
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
	
	public TipoSolicitudBean getTipoSolicitudBean() {
		return tipoSolicitudBean;
	}
	
	public void setTipoSolicitudBean(TipoSolicitudBean tipoSolicitudBean) {
		this.tipoSolicitudBean = tipoSolicitudBean;
	}
	
}

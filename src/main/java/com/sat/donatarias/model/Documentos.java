package com.sat.donatarias.model;

import java.util.Base64;

public class Documentos {
	
	private int idDocumentos;
	private String nombre;
	private Long tamanio;
	private TipoSolicitud tipoSolicitud;
	private Base64 pdf; 
	
	public int getIdDocumentos() {
		return idDocumentos;
	}
	
	public void setIdDocumentos(int idDocumentos) {
		this.idDocumentos = idDocumentos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getTamanio() {
		return tamanio;
	}
	
	public void setTamanio(Long tamanio) {
		this.tamanio = tamanio;
	}
	
	public TipoSolicitud getTipoSolicitud() {
		return tipoSolicitud;
	}
	
	public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public Base64 getPdf() {
		return pdf;
	}

	public void setPdf(Base64 pdf) {
		this.pdf = pdf;
	}
	
}

package com.sat.donatarias.bean;

import java.util.Date;

public class TipoSolicitudBean {
	
	public TipoSolicitudBean() {
		super();
	}

	private String rfc;
	private Date fechaInicio;
	private Date fechaFin;
	private String estadoProcesal;
	private String numeroAsunto;
	private String tipoSolicitud;
	private String razonSocial;
	private String numeroExpediente;
	
	public String getRfc() {
		return rfc;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public String getNumeroAsunto() {
		return numeroAsunto;
	}
	
	public void setNumeroAsunto(String numeroAsunto) {
		this.numeroAsunto = numeroAsunto;
	}
	
	
	public String getEstadoProcesal() {
		return estadoProcesal;
	}

	public void setEstadoProcesal(String estadoProcesal) {
		this.estadoProcesal = estadoProcesal;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getRazonSocial() {
		return razonSocial;
	}
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	public String getNumeroExpediente() {
		return numeroExpediente;
	}
	
	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	
}

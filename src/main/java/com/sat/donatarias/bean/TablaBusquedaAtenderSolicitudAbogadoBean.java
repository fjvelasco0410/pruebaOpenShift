package com.sat.donatarias.bean;

import java.util.Date;

public class TablaBusquedaAtenderSolicitudAbogadoBean {
		
	public TablaBusquedaAtenderSolicitudAbogadoBean() {
		super();
	}

	private String numeroAsunto;
	private Date fechaHoraRecepcion;
	private String tipoSolicitud;
	private String tipoContribuyente;
	private String datosContribuyente;
	
	public String getNumeroAsunto() {
		return numeroAsunto;
	}
	
	public void setNumeroAsunto(String numeroAsunto) {
		this.numeroAsunto = numeroAsunto;
	}
	
	public Date getFechaHoraRecepcion() {
		return fechaHoraRecepcion;
	}
	
	public void setFechaHoraRecepcion(Date fechaHoraRecepcion) {
		this.fechaHoraRecepcion = fechaHoraRecepcion;
	}
	
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	
	public String getTipoContribuyente() {
		return tipoContribuyente;
	}
	
	public void setTipoContribuyente(String tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}
	
	public String getDatosContribuyente() {
		return datosContribuyente;
	}
	
	public void setDatosContribuyente(String datosContribuyente) {
		this.datosContribuyente = datosContribuyente;
	}

}

package com.sat.donatarias.bean;

public class DatosSolicitudBean {
	
	private Boolean establecimientos;
	private TablaDomicilioEstablecimientosBean TablaDomicilioEstablecimientosBean;
	private String solicitaAutorizacionCondicionada;
	private String solicitaAutorizacion;
	private Boolean infPoporcionada;
	private String comentarios;
	
	public Boolean getEstablecimientos() {
		return establecimientos;
	}
	
	public void setEstablecimientos(Boolean establecimientos) {
		this.establecimientos = establecimientos;
	}
	
	public TablaDomicilioEstablecimientosBean getTablaDomicilioEstablecimientosBean() {
		return TablaDomicilioEstablecimientosBean;
	}
	
	public void setTablaDomicilioEstablecimientosBean(
			TablaDomicilioEstablecimientosBean tablaDomicilioEstablecimientosBean) {
		TablaDomicilioEstablecimientosBean = tablaDomicilioEstablecimientosBean;
	}
	
	public String getSolicitaAutorizacionCondicionada() {
		return solicitaAutorizacionCondicionada;
	}
	
	public void setSolicitaAutorizacionCondicionada(String solicitaAutorizacionCondicionada) {
		this.solicitaAutorizacionCondicionada = solicitaAutorizacionCondicionada;
	}
	
	public String getSolicitaAutorizacion() {
		return solicitaAutorizacion;
	}
	
	public void setSolicitaAutorizacion(String solicitaAutorizacion) {
		this.solicitaAutorizacion = solicitaAutorizacion;
	}
	
	public Boolean getInfPoporcionada() {
		return infPoporcionada;
	}
	
	public void setInfPoporcionada(Boolean infPoporcionada) {
		this.infPoporcionada = infPoporcionada;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
}

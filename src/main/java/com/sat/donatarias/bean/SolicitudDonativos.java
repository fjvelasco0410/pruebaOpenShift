package com.sat.donatarias.bean;

import java.util.List;

public class SolicitudDonativos {
	
	 private boolean cuentaEstablecimientos; 
	 private boolean autorizacionControlada; 
	 private String  solicitaAutorizacionEn; 
	 private String  actividadRealiza; 
	 private String  comentarios; 
	 private List<ArchivoSolicitud> listaArchivos;
	 private List<DomicilioSolicitud> listaDomicilios; 
	 
	 
	public boolean isCuentaEstablecimientos() {
		return cuentaEstablecimientos;
	}
	public void setCuentaEstablecimientos(boolean cuentaEstablecimientos) {
		this.cuentaEstablecimientos = cuentaEstablecimientos;
	}
	public boolean isAutorizacionControlada() {
		return autorizacionControlada;
	}
	public void setAutorizacionControlada(boolean autorizacionControlada) {
		this.autorizacionControlada = autorizacionControlada;
	}
	public String getSolicitaAutorizacionEn() {
		return solicitaAutorizacionEn;
	}
	public void setSolicitaAutorizacionEn(String solicitaAutorizacionEn) {
		this.solicitaAutorizacionEn = solicitaAutorizacionEn;
	}
	public String getActividadRealiza() {
		return actividadRealiza;
	}
	public void setActividadRealiza(String actividadRealiza) {
		this.actividadRealiza = actividadRealiza;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public List<ArchivoSolicitud> getListaArchivos() {
		return listaArchivos;
	}
	public void setListaArchivos(List<ArchivoSolicitud> listaArchivos) {
		this.listaArchivos = listaArchivos;
	}
	public List<DomicilioSolicitud> getListaDomicilios() {
		return listaDomicilios;
	}
	public void setListaDomicilios(List<DomicilioSolicitud> listaDomicilios) {
		this.listaDomicilios = listaDomicilios;
	}
	 
	
	 

}

package com.sat.donatarias.bean;

public class ModificarDatosExpedienteAdministradorAbogadoBean {

	public ModificarDatosExpedienteAdministradorAbogadoBean() {
		super();
		
	}
	
	private String rfcContribuyente;
	private String denominacionRazonSocial; 
	private String numeroExpediente; 
	
	public String getRfcContribuyente() {
		return rfcContribuyente;
	}
	public void setRfcContribuyente(String rfcContribuyente) {
		this.rfcContribuyente = rfcContribuyente;
	}
	public String getDenominacionRazonSoacil() {
		return denominacionRazonSocial;
	}
	public void setDenominacionRazonSoacil(String denominacionRazonSoacil) {
		this.denominacionRazonSocial = denominacionRazonSoacil;
	}
	public String getNumeroExpediente() {
		return numeroExpediente;
	}
	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
}

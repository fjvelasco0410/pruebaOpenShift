package com.sat.donatarias.bean;

import java.util.Date;

public class RespuestaSolicitud {
	
	private String respuesta; 
	private Date fechaHoraFirmado;
	
	public String getRespuesta() {
		return respuesta;
	}
	
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public Date getFechaHoraFirmado() {
		return fechaHoraFirmado;
	}
	
	public void setFechaHoraFirmado(Date fechaHoraFirmado) {
		this.fechaHoraFirmado = fechaHoraFirmado;
	} 
	
	

}

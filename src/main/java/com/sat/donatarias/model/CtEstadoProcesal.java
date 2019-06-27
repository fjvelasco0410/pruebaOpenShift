package com.sat.donatarias.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CtEstadoProcesal {
	
	@Id
	private Integer idEstadoProcesal;
	@Column
	private String descripcion;
	
	public Integer getIdEstadoProcesal() {
		return idEstadoProcesal;
	}
	
	public void setIdEstadoProcesal(Integer idEstadoProcesal) {
		this.idEstadoProcesal = idEstadoProcesal;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

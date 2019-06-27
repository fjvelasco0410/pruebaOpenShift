package com.sat.donatarias.service;

import java.util.List;

import com.sat.donatarias.model.EstadoProcesal;

public interface EstadoProcesalService {

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @return List<EstadoProcesal> lista del catalogo de estado procesal
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	List<EstadoProcesal> obtenListaEstadoProcesal();

}
package com.sat.donatarias.service;

import java.util.List;

import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.model.Documentos;

public interface DocumentosServices {

	/** Metodo que obtiene la lista de documentos de la resolucion
	 *  @param tipoSolicitudBean objeto que contiene los datos de la solicitud 
	 *  @return List<AdministradorFirma> la lista de documentos de la resolucion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	List<Documentos> obtenListaDocumento(TipoSolicitudBean tipoSolicitudBean);
	

}
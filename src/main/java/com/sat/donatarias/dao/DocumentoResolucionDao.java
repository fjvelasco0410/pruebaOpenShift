package com.sat.donatarias.dao;

import java.util.List;

import com.sat.donatarias.model.DocumentoResolucion;

public interface DocumentoResolucionDao {

	/** Metodo que obtiene la lista del catalogo de documentos resolucion
	 *  @return List<DocumentoResolucion> catalogo de documentos resolucion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	List<DocumentoResolucion> obtenListaDocumentoResolucion();

}
package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.dao.DocumentoResolucionDao;
import com.sat.donatarias.model.DocumentoResolucion;
import com.sat.donatarias.service.DocumentoResolucionService;

@Service
public class DocumentoResolucionServiceImpl implements DocumentoResolucionService {
	
	@Autowired
	DocumentoResolucionDao documentoResolucionDao;

	/** Metodo que obtiene la lista del catalogo de documentos resolucion
	 *  @return List<DocumentoResolucion> catalogo de documentos resolucion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<DocumentoResolucion> obtenListaDocumentoResolucion(){
		return documentoResolucionDao.obtenListaDocumentoResolucion();		
	}

}

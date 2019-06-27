package com.sat.donatarias.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.dao.DocumentoResolucionDao;
import com.sat.donatarias.model.DocumentoResolucion;

@Repository
public class DocumentoResolucionDaoImpl implements DocumentoResolucionDao {

	/** Metodo que obtiene la lista del catalogo de documentos resolucion
	 *  @return List<DocumentoResolucion> catalogo de documentos resolucion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<DocumentoResolucion> obtenListaDocumentoResolucion(){
		System.out.println("Entra a obtenListaDocumentoResolucion ");
		List<DocumentoResolucion> listaDocumentoResolucion = new ArrayList<DocumentoResolucion>();
		DocumentoResolucion documentoResolucion = new DocumentoResolucion();
		documentoResolucion.setIdDocumentoResolucion(1);
		documentoResolucion.setDescripcion("Prueba");
		listaDocumentoResolucion.add(documentoResolucion);
		return listaDocumentoResolucion;		
	}

}

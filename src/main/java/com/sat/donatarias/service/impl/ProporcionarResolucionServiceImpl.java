package com.sat.donatarias.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.dao.DocumentosDao;
import com.sat.donatarias.model.Documentos;
import com.sat.donatarias.service.ProporcionarResolucionService;

@Service
public class ProporcionarResolucionServiceImpl implements ProporcionarResolucionService {

	@Autowired
	DocumentosDao documentosDao;

	/** Metodo que obtiene la lista de documentos de la resolucion
	 *  @param documentos objeto que los datos de los documentos de una resolucion
	 *  @return true si la modificacion fue correcta
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public boolean modificaTipoSolicitud(Documentos documentos) {
		boolean es = documentosDao.modificaTipoSolicitud(documentos);		
		return es;		
	}

	/** Metodo que envia a firma la solicitud
	 *  @return true si no hubo problema en la modificacion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public boolean enviarFirma() { 
		boolean es = true;	
		return es;		
	}

}

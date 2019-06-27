package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.dao.DocumentosDao;
import com.sat.donatarias.model.Documentos;
import com.sat.donatarias.service.DocumentosServices;

@Service
public class DocumentosServicesImpl implements DocumentosServices {
	
	@Autowired
	DocumentosDao documentosDao;

	/** Metodo que obtiene la lista de documentos de la resolucion
	 *  @param tipoSolicitudBean objeto que contiene los datos de la solicitud 
	 *  @return List<AdministradorFirma> la lista de documentos de la resolucion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<Documentos> obtenListaDocumento(TipoSolicitudBean tipoSolicitudBean){
		return documentosDao.obtenListaDocumento(tipoSolicitudBean);
	}
	
}

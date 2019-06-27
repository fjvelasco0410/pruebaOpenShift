package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.dao.TipoSolicitudDao;
import com.sat.donatarias.model.TipoSolicitud;
import com.sat.donatarias.service.TipoSolicitudService;

@Service
public class TipoSolicitudServiceImpl implements TipoSolicitudService{
	
	@Autowired
	TipoSolicitudDao tipoSolicitudDao;

	/** Metodo que obtiene la lista del catalogo de tipo de solicitud
	 *  @return List<TipoSolicitud> lista de catalogo de tipo de solicitud
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	public List<TipoSolicitud> obtenListaTipoSolicitud (){
		return tipoSolicitudDao.obtenListaTipoSolicitud();
	}
	
	public void insertaTipoSolicitud(TipoSolicitud tipoSolicitud) {
		tipoSolicitudDao.insertaTipoSolicitud(tipoSolicitud);
	}
	
	public void modificarTipoSolicitud(TipoSolicitud tipoSolicitud) {
		tipoSolicitudDao.modificarTipoSolicitud(tipoSolicitud);
	}
	
	public void eliminarTipoSolicitud(TipoSolicitud tipoSolicitud) {
		tipoSolicitudDao.eliminarTipoSolicitud(tipoSolicitud);
	}
	
}

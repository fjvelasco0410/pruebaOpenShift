package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.bean.SolicitudBean;
import com.sat.donatarias.bean.TablaBusquedaAtenderSolicitudAbogadoBean;
import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.dao.AtencionSolicitudesAbogadoDao;
import com.sat.donatarias.service.AtencionSolicitudesAbogadoService;

@Service
public class AtencionSolicitudesAbogadoServiceImpl implements AtencionSolicitudesAbogadoService {
	
	@Autowired
	AtencionSolicitudesAbogadoDao atencionSolicitudesAbogadoDao;

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @param tipoSolicitudBean este objeto contiene los parametros para filtrar informacion
	 *  @return List<TablaBusquedaAtenderSolicitudAbogadoBean> lista que contienen los datos para la pantalla bandeja de seguimiento
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<TablaBusquedaAtenderSolicitudAbogadoBean> buscar(TipoSolicitudBean tipoSolicitudBean){
		return atencionSolicitudesAbogadoDao.buscar(tipoSolicitudBean);
	}

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @param tipoSolicitudBean este objeto contiene los parametros para filtrar informacion
	 *  @return SolicitudBean este objeto contiene los datos de la pantalla de solicitud
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public SolicitudBean consultarDatosSolicitud(TablaBusquedaAtenderSolicitudAbogadoBean tablaBusquedaAtenderSolicitudAbogado){
		return atencionSolicitudesAbogadoDao.consultarDatosSolicitud(tablaBusquedaAtenderSolicitudAbogado);
	}
	
}

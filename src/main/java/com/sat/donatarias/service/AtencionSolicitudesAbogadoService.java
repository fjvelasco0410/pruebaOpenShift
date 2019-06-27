package com.sat.donatarias.service;

import java.util.List;

import com.sat.donatarias.bean.SolicitudBean;
import com.sat.donatarias.bean.TablaBusquedaAtenderSolicitudAbogadoBean;
import com.sat.donatarias.bean.TipoSolicitudBean;

public interface AtencionSolicitudesAbogadoService {

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @param tipoSolicitudBean este objeto contiene los parametros para filtrar informacion
	 *  @return List<TablaBusquedaAtenderSolicitudAbogadoBean> lista que contienen los datos para la pantalla bandeja de seguimiento
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	List<TablaBusquedaAtenderSolicitudAbogadoBean> buscar(TipoSolicitudBean tipoSolicitudBean);

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @param tipoSolicitudBean este objeto contiene los parametros para filtrar informacion
	 *  @return SolicitudBean este objeto contiene los datos de la pantalla de solicitud
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	SolicitudBean consultarDatosSolicitud(TablaBusquedaAtenderSolicitudAbogadoBean tablaBusquedaAtenderSolicitudAbogado);
	
}
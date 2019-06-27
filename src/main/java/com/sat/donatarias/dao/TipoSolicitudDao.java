package com.sat.donatarias.dao;

import java.util.List;

import com.sat.donatarias.model.TipoSolicitud;

public interface TipoSolicitudDao {

	/** Metodo que obtiene la lista del catalogo de tipo de solicitud
	 *  @return List<TipoSolicitud> lista de catalogo de tipo de solicitud
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	List<TipoSolicitud> obtenListaTipoSolicitud();

	void insertaTipoSolicitud(TipoSolicitud tipoSolicitud);

	void modificarTipoSolicitud(TipoSolicitud tipoSolicitud);

	void eliminarTipoSolicitud(TipoSolicitud tipoSolicitud);

}
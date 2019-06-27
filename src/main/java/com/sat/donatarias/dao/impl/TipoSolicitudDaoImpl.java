package com.sat.donatarias.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.dao.TipoSolicitudDao;
import com.sat.donatarias.model.TipoSolicitud;

@Repository
public class TipoSolicitudDaoImpl implements TipoSolicitudDao {
	

	/** Metodo que obtiene la lista del catalogo de tipo de solicitud
	 *  @return List<TipoSolicitud> lista de catalogo de tipo de solicitud
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<TipoSolicitud> obtenListaTipoSolicitud (){
		List<TipoSolicitud> lstTipoSolicitud = new ArrayList<TipoSolicitud>();
		TipoSolicitud tipoSolicitud = new TipoSolicitud();
		tipoSolicitud.setIdTipoSolicitud(0);
		tipoSolicitud.setDescripcion("Selecciona");
		lstTipoSolicitud.add(tipoSolicitud);
		
		tipoSolicitud = new TipoSolicitud();
		tipoSolicitud.setIdTipoSolicitud(1);
		tipoSolicitud.setDescripcion("TipoSolicitud1");
		lstTipoSolicitud.add(tipoSolicitud);

		tipoSolicitud = new TipoSolicitud();
		tipoSolicitud.setIdTipoSolicitud(2);
		tipoSolicitud.setDescripcion("TipoSolicitud2");
		lstTipoSolicitud.add(tipoSolicitud);
		
		return lstTipoSolicitud;
	}
	
	@Override
	public void insertaTipoSolicitud(TipoSolicitud tipoSolicitud) {
		System.out.println("Insertar");
		System.out.println("id: " + tipoSolicitud.getIdTipoSolicitud());
		System.out.println("descripcion: " + tipoSolicitud.getDescripcion());
	}
	
	@Override
	public void modificarTipoSolicitud(TipoSolicitud tipoSolicitud) {
		System.out.println("modificar");
		System.out.println("id: " + tipoSolicitud.getIdTipoSolicitud());
		System.out.println("descripcion: " + tipoSolicitud.getDescripcion());
	}
	

	@Override
	public void eliminarTipoSolicitud(TipoSolicitud tipoSolicitud) {
		System.out.println("eliminar");
		System.out.println("id: " + tipoSolicitud.getIdTipoSolicitud());
		System.out.println("descripcion: " + tipoSolicitud.getDescripcion());
	}

}

package com.sat.donatarias.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.bean.SolicitudBean;
import com.sat.donatarias.bean.TablaBusquedaAtenderSolicitudAbogadoBean;
import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.dao.AtencionSolicitudesAbogadoDao;

@Repository
public class AtencionSolicitudesAbogadoDaoImpl implements AtencionSolicitudesAbogadoDao {

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @param tipoSolicitudBean este objeto contiene los parametros para filtrar informacion
	 *  @return List<TablaBusquedaAtenderSolicitudAbogadoBean> lista que contienen los datos para la pantalla bandeja de seguimiento
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<TablaBusquedaAtenderSolicitudAbogadoBean> buscar(TipoSolicitudBean tipoSolicitudBean){
		System.out.println("Entra a buscar " + tipoSolicitudBean.getNumeroAsunto());
		
		List<TablaBusquedaAtenderSolicitudAbogadoBean> lista = new ArrayList<TablaBusquedaAtenderSolicitudAbogadoBean>();
		TablaBusquedaAtenderSolicitudAbogadoBean tablaBusquedaAtenderSolicitudAbogado = new TablaBusquedaAtenderSolicitudAbogadoBean();
		tablaBusquedaAtenderSolicitudAbogado.setNumeroAsunto("Prueba");
		tablaBusquedaAtenderSolicitudAbogado.setFechaHoraRecepcion(new Date());
		tablaBusquedaAtenderSolicitudAbogado.setTipoSolicitud("Prueba");
		tablaBusquedaAtenderSolicitudAbogado.setTipoContribuyente("Prueba");
		tablaBusquedaAtenderSolicitudAbogado.setDatosContribuyente("Prueba");
		lista.add(tablaBusquedaAtenderSolicitudAbogado);
		
		return lista;
	}

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @param tipoSolicitudBean este objeto contiene los parametros para filtrar informacion
	 *  @return SolicitudBean este objeto contiene los datos de la pantalla de solicitud
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public SolicitudBean consultarDatosSolicitud(TablaBusquedaAtenderSolicitudAbogadoBean tablaBusquedaAtenderSolicitudAbogado){
		System.out.println("Entra a consultarDatosSolicitud " + tablaBusquedaAtenderSolicitudAbogado.getNumeroAsunto());
		
		SolicitudBean solicitudBean = new SolicitudBean();
		solicitudBean.setRfc("Prueba");
		solicitudBean.setDenominacionSocial("Prueba");
		solicitudBean.setFechaRecepcion(new Date());
		solicitudBean.setNumeroAsunto("Prueba");
		solicitudBean.setNumeroExpediente("Prueba");
		solicitudBean.setTipoSolicitud("Prueba");
		
		return solicitudBean;
	}
	
}

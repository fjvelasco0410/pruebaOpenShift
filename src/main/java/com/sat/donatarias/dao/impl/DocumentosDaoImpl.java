package com.sat.donatarias.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.dao.DocumentosDao;
import com.sat.donatarias.model.Documentos;
import com.sat.donatarias.model.TipoSolicitud;

@Repository
public class DocumentosDaoImpl implements DocumentosDao {

	/** Metodo que obtiene la lista de documentos de la resolucion
	 *  @param tipoSolicitudBean objeto que contiene los datos de la solicitud 
	 *  @return List<AdministradorFirma> la lista de documentos de la resolucion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<Documentos> obtenListaDocumento(TipoSolicitudBean tipoSolicitudBean){
		System.out.println("Entra a obtenListaDocumento");
		List<Documentos> listaDocumentos = new ArrayList<Documentos>();
		Documentos documentos = new Documentos();
		documentos.setIdDocumentos(1);
		documentos.setNombre("Prueba");
		documentos.setTamanio(1L);
		documentos.setTipoSolicitud(new TipoSolicitud());
		documentos.getTipoSolicitud().setIdTipoSolicitud(1);
		documentos.getTipoSolicitud().setDescripcion("Prueba");
		listaDocumentos.add(documentos);
		return listaDocumentos;
	}

	/** Metodo que modifica el tipo de solicitud
	 *  @param documentos objeto que contiene los documentos 
	 *  @return true si se modifico correctamente
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public boolean modificaTipoSolicitud(Documentos documentos) {
		System.out.println("Entra a modificaTipoSolicitud");
		boolean es = true;
		return es;		
	}
	
}

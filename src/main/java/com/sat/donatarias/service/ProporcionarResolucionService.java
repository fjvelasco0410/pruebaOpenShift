package com.sat.donatarias.service;

import com.sat.donatarias.model.Documentos;

public interface ProporcionarResolucionService {

	/** Metodo que obtiene la lista de documentos de la resolucion
	 *  @param documentos objeto que los datos de los documentos de una resolucion
	 *  @return true si la modificacion fue correcta
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	boolean modificaTipoSolicitud(Documentos documentos);

	/** Metodo que envia a firma la solicitud
	 *  @return true si no hubo problema en la modificacion
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	boolean enviarFirma();

}
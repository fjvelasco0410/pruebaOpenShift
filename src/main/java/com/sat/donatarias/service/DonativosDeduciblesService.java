package com.sat.donatarias.service;

import java.util.List;


import com.sat.donatarias.bean.AutorizacionSolicitud;
import com.sat.donatarias.bean.ContribuyenteAmpliado;
import com.sat.donatarias.bean.RespuestaSolicitud;
import com.sat.donatarias.bean.SolicitudDonativos;
import com.sat.donatarias.bean.StringResponse;
import com.sat.donatarias.model.DTOActividades;
import com.sat.donatarias.model.DTOCodigoPostal;
import com.sat.donatarias.model.DTOEstados;
import com.sat.donatarias.model.DTOMunicipio;
import com.sat.donatarias.model.DTOTipoSolicitud;

public interface DonativosDeduciblesService {
	
	/** Metodo que se utiliza para recuperar los datos del contribuyente a traves del 
	 *  ws RFC ampliado 
	 *  @param rfc: rfc del que se va a recuperar los datos 
	 *  @return ContribuyenteAmpliado objeto que contiene los datos recuperados 
	 *  del contribuyente 
	 *  @author Francisco Javier Velasco 
	 *  @since 19/06/2019 
	 * */
	public ContribuyenteAmpliado validaUsuarioRfcAmpliado(String rfc); 
	
	/** Metodo que se utiliza para guardar la informacion de la solicitud de donatarias 
	 *  @param listaDomicilios lista con los objetos de domicilio que se va a guardar 
	 *  @return RespuestaSolicitud objeto que se manda con la respuesta del estatus del guardado 
	 *  @author Francisco Javier Velasco 
	 *  @since 19/06/2019  
	 * */
	public RespuestaSolicitud guardaSolicitudDonativos(SolicitudDonativos objSolicitudDonativos);
	
	
	/** Metodo que se utiliza para consultar los tipo de solicitud  
	 *  @return List<String> lista de tipos de solicitud que se encontraron
	 *  @author Francisco Javier Velasco 
	 *  @since 19/06/2019 
	 * */
	public List<DTOTipoSolicitud> consultaTipoSolicitud();
	
	
	/** Metodo que se utiliza pra validar el tipo de autorizacion que desea realizar un contribuyente 
	 *  @return StringResponse objeto que contiene la respuesta de la validacion 
	 *  @param solicitud: objeto que contiene tipo de solicitud y rfc para realizar la busqueda 
	 *  @author Francisco Javier Velasco 
	 *  @since 24/06/2019 
	 * */
	public StringResponse validaAutorizacion(AutorizacionSolicitud solicitud); 
	
	
	/**	Metodo que se utiliza para recuperar los tipos de actividades 
	 *  @return List<DTOActividades> lista de actividades recuperadas 
	 *  @since 24/06/2019 
	 * */
	
	public List<DTOActividades> consultaActividades(); 
	
	
	/** Metodo que se utiliza para obtener los estados de Mexico 
	 *  @return List<DTOEstados> lista de estados obtenida 
	 *  @since 25/06/2019 
	 * */
	public List<DTOEstados> consultaEstados(); 
	
	
	/** Metodo que se utiliza para obtener los municipios de un estado 
	 *  @return List<DTOMunicipio> lista de municipios  obtenida
	 *  @param idEstado id del estado del que se van a buscar los municipios  
	 *  @since 25/06/2019 
	 * */
	public List<DTOMunicipio> consultaMunicipios(String idEstado); 
	
	
	/** Metodo que se utiliza para obtener el codigo postal de una municipio 
	 *  @param idMunicipio id del municipio del que se van a buscar los codigos postales 
	 *  @return List<DTOMunicipio> lista de municipios  obtenida 
	 *  @since 25/06/2019 
	 * */
	public List<DTOCodigoPostal> consultaCodigoPostal(String idMunicipio); 
	
	
	
	
}

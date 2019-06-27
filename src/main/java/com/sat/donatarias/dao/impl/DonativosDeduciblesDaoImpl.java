package com.sat.donatarias.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.bean.ArchivoSolicitud;
import com.sat.donatarias.bean.AutorizacionSolicitud;
import com.sat.donatarias.bean.ContribuyenteAmpliado;
import com.sat.donatarias.bean.DomicilioSolicitud;
import com.sat.donatarias.bean.RespuestaSolicitud;
import com.sat.donatarias.bean.SolicitudDonativos;
import com.sat.donatarias.bean.StringResponse;
import com.sat.donatarias.dao.DonativosDeduciblesDao;
import com.sat.donatarias.model.DTOActividades;
import com.sat.donatarias.model.DTOCodigoPostal;
import com.sat.donatarias.model.DTOEstados;
import com.sat.donatarias.model.DTOMunicipio;
import com.sat.donatarias.model.DTOTipoSolicitud;

@Repository
public class DonativosDeduciblesDaoImpl implements DonativosDeduciblesDao{

	@Override
	public ContribuyenteAmpliado validaUsuarioRfcAmpliado(String rfc) {
		ContribuyenteAmpliado contribuyente=new ContribuyenteAmpliado(); 
		contribuyente.setContribuyenteAmpliado(true);
		contribuyente.setTipoContribuyenyte("Federación, Entidad Federativa o Municipios, Organismos Descentralizados ");
		contribuyente.setRfcContribuyente("JAVF901004HS7");
		contribuyente.setCalle("Corola");
		contribuyente.setColonia("El reloj");
		contribuyente.setRazonSocial("Sinergia S.A. DE C.V.");
		contribuyente.setNumExterior("12");
		contribuyente.setNumInterior("990");
		contribuyente.setCp("56619");
		contribuyente.setMedioContacto("francisco.javier@sng.biz");
		contribuyente.setCorreo("francisco.javier@sng.biz");
		contribuyente.setTelefono("5538015935");
		contribuyente.setDelegacion("Coyoacan");
		contribuyente.setEntidadFederativa("CDMX");
		contribuyente.setRepresentanteLegal("Efrain Vazquez Villanueva");
		contribuyente.setAdminDesconcentrada("Administracion Desconcentrada");
		return contribuyente; 		
	}

	@Override
	public RespuestaSolicitud guardaSolicitudDonativos(SolicitudDonativos objSolicitudDonativos) {
		RespuestaSolicitud objRespuestaSolicitud=new RespuestaSolicitud(); 
		List<DomicilioSolicitud> listaDomicilios=objSolicitudDonativos.getListaDomicilios(); 
		List<ArchivoSolicitud> listaArchivos=objSolicitudDonativos.getListaArchivos(); 
		
		for(DomicilioSolicitud domicilio:listaDomicilios) {
			System.out.println("guardar cada uno de los domicilios "+domicilio.getCalle());
		}
		
		for(ArchivoSolicitud archivo:listaArchivos) {
			System.out.println("Guardar cada una de la lista de archivos"+archivo.getNombre());
		}
		
		objRespuestaSolicitud.setFechaHoraFirmado(new Date());
		objRespuestaSolicitud.setRespuesta("Registrada");
		return objRespuestaSolicitud; 
	}

	@Override
	public List<DTOTipoSolicitud> consultaTipoSolicitud() {
		List<DTOTipoSolicitud> listaSolicitud=new ArrayList<DTOTipoSolicitud>(); 
		DTOTipoSolicitud tipoSolicitud1=new DTOTipoSolicitud(); 
		String tipo1="Solicitud de autorización para recibir donativos..."; 
		String tipoCompleto1="Solicitud de autorización para recibir donativos deducibles del impuesto sobre la renta"; 
		String descripcion1="1. Es aquella promoción presentada por organizaciones civiles y fideicomisos que solicitan por primera vez la autorización para recibir donativos deducibles del impuesto sobre la renta.";
		tipoSolicitud1.setId(1);
		tipoSolicitud1.setTipo(tipo1);
		tipoSolicitud1.setDescripcion(descripcion1);
		tipoSolicitud1.setTipoCompleto(tipoCompleto1);
		listaSolicitud.add(tipoSolicitud1);
		
		DTOTipoSolicitud tipoSolicitud2=new DTOTipoSolicitud(); 
		String tipo2="Solicitud de nueva autorización para recibir donativos...";
		String tipoCompleto2="Solicitud de nueva autorización para recibir donativos deducibles del impuesto sobre la renta";
		String descripcion2="2. Es aquella promoción presentada por organizaciones civiles y fideicomisos que solicitan por primera vez la autorización para recibir donativos deducibles del impuesto sobre la renta.";
		tipoSolicitud2.setId(2);
		tipoSolicitud2.setTipo(tipo2);
		tipoSolicitud2.setDescripcion(descripcion2);
		tipoSolicitud2.setTipoCompleto(tipoCompleto2);
		listaSolicitud.add(tipoSolicitud2);
		
		DTOTipoSolicitud tipoSolicitud3=new DTOTipoSolicitud(); 
		String tipo3="Solicitud de autorización para aplicar los donativos ... ";
		String tipoCompleto3="Solicitud de autorización para aplicar los donativos deducibles que reciba a la realización de actividades adicionales ";
		String descripcion3="3. Es aquella promoción presentada por organizaciones civiles y fideicomisos que solicitan por primera vez la autorización para recibir donativos deducibles del impuesto sobre la renta.";
		tipoSolicitud3.setId(3);
		tipoSolicitud3.setTipo(tipo3);
		tipoSolicitud3.setTipoCompleto(tipoCompleto3);
		tipoSolicitud3.setDescripcion(descripcion3);
		listaSolicitud.add(tipoSolicitud3);
		
		DTOTipoSolicitud tipoSolicitud4=new DTOTipoSolicitud(); 
		String tipo4="Solicitud de autorización para aplicar los donativos... ";
		String tipoCompleto4="Solicitud de autorización para aplicar los donativos que reciba a la educación de otros niveles, grados o carreras que cuenten con autorización o reconocimiento de validez oficial de estudios ";
		String descripcion4="4. Es aquella promoción presentada por organizaciones civiles y fideicomisos que solicitan por primera vez la autorización para recibir donativos deducibles del impuesto sobre la renta.";
		tipoSolicitud4.setId(4);
		tipoSolicitud4.setTipo(tipo4);
		tipoSolicitud4.setTipoCompleto(tipoCompleto4);
		tipoSolicitud4.setDescripcion(descripcion4);
		listaSolicitud.add(tipoSolicitud4);
		
		DTOTipoSolicitud tipoSolicitud5=new DTOTipoSolicitud(); 
		String tipo5="Solicitud de avisos para actualización del padrón y directorio...";
		String tipoCompleto5="Solicitud de avisos para actualización del padrón y directorio de donatarias autorizadas para recibir donativos deducibles";
		String descripcion5="5. Es aquella promoción presentada por organizaciones civiles y fideicomisos que solicitan por primera vez la autorización para recibir donativos deducibles del impuesto sobre la renta.";
		tipoSolicitud5.setId(5);
		tipoSolicitud5.setTipo(tipo5);
		tipoSolicitud5.setTipoCompleto(tipoCompleto5);
		tipoSolicitud5.setDescripcion(descripcion5);
		listaSolicitud.add(tipoSolicitud5);
		
		DTOTipoSolicitud tipoSolicitud6=new DTOTipoSolicitud(); 
		String tipo6="Diversas solicitudes relacionadas con la autorización...";
		String tipoCompleto6="Diversas solicitudes relacionadas con la autorización para recibir donativos deducibles de impuesto sobre la renta";
		String descripcion6="6. Es aquella promoción presentada por organizaciones civiles y fideicomisos que solicitan por primera vez la autorización para recibir donativos deducibles del impuesto sobre la renta.";
		tipoSolicitud6.setId(6);
		tipoSolicitud6.setTipo(tipo6);
		tipoSolicitud6.setTipoCompleto(tipoCompleto6);
		tipoSolicitud6.setDescripcion(descripcion6);
		listaSolicitud.add(tipoSolicitud6);
	
		
		DTOTipoSolicitud tipoSolicitud7=new DTOTipoSolicitud(); 
		String tipo7="Solicitud de cumplimiento de requerimiento y autorización condicionada ";
		String tipoCompleto7="Solicitud de cumplimiento de requerimiento y autorización condicionada ";
		String descripcion7="7. Es aquella promoción presentada por organizaciones civiles y fideicomisos que solicitan por primera vez la autorización para recibir donativos deducibles del impuesto sobre la renta.";
		tipoSolicitud7.setId(7);
		tipoSolicitud7.setTipo(tipo7);
		tipoSolicitud7.setTipoCompleto(tipoCompleto7);
		tipoSolicitud7.setDescripcion(descripcion7);
		listaSolicitud.add(tipoSolicitud7);
	
		
		return listaSolicitud;
	}

	@Override
	public StringResponse validaAutorizacion(AutorizacionSolicitud solicitud) {
		StringResponse response=new StringResponse(); 
		if(solicitud.getTipoAutorizacion()==1) {
			response.setResponse("No es el tipo de solicitud que debes presentar, "
					+ "verificar la solicitud que te corresponda");
		}
		else if(solicitud.getTipoAutorizacion()==2) {
			response.setResponse("No es el tipo de solicitud que debes presentar, "
					+ "verifica la solicitud que te corresponda.");
		}
		else if(solicitud.getTipoAutorizacion()==3) {
			response.setResponse("Autorizado");
		}
		
		return response; 
	}

	
	@Override
	public List<DTOActividades> consultaActividades() {
		List<DTOActividades> listaActividades=new ArrayList<DTOActividades>(); 
		DTOActividades actividades1=new DTOActividades(); 
		actividades1.setId(1);
		actividades1.setDescripcion("Asistenciales ");	
		DTOActividades actividades2=new DTOActividades(); 
		actividades2.setId(2);
		actividades2.setDescripcion("Educativas");
		DTOActividades actividades3=new DTOActividades();
		actividades3.setId(3);
		actividades3.setDescripcion("Investigación científica o tecnológica");
		DTOActividades actividades4=new DTOActividades();
		actividades4.setId(4);
		actividades4.setDescripcion("Culturales");
		DTOActividades actividades5=new DTOActividades();
		actividades5.setId(5);
		actividades5.setDescripcion("Becantes");
		DTOActividades actividades6=new DTOActividades();
		actividades6.setId(6);
		actividades6.setDescripcion("Ecológicas");
		DTOActividades actividades7=new DTOActividades(); 
		actividades7.setId(7);
		actividades7.setDescripcion("Reproducción de especies en protección y peligro de extinción");
		DTOActividades actividades8=new DTOActividades(); 
		actividades8.setId(8);
		actividades8.setDescripcion("Apoyo económico de donatarias autorizadas ");
		DTOActividades actividades9=new DTOActividades(); 
		actividades9.setId(9);
		actividades9.setDescripcion("Obras o servicios públicos ");
		DTOActividades actividades10=new DTOActividades(); 
		actividades10.setId(10);
		actividades10.setDescripcion("Bibliotecas privadas con acceso al público en general ");
		DTOActividades actividades11=new DTOActividades(); 
		actividades11.setId(11);
		actividades11.setDescripcion("Museos privados con acceso al público en general ");
		DTOActividades actividades12=new DTOActividades(); 
		actividades12.setId(12);
		actividades12.setDescripcion("Desarrollo social");
		
		listaActividades.add(actividades1);
		listaActividades.add(actividades2);
		listaActividades.add(actividades3);
		listaActividades.add(actividades4);
		listaActividades.add(actividades5);
		listaActividades.add(actividades6);
		listaActividades.add(actividades7);
		listaActividades.add(actividades8);
		listaActividades.add(actividades9);
		listaActividades.add(actividades10);
		listaActividades.add(actividades11);
		listaActividades.add(actividades12);
		
		return listaActividades; 
	}

	@Override
	public List<DTOEstados> consultaEstados() {
		List<DTOEstados> listaEstados=new ArrayList<DTOEstados>(); 
		DTOEstados estado=new DTOEstados(); 
		estado.setId(1);
		estado.setNombre("Aguascaliente");
		listaEstados.add(estado);
		DTOEstados estado2=new DTOEstados(); 
		estado2.setId(2);
		estado2.setNombre("Baja California");
		listaEstados.add(estado2);
		DTOEstados estado3=new DTOEstados(); 
		estado3.setId(3);
		estado3.setNombre("Baja California Sur");
		listaEstados.add(estado3);
		return listaEstados;
	}

	@Override
	public List<DTOMunicipio> consultaMunicipios(String idEstado) {
		List<DTOMunicipio> listaMunicipios=new ArrayList<DTOMunicipio>(); 
		
		if(idEstado.equals("1")) {
			DTOMunicipio municipio=new DTOMunicipio(); 
			municipio.setId(1);
			municipio.setNombre("El Llano");
			listaMunicipios.add(municipio);
		}
		else if(idEstado.equals("2")) {
			DTOMunicipio municipio=new DTOMunicipio(); 
			municipio.setId(1);
			municipio.setNombre("Tecate");
			listaMunicipios.add(municipio);
			
		}else if(idEstado.equals("3")) {
			DTOMunicipio municipio=new DTOMunicipio(); 
			municipio.setId(1);
			municipio.setNombre("Ensenada");
			listaMunicipios.add(municipio);
			
		}
		
		
		return listaMunicipios; 
	}

	@Override
	public List<DTOCodigoPostal> consultaCodigoPostal(String idMunicipio) {
		List<DTOCodigoPostal> listaCodigos=new ArrayList<DTOCodigoPostal>(); 
			if(idMunicipio.equals("1")) {	
				DTOCodigoPostal cp=new DTOCodigoPostal(); 
				cp.setId(1);
				cp.setNombre("56610");
				DTOCodigoPostal cp2=new DTOCodigoPostal(); 
				cp2.setId(2);
				cp2.setNombre("03810");
				DTOCodigoPostal cp3=new DTOCodigoPostal(); 
				cp3.setId(3);
				cp3.setNombre("05610");
				DTOCodigoPostal cp4=new DTOCodigoPostal(); 
				cp4.setId(4);
				cp4.setNombre("12345");
				listaCodigos.add(cp);
				listaCodigos.add(cp2);
				listaCodigos.add(cp3);
				listaCodigos.add(cp4);
			}
			else {
				DTOCodigoPostal cp=new DTOCodigoPostal(); 
				cp.setId(1);
				cp.setNombre("12222");
				DTOCodigoPostal cp2=new DTOCodigoPostal(); 
				cp2.setId(2);
				cp2.setNombre("4444");
				DTOCodigoPostal cp3=new DTOCodigoPostal(); 
				cp3.setId(3);
				cp3.setNombre("34444");
				DTOCodigoPostal cp4=new DTOCodigoPostal(); 
				cp4.setId(4);
				cp4.setNombre("12345");
				listaCodigos.add(cp);
				listaCodigos.add(cp2);
				listaCodigos.add(cp3);
				listaCodigos.add(cp4);
			}
			
			return listaCodigos;
	}

	

}

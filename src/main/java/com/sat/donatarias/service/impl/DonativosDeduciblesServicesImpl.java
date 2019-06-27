package com.sat.donatarias.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sat.donatarias.bean.AutorizacionSolicitud;
import com.sat.donatarias.bean.ContribuyenteAmpliado;
import com.sat.donatarias.bean.RespuestaSolicitud;
import com.sat.donatarias.bean.SolicitudDonativos;
import com.sat.donatarias.bean.StringResponse;
import com.sat.donatarias.dao.DonativosDeduciblesDao;
import com.sat.donatarias.model.DTOActividades;
import com.sat.donatarias.model.DTOCodigoPostal;
import com.sat.donatarias.model.DTOEstados;
import com.sat.donatarias.model.DTOMunicipio;
import com.sat.donatarias.model.DTOTipoSolicitud;
import com.sat.donatarias.service.DonativosDeduciblesService;

@Service
public class DonativosDeduciblesServicesImpl implements DonativosDeduciblesService {

	@Autowired
	DonativosDeduciblesDao daoDonativosDeducibles; 
	
	
	@Override
	public ContribuyenteAmpliado validaUsuarioRfcAmpliado(String rfc) {
		return daoDonativosDeducibles.validaUsuarioRfcAmpliado(rfc); 
	}

	
	
	@Override
	public RespuestaSolicitud guardaSolicitudDonativos(SolicitudDonativos objSolicitudDonativos) {
		 return daoDonativosDeducibles.guardaSolicitudDonativos(objSolicitudDonativos); 
	}


	
	@Override
	public List<DTOTipoSolicitud> consultaTipoSolicitud() {
		return daoDonativosDeducibles.consultaTipoSolicitud(); 
	}



	@Override
	public StringResponse validaAutorizacion(AutorizacionSolicitud solicitud) {
		return daoDonativosDeducibles.validaAutorizacion(solicitud);
	}



	@Override
	public List<DTOActividades> consultaActividades() {
		return daoDonativosDeducibles.consultaActividades(); 
	}





	@Override
	public List<DTOMunicipio> consultaMunicipios(String idEstado) {
		return daoDonativosDeducibles.consultaMunicipios(idEstado);
	}



	@Override
	public List<DTOCodigoPostal> consultaCodigoPostal(String idMunicipio) {
		return daoDonativosDeducibles.consultaCodigoPostal(idMunicipio);
	}



	@Override
	public List<DTOEstados> consultaEstados() {
		return daoDonativosDeducibles.consultaEstados();
	}



	
}

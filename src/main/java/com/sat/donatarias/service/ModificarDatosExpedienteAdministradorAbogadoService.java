package com.sat.donatarias.service;

import java.util.List;

import com.sat.donatarias.bean.ModificarDatosExpedienteAdministradorAbogadoBean;


public interface ModificarDatosExpedienteAdministradorAbogadoService {

	List<ModificarDatosExpedienteAdministradorAbogadoBean> obtenerListAdministradorAbogado(ModificarDatosExpedienteAdministradorAbogadoBean expedienteAdministradorAbogado);
	
	List<ModificarDatosExpedienteAdministradorAbogadoBean> buscarDatosExpediente (ModificarDatosExpedienteAdministradorAbogadoBean administradorAbogado);
}

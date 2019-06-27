package com.sat.donatarias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sat.donatarias.bean.ModificarDatosExpedienteAdministradorAbogadoBean;
import com.sat.donatarias.service.ModificarDatosExpedienteAdministradorAbogadoService;

@RestController
@RequestMapping("/modificarDatosExpedienteAdministradorAbogado")
public class ModificarDatosExpedienteAdministradorAbogadoController {
	
	
	@Autowired 
	ModificarDatosExpedienteAdministradorAbogadoService  expedienteAdministradorAbogadoService;
	
	@PostMapping("/obtenerDatosAdminAbogado")		
	public List<ModificarDatosExpedienteAdministradorAbogadoBean> obtenerListaExpediente(@RequestBody ModificarDatosExpedienteAdministradorAbogadoBean bean){
		List<ModificarDatosExpedienteAdministradorAbogadoBean> list =  expedienteAdministradorAbogadoService.obtenerListAdministradorAbogado(bean);
		return list;
	}	
	
	@PostMapping("/tablaDatosAdminAbogado")	
	public List<ModificarDatosExpedienteAdministradorAbogadoBean> buscarDatosExpediente(@RequestBody
			ModificarDatosExpedienteAdministradorAbogadoBean administradorAbogado) {
		List<ModificarDatosExpedienteAdministradorAbogadoBean> lista = expedienteAdministradorAbogadoService.buscarDatosExpediente(administradorAbogado);
		return lista;
	}

}

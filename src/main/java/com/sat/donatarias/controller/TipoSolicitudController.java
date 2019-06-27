package com.sat.donatarias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sat.donatarias.model.TipoSolicitud;
import com.sat.donatarias.service.TipoSolicitudService;

@RestController
@RequestMapping("/tipoSolicitud")
public class TipoSolicitudController {
	
	@Autowired
	TipoSolicitudService tipoSolicitudService;
	
	@GetMapping("/obtenListaTipoSolicitud")
	public List<TipoSolicitud> obtenListaTipoSolicitud() {
		List<TipoSolicitud> lstTipoSolicitud = tipoSolicitudService.obtenListaTipoSolicitud();
		return lstTipoSolicitud;
	}
	
	@PostMapping("/insertaTipoSolicitud")
	public void insertaTipoSolicitud(@RequestBody TipoSolicitud tipoSolicitud) {
		tipoSolicitudService.insertaTipoSolicitud(tipoSolicitud);
	}
	
	@PutMapping("/modificarTipoSolicitud")
	public void modificarTipoSolicitud(@RequestBody TipoSolicitud tipoSolicitud) {
		tipoSolicitudService.modificarTipoSolicitud(tipoSolicitud);
	}
	
	@DeleteMapping("/eliminarTipoSolicitud")
	public void eliminarTipoSolicitud(@RequestBody TipoSolicitud tipoSolicitud) {
		tipoSolicitudService.eliminarTipoSolicitud(tipoSolicitud);
	}

}

package com.sat.donatarias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sat.donatarias.bean.SolicitudBean;
import com.sat.donatarias.bean.TablaBusquedaAtenderSolicitudAbogadoBean;
import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.model.CtEstadoProcesal;
import com.sat.donatarias.model.EstadoProcesal;
import com.sat.donatarias.model.TipoSolicitud;
import com.sat.donatarias.repository.CtEstadoProcesalRepository;
import com.sat.donatarias.service.AtencionSolicitudesAbogadoService;
import com.sat.donatarias.service.EstadoProcesalService;
import com.sat.donatarias.service.TipoSolicitudService;

@CrossOrigin
@RestController
@RequestMapping("/bandejaSeguimientoAsuntos")
public class BandejaSeguimientoAsuntosController {

	@Autowired
	TipoSolicitudService tipoSolicitudService;

	@Autowired
	EstadoProcesalService estadoProcesalService;
	
	@Autowired
	AtencionSolicitudesAbogadoService atencionSolicitudesAbogadoService;
		
	@GetMapping("/obtenListaTipoSolicitud")
	public List<TipoSolicitud> obtenListaTipoSolicitud() {
		List<TipoSolicitud> lstTipoSolicitud = tipoSolicitudService.obtenListaTipoSolicitud();
		return lstTipoSolicitud;
	}

	@GetMapping("/obtenListaEstadoProcesal")
	public List<EstadoProcesal> obtenListaEstadoProcesal() {
		List<EstadoProcesal> listaEstadoProcesal = estadoProcesalService.obtenListaEstadoProcesal();
		return listaEstadoProcesal;
	}

	@PostMapping("/buscar")
	public List<TablaBusquedaAtenderSolicitudAbogadoBean> buscar(@RequestBody TipoSolicitudBean tipoSolicitudBean) {
		List<TablaBusquedaAtenderSolicitudAbogadoBean> lista = atencionSolicitudesAbogadoService.buscar(tipoSolicitudBean);
		return lista;
	}

	@PostMapping("/consultarSolicitud")
	public SolicitudBean consultarSolicitud(@RequestBody TablaBusquedaAtenderSolicitudAbogadoBean tablaBusquedaAtenderSolicitudAbogado) {
		SolicitudBean solicitudBean = atencionSolicitudesAbogadoService.consultarDatosSolicitud(tablaBusquedaAtenderSolicitudAbogado);
		return solicitudBean;
	}
				
}

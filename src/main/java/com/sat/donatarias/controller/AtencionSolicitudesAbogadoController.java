package com.sat.donatarias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
import com.sat.donatarias.bean.DatosSolicitudBean;
import com.sat.donatarias.bean.TablaBusquedaAtenderSolicitudAbogado;
import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.model.AdministradorFirma;
import com.sat.donatarias.model.DocumentoResolucion;
import com.sat.donatarias.model.EstadoProcesal;
import com.sat.donatarias.model.TipoSolicitud;
import com.sat.donatarias.service.AdministradorFirmaService;
import com.sat.donatarias.service.AtencionSolicitudesAbogadoService;
import com.sat.donatarias.service.DocumentoResolucionService;*/
import com.sat.donatarias.service.EstadoProcesalService;
import com.sat.donatarias.service.TipoSolicitudService;


@RestController
@RequestMapping("/atencionSolicitudesAbogado")
public class AtencionSolicitudesAbogadoController {

	@Autowired
	TipoSolicitudService tipoSolicitudService;

	@Autowired
	EstadoProcesalService estadoProcesalService;
	/*	
	@Autowired
	AtencionSolicitudesAbogadoService atencionSolicitudesAbogadoService;
	
	@Autowired
	DocumentoResolucionService documentoResolucionService;
	
	@Autowired
	AdministradorFirmaService administradorFirmaService;
	
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

	@GetMapping("/obtenListaDocumentoResolucion")
	public List<DocumentoResolucion> obtenListaDocumentoResolucion() {
		List<DocumentoResolucion> listaDocumentoResolucion = documentoResolucionService.obtenListaDocumentoResolucion();
		return listaDocumentoResolucion;
	}
	
	@GetMapping("/obtenListaAdministradorFirma")
	public List<AdministradorFirma> obtenListaAdministradorFirma() {
		List<AdministradorFirma> listaAdministradorFirma = administradorFirmaService.obtenListaAdministradorFirma();
		return listaAdministradorFirma;
	}
	
	@PostMapping("/buscar")
	public List<TablaBusquedaAtenderSolicitudAbogado> buscar(@RequestBody TipoSolicitudBean tipoSolicitudBean) {
		List<TablaBusquedaAtenderSolicitudAbogado> lista = atencionSolicitudesAbogadoService.buscar(tipoSolicitudBean);
		return lista;
	}
	
	@PostMapping("/consultarSolicitud")
	public List<DatosSolicitudBean> consultarSolicitud(@RequestBody TablaBusquedaAtenderSolicitudAbogado tablaBusquedaAtenderSolicitudAbogado) {
		List<DatosSolicitudBean> lista = atencionSolicitudesAbogadoService.consultarDatosSolicitud(tablaBusquedaAtenderSolicitudAbogado);
		return lista;
	}*/
	
}

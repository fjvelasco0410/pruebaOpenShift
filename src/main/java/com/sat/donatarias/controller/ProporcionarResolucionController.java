package com.sat.donatarias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sat.donatarias.bean.TipoSolicitudBean;
import com.sat.donatarias.model.AdministradorFirma;
import com.sat.donatarias.model.DocumentoResolucion;
import com.sat.donatarias.model.Documentos;
import com.sat.donatarias.service.AdministradorFirmaService;
import com.sat.donatarias.service.DocumentoResolucionService;
import com.sat.donatarias.service.DocumentosServices;
import com.sat.donatarias.service.ProporcionarResolucionService;
import com.sat.donatarias.util.ConstantesUtil;

@RestController
@RequestMapping("/proporcionarResolucion")
public final class ProporcionarResolucionController {	

	@Autowired
	DocumentosServices documentosServices;

	@Autowired
	DocumentoResolucionService documentoResolucionService;
	
	@Autowired
	AdministradorFirmaService administradorFirmaService;
	
	@Autowired
	ProporcionarResolucionService proporcionarResolucionService;
			
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
	
	@GetMapping("/obtenerListaDocumentos")
	public List<Documentos> obtenerListaDocumentos(@RequestBody TipoSolicitudBean tipoSolicitudBean){
		List<Documentos> listaDocumentos = documentosServices.obtenListaDocumento(tipoSolicitudBean);
		return listaDocumentos;
	}

	@PostMapping("/modificaTipoSolicitud")
	public String modificaTipoSolicitud(@RequestBody Documentos documentos){
		boolean es =  proporcionarResolucionService.modificaTipoSolicitud(documentos);
		String msj = es ? ConstantesUtil.MSJ_ATENCION_SOLICITUD_ABOGADO_SIETE : ConstantesUtil.MSJ_ATENCION_SOLICITUD_ABOGADO_OCHO;
		return msj;
	}

	@PostMapping("/imprimir")
	public void imprimir(Documentos documentos){
	}	

	@PostMapping("/guardar")
	public String guardar(Documentos documentos){
		return ConstantesUtil.MSJ_ATENCION_SOLICITUD_ABOGADO_SEIS;
	}

	@PostMapping("/enviarFirma")
	public String enviarFirma(Documentos documentos){
		boolean es =  proporcionarResolucionService.enviarFirma();
		String msj = es ? ConstantesUtil.MSJ_ATENCION_SOLICITUD_ABOGADO_UNO : ConstantesUtil.MSJ_ATENCION_SOLICITUD_ABOGADO_OCHO;
		return msj;
	}

}

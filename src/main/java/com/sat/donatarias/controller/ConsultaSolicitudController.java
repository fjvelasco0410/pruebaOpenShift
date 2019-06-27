package com.sat.donatarias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultaSolicitud")
public class ConsultaSolicitudController {
	
	@GetMapping("/datosContribuyente")
	public void datosContribuyente() {
		
	}
	
	@GetMapping("/datosSolicitud")
	public void datosSolicitud() {
		
	}
	
	@GetMapping("/documentosAcuses")
	public void documentosAcuses() {
		
	}

}

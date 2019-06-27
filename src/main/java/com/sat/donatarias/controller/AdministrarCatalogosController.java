package com.sat.donatarias.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sat.donatarias.bean.AdministrarCatalogosBean;
import com.sat.donatarias.bean.IngresaEmpleado;
import com.sat.donatarias.bean.RespuestaSolicitud;
import com.sat.donatarias.bean.SolicitudDonativos;
import com.sat.donatarias.bean.StringResponse;
import com.sat.donatarias.model.AdministrarCatalogos;
import com.sat.donatarias.model.BuscarEmpleado;
import com.sat.donatarias.model.EmpleadoDatos;
import com.sat.donatarias.model.TareasPendientes;
import com.sat.donatarias.service.AdministrarCatalogosService;

@CrossOrigin
@RestController
@RequestMapping("/AdministrarCatalogos")

public class AdministrarCatalogosController {

	@Autowired
	AdministrarCatalogosService administrarCatalogosService;
	

	@GetMapping("/Solicitudes")
	public List<AdministrarCatalogos> consultaCatalogo(){
		return administrarCatalogosService.consultaCatalogo();
	}
	
	@GetMapping("/infoTransparencia")
	public List<AdministrarCatalogos> infoTransparenia(){
		return administrarCatalogosService.infoTransparencia();
	}
	
	@GetMapping("/sDonativos")
	public List<AdministrarCatalogos> sDonativos(){
		return administrarCatalogosService.sDonativos();
	}
	
	@GetMapping("/Transparencia")
	public List<AdministrarCatalogos> transparencia(){
		return administrarCatalogosService.transparencia();
	}
	
	@GetMapping("/Donatarias")
	public List<AdministrarCatalogos> donatarias(){
		return administrarCatalogosService.donatarias();
	}
	
	@GetMapping("/Actividades")
	public List<AdministrarCatalogos> actividades(){
		return administrarCatalogosService.actividades();
	}
	
	@GetMapping("/validarEmpleado")
	public EmpleadoDatos insertarEmpleado(@RequestBody IngresaEmpleado empleado) {
		return administrarCatalogosService.insertarEmpleado(empleado); 
	}
	
	@GetMapping("/Permisos")
	public List<AdministrarCatalogos> permisos(){
		return administrarCatalogosService.permisos();
	}
	
	@GetMapping("/tareasPendientes")
	public List<TareasPendientes> tarea(@RequestBody EmpleadoDatos empleado) {
		return administrarCatalogosService.tareas(empleado); 
	}
	
	@GetMapping("/buscarEmpleado")
	public List<BuscarEmpleado> abogados(@RequestBody EmpleadoDatos empleado) {
		return administrarCatalogosService.abogados(empleado); 
	}
	
	
	@PostMapping("/modificaciones")
	public StringResponse guardaSolicitudDonativos(@RequestParam ("nombre") String nombre) {
		return administrarCatalogosService.modificar(nombre);
	}
}
